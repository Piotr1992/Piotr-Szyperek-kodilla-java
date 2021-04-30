


create table STATS (
    STAT_ID INT(11) AUTO_INCREMENT PRIMARY KEY,
    STAT_DATE DATETIME NOT NULL,
    STAT VARCHAR(20) NOT NULL,
    VALUE INT(11) NOT NULL
);



create view BESTSELLERS_COUNT as
select count(*) as counter_bestsellers from books where BESTSELLER=1;



USE KODILLA_COURSE;

DELIMITER $$

CREATE EVENT UPDATE_BESTSELLERS
    ON SCHEDULE EVERY 1 MINUTE
    DO
        BEGIN
            CALL UpdateBestsellers();
            insert into STATS(STAT_DATE, STAT, VALUE)
            values(CURTIME(), 'BESTSELLERS', (select counter_bestsellers from BESTSELLERS_COUNT));
        END $$

DELIMITER ;
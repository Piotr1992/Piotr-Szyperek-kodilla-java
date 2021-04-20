
package com.kodilla.hibernate.manytomany.facade.api;

public class SearchProcessingException extends Exception {

    public static String ERR_FOUND_COMPANY = "There are no registered companies in the database!";
    public static String ERR_FOUND_EMPLOYEE = "There are no registered employees in the database!";

    public SearchProcessingException(String message) {
        super(message);
    }
}
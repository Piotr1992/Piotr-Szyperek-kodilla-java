package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class ComEmpServiceTestSuite {

//    @Autowired
//    private ComEmpService comEmpService;

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;


    @Test
    void testLastName() {

        //Given
        Employee johnSmith = new Employee("John", "Kowalski");
        Employee stephanieClarckson = new Employee("Stephanie", "Wolska");
        Employee lindaKovalsky = new Employee("Linda", "Nowak");

/*        Company listEmployees = new Company("TradeCompany");

        listEmployees.getEmployees().add(johnSmith);
        listEmployees.getEmployees().add(stephanieClarckson);
        listEmployees.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(listEmployees);
        stephanieClarckson.getCompanies().add(listEmployees);
        lindaKovalsky.getCompanies().add(listEmployees);                */

/*        employeeDao.retrieveLastName2(johnSmith.getLastname());
        employeeDao.retrieveLastName2(stephanieClarckson.getLastname());
        employeeDao.retrieveLastName2(lindaKovalsky.getLastname());             */

        employeeDao.deleteAll();
        //When
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        List<Employee> searchLastNameEmployee = employeeDao.retrieveSubStringLastName("lsk");

//        System.out.println(" -> " + searchLastNameEmployee.size());

        System.out.println(searchLastNameEmployee.get(0).getLastname());
        System.out.println(searchLastNameEmployee.get(1).getLastname());
//        System.out.println(searchLastNameEmployee.get(2).getLastname());

/*        //Then
        try {
            Assertions.assertEquals(2, searchLastNameEmployee.size());
        } finally {
            //CleanUp
            employeeDao.delete(johnSmith);
            employeeDao.delete(stephanieClarckson);
            employeeDao.delete(lindaKovalsky);
        }           */
    }

    @Test
    public void testCompanyName() {
        //Given
        Company firstCompany = new Company("First");
        Company secondCompany = new Company("Second");
        Company thirdCompany = new Company("Third");

/*        Employee listCompany = new Employee("name of employee", "surname of employee");

        listCompany.getCompanies().add(firstCompany);
        listCompany.getCompanies().add(secondCompany);
        listCompany.getCompanies().add(thirdCompany);

        firstCompany.getEmployees().add(listCompany);
        secondCompany.getEmployees().add(listCompany);
        thirdCompany.getEmployees().add(listCompany);                   */

        companyDao.deleteAll();
        //When
        companyDao.save(firstCompany);
        companyDao.save(secondCompany);
        companyDao.save(thirdCompany);
        List<Company> searchNameCompany = companyDao.retrieveCompanyName("ir");

        System.out.println(searchNameCompany.get(0).getName());
        System.out.println(searchNameCompany.get(1).getName());
//        System.out.println(searchNameCompany.get(2).getName());

/*        //Then
        try {
            Assertions.assertEquals(2, searchNameCompany.size());
        } finally {
            //CleanUp
            companyDao.delete(firstCompany);
            companyDao.delete(secondCompany);
            companyDao.delete(thirdCompany);
        }           */
    }


}

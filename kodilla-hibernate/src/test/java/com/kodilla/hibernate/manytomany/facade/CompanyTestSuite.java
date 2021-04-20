package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@SpringBootTest
public class CompanyTestSuite {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private EmployeeService employeeService;

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

        Company listEmployees = new Company("TradeCompany");

        listEmployees.getEmployees().add(johnSmith);
        listEmployees.getEmployees().add(stephanieClarckson);
        listEmployees.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(listEmployees);
        stephanieClarckson.getCompanies().add(listEmployees);
        lindaKovalsky.getCompanies().add(listEmployees);

        //When
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);

        List<Employee> searchLastNameEmployee = employeeDao.retrieveSubStringLastName("lsk");

        //Then
        try {
            Assertions.assertEquals(2, searchLastNameEmployee.size());
        } finally {
            //CleanUp
            employeeDao.delete(johnSmith);
            employeeDao.delete(stephanieClarckson);
            employeeDao.delete(lindaKovalsky);
        }

    }



    @Test
    public void testCompanyName() {

        //Given
        Company firstCompany = new Company("One");
        Company secondCompany = new Company("Second");
        Company thirdCompany = new Company("Third");

        Employee listCompany = new Employee("name of employee", "surname of employee");

        listCompany.getCompanies().add(firstCompany);
        listCompany.getCompanies().add(secondCompany);
        listCompany.getCompanies().add(thirdCompany);

        firstCompany.getEmployees().add(listCompany);
        secondCompany.getEmployees().add(listCompany);
        thirdCompany.getEmployees().add(listCompany);

        //When
        companyDao.save(firstCompany);
        companyDao.save(secondCompany);
        companyDao.save(thirdCompany);
        List<Company> searchNameCompany = companyDao.retrieveCompanyName("ir");

        //Then
        try {
            Assertions.assertEquals(1, searchNameCompany.size());
        } finally {
            //CleanUp
            companyDao.delete(firstCompany);
            companyDao.delete(secondCompany);
            companyDao.delete(thirdCompany);
        }
    }



    @Test
    public void testShopServiceSubmitOrder() {
        List<Company> helpListCompany = new ArrayList<>();
        helpListCompany.add(new Company("One"));
        helpListCompany.add(new Company("Second"));
        helpListCompany.add(new Company("Third"));

        List<Employee> helpListEmployee = new ArrayList<>();
        helpListEmployee.add(new Employee("John", "Kowalski"));
        helpListEmployee.add(new Employee("Stephanie", "Wolska"));
        helpListEmployee.add(new Employee("Linda", "Nowak"));

        int numberSearchCompany = companyService.searchCompany(helpListCompany, "ir").size();
        int numberSearchEmployee = employeeService.searchEmployee(helpListEmployee, "lsk").size();
        System.out.println("Registering new order, ID: " + numberSearchCompany);
        if (numberSearchCompany > 0) {
            System.out.println("Search Company!");
        } else {
            throw new IllegalStateException("Not found Company!");
        }
        if (numberSearchEmployee > 0) {
            System.out.println("Search Employees!");
        } else {
            System.out.println("Not found Employees!");
        }
    }

}

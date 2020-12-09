package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    //      Task 17.4   -   lastname   -   Employee
    @Test
    public void testEmployeeLastName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

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
        List<Employee> searchLastNameEmployee = employeeDao.retrieveLastName("Clarckson");

        //Then
        try {
            assertEquals(1, searchLastNameEmployee.size());
        } finally {
            //CleanUp
            employeeDao.delete(johnSmith);
            employeeDao.delete(stephanieClarckson);
            employeeDao.delete(lindaKovalsky);
        }
    }

    //      Task 17.4   -   firstly three chars of name   -   Company
    @Test
    public void testCompanyName() {
        //Given
        Company firstCompany = new Company("First");
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
        List<Company> searchNameCompany = companyDao.retrieveFirstlyThreeCharsName("sec");

        //Then
        try {
            assertEquals(46, searchNameCompany.size());
        } finally {
            //CleanUp
            companyDao.delete(firstCompany);
            companyDao.delete(secondCompany);
            companyDao.delete(thirdCompany);
        }
    }


}













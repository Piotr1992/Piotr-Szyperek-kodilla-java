package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;

import java.util.ArrayList;
import java.util.List;

@Service
public final class ComEmpService {

    private final List<Employee> employees = new ArrayList<>();
    private final List<Company> companies = new ArrayList<>();

    public void searchEmployee() {

/*        String maxOrder = employees.stream()
                .filter(e -> e.getLastname().equals("lsk")).toString();                 */

/*        employees.stream()
        .map(m -> m.getLastname())
        .forEach(fe -> System.out.println(fe));         */

//        System.out.println("counter: " + employees.size());

    }

    public void searchCompany() {

/*        Long maxOrder = (long)companies.stream()
                .mapToInt(o -> o.getId())
                .max().orElse(-1);

        System.out.println("counter: " + maxOrder);                 */

        Company company = new Company();

        System.out.println("Company: " + company.getId() + ", " + company.getName());

    }

}

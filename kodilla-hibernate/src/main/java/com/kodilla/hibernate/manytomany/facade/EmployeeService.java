package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    public List<String> searchEmployee(List<Employee> helpList, String fragmentNameEmployee) {

       List<String> nameEmployees;

       nameEmployees = helpList.stream()
            .map(m -> m.getLastname())
            .filter(f -> f.contains(fragmentNameEmployee))
            .collect(Collectors.toList());

        return nameEmployees;

    }

}

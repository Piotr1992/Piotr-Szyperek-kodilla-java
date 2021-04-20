package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyService {

    public List<String> searchCompany(List<Company> helpList, String fragmentNameCompany) {

        List<String> nameCompanies;

        nameCompanies = helpList.stream()
                .map(m -> m.getName())
                .filter(f -> f.contains(fragmentNameCompany))
                .collect(Collectors.toList());

        return nameCompanies;

    }

}

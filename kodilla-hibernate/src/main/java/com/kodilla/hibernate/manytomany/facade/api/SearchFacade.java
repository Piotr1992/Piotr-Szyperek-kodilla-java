package com.kodilla.hibernate.manytomany.facade.api;

import com.kodilla.hibernate.manytomany.facade.CompanyService;
import com.kodilla.hibernate.manytomany.facade.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(SearchFacade.class);
    private final CompanyService companyService;
    private final EmployeeService employeeService;

    @Autowired
    public SearchFacade(CompanyService companyService, EmployeeService employeeService) {
        this.companyService = companyService;
        this.employeeService = employeeService;
    }

    public void processFacade(final String fragmentNameCompany, final String fragmentNameEmployee) throws SearchProcessingException {
        boolean wasError = false;

        try {
            if ( companyService != null ) {
                LOGGER.error(SearchProcessingException.ERR_FOUND_COMPANY);
                wasError = true;
                throw new SearchProcessingException(SearchProcessingException.ERR_FOUND_COMPANY);
            }
            LOGGER.info("Found companies - successfully.");
            if ( employeeService != null ) {
                LOGGER.error(SearchProcessingException.ERR_FOUND_EMPLOYEE);
                wasError = true;
                throw new SearchProcessingException(SearchProcessingException.ERR_FOUND_EMPLOYEE);
            }
            LOGGER.info("Found employees - successfully.");
        } finally {
            if ( wasError ) {
                LOGGER.info("Resignation from looking for companies and employees.");
            }
        }
    }
}
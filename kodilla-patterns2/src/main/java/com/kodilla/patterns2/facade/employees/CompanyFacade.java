package com.kodilla.patterns2.facade.employees;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Company> findCompanyByName(final String companyNameFragment) {
        return companyDao.retrieveCompaniesStartingWith(companyNameFragment);
    }

    public List<Employee> findEmployeeByName(final String employeeNameFragment) {
        return employeeDao.retrieveEmployeeByName(employeeNameFragment);
    }
}

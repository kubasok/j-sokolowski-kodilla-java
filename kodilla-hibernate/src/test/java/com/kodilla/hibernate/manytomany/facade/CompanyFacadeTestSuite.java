package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyFacadeTestSuite {
    @Autowired
    private CompanyFacade companyFacade;

    @Test
    public void testFindCompanyAndEmployeeByName() {
        List<Company> companiesList = companyFacade.findCompanyByName("Sof");
        List<Employee> employeesList = companyFacade.findEmployeeByName("it");
        assertEquals(1, companiesList.size());
        assertEquals(2, employeesList.size());
    }

}
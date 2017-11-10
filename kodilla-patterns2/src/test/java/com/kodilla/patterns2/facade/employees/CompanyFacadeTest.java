package com.kodilla.patterns2.facade.employees;

//import com.kodilla.hibernate.manytomany.Company;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.util.List;

import static org.junit.Assert.*;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class CompanyFacadeTest {
    @Autowired
    private CompanyFacade companyFacade;

//    @Test
//    public void testFindCompanyByName() {
//        List<Company> companyList = companyFacade.findCompanyByName("sof");
//
//        Assert.assertEquals(1, companyList.size());
//
//    }
}
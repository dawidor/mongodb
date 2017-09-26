package com;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SimpleMongoConfig.class)
public class AccountRepositoryTests {

    @Autowired
    AccountRepository repository;

    @Test
    public void readsFirstPageCorrectly() {

        repository.save(new Account("Rafal", "Smith"));

        Account account = repository.findByFirstName("Rafal");

        Assert.assertTrue(account.firstName.equals("Rafal"));
    }
}    
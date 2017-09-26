package com;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AccountRepository extends MongoRepository<Account, String> {

    public Account findByFirstName(String firstName);
    public List<Account> findByLastName(String lastName);

}

package com;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com")
public class SimpleMongoConfig {

    @Bean
    public Mongo mongo() throws Exception {
        return new MongoClient("localhost");
    }

//    private UserCredentials getCredentials() {
//        UserCredentials user = new UserCredentials("xxx", "xxx");
//
//        return user;
//    }
    @Bean
    public MongoTemplate mongoTemplate() throws Exception {
        return new MongoTemplate(mongo(), "rafiraff");
    }
}

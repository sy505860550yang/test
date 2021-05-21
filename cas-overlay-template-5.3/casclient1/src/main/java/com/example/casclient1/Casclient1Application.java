package com.example.casclient1;

import net.unicon.cas.client.configuration.EnableCasClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableCasClient
@SpringBootApplication
public class Casclient1Application {

    public static void main(String[] args) {
        SpringApplication.run(Casclient1Application.class, args);
    }

}

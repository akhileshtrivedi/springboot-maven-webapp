package com.at;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;

/**
 *  Created by Akhilesh Trivedi
 */

@SpringBootApplication
public class WebApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(WebApplication.class, args);
    }

    @PostConstruct
    public void init()
    {
        Logger log = LoggerFactory.getLogger(WebApplication.class);
        log.info("SpringBoot webapp started");
    }

    public String getStatus() {
        return "All is well";
    }
}

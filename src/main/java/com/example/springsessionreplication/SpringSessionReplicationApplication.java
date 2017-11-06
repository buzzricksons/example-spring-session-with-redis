package com.example.springsessionreplication;

import com.config.EmbeddedTomcatConfiguration;
import com.config.SessionConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({EmbeddedTomcatConfiguration.class, SessionConfig.class})
public class SpringSessionReplicationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSessionReplicationApplication.class, args);
    }
}

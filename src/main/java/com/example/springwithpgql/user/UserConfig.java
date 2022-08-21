package com.example.springwithpgql.user;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class UserConfig {
/*    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            User firoz = new User("Firoz Mahmud", LocalDate.of(1994, Month.JULY, 10));
            User alex = new User("Mr. Alex", LocalDate.of(1990, Month.JULY, 10));
            repository.saveAll(List.of(firoz, alex));
        };
    }*/
}

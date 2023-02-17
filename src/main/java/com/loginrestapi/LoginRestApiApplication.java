package com.loginrestapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class LoginRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginRestApiApplication.class, args);
    }


//    @Bean
//    CommandLineRunner commandLineRunner(usersRepository usersRepository){
//        return args ->  {
//            users user1 = new users(
//                    "michalles1",
//                    "michal12",
//                    "Michal",
//                    "Lesniak",
//                    "michales@gmail.com"
//            );
//            users user2 = new users(
//                    "michall",
//                    "michal",
//                    "Michal",
//                    "Les",
//                    "michales@gmail.com"
//            );
//            usersRepository.save(user1);
//            usersRepository.save(user2);
//        };
//    }


}

package com.codehack.springsecurity;

import com.codehack.springsecurity.entity.User;
import com.codehack.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@EnableJpaRepositories
public class SpringSecurityApplication {

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

//    public void initUsers(){
//        List<User> users = Stream.of(
//                new User(101,"user1","password1","user1@gmail.com"),
//                new User(102,"user2","password1","user2@gmail.com"),
//                new User(103,"user3","password1","user3@gmail.com"),
//                new User(104,"user4","password1","user4@gmail.com")
//        ).collect(Collectors.toList());
//
//        userRepository.saveAll(users);
//    }

}

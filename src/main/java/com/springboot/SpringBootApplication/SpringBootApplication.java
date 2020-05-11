package com.springboot.SpringBootApplication;

import com.springboot.Model.User;
import com.springboot.Service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import java.util.Arrays;
import java.util.List;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication implements CommandLineRunner {
    @Autowired
    UserServiceImpl userService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("StartApplication....");
        userInfo();

    }
    private void userInfo() {
        List<User> userList = Arrays.asList(
                new User(1, "Manqasana", "Lepota")
        );

        userList.forEach(user ->
                System.out.println(user.getName() + " " + "entered"));



    }


}

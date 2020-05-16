package com.springboot.Service;

import com.springboot.Model.User;
import com.springboot.Repository.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private FakeRepo fakeRepo;

    private User user;

    @Override
    public void addUser(long id, String name, String surname) {
        fakeRepo.insertUser(id,name,surname);
        System.out.println(user.getName() + " entered");


    }

    @Override
    public void removeUser(long id) {
        fakeRepo.deleteUser(id);
        System.out.println(user.getName() + " removed");

    }

    @Override
    public void getUser(long id) {
        fakeRepo.findUserById(id);
        System.out.println("Hello " + user.getName());

    }
}

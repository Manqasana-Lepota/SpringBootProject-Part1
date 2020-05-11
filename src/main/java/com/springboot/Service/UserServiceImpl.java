package com.springboot.Service;

import com.springboot.Repository.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    FakeRepo fakeRepo;

    @Override
    public void addUser(long id, String name, String surname) {
        fakeRepo.insertUser(1,name,surname);
    }

    @Override
    public void removeUser(long id) {
        fakeRepo.deleteUser(id);

    }

    @Override
    public void getUser(long id) {
        fakeRepo.findUserById(id);

    }
}

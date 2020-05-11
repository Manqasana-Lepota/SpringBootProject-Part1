package com.springboot.Repository;

import com.springboot.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class FakeRepo implements FakeRepoInterface {

    private ArrayList<User> users = new ArrayList<>();

    @Override
    public void insertUser(long id, String name, String surname) {
        users.add(new User(id,name,surname));

    }

    @Override
    public void findUserById(long id) {
        users.get((int) id);

    }

    @Override
    public void deleteUser(long id) {
        users.remove(id);

    }
}

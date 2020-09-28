package org.example.storage;

import org.example.domain.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class InMemoryUserStorage implements UserStorage {
    List<User> users = new ArrayList<>();
    @Override
    public boolean save(User user) {
        if (users.add(user)) {
            return true;
        }
        return false;
    }

    @Override
    public User remove(long id) {
        return null;
    }

    @Override
    public User remove(String login) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public List<User> getByName(String name) {
        return null;
    }

    @Override
    public User getById(long id) {
        return null;
    }

    @Override
    public User getByLogin(String login) {
        return null;
    }

    @Override
    public String updateName(String name, long id) {
        return null;
    }

    @Override
    public String updateLogin(String login, long id) {
        return null;
    }

    @Override
    public String updatePassword(String password, long id) {
        return null;
    }

    @Override
    public boolean contains(long id) {
        return false;
    }

    @Override
    public boolean contains(User user) {
        return false;
    }

    @Override
    public boolean contains(String login) {
        return false;
    }
}

package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Repository
public class UserRepository {
    HashMap<User, List<Authorities>> map = new HashMap<>();

    public UserRepository() {
        User user1 = new User("Петя", "123");
        map.put(user1, Arrays.asList(Authorities.READ, Authorities.WRITE));
    }

    public List<Authorities> getUserAuthorities(String userName, String password) {
        User user = new User(userName, password);
        return map.get(user);
    }
}

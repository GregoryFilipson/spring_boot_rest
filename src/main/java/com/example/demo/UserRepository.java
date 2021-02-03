package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserRepository {
    public List<Authorities> getUserAuthorities(String userName, String password, Authorities authorities) {
        User user = new User(userName, password);
        HashMap<User, Authorities> map = new HashMap<>();
        map.put(user, authorities);
        List<Authorities> list = new ArrayList<>();
        list.add(map.get(user));
        return list;
    }
}

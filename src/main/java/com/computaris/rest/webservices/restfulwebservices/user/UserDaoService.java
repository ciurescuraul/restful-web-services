package com.computaris.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * project: restful-web-services
 * class: UserDaoService
 * created by: rci
 * on 19/10/2020
 */

@Component
public class UserDaoService {

    private static final List<User> users = new ArrayList<>();

    private static int usersCount = 3;

    static {
        users.add(new User(1, "Eva", new Date()));
        users.add(new User(2, "Eric", new Date()));
        users.add(new User(3, "Monica", new Date()));
    }

    public List<User> findAll() {
        return users;
    }


    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++usersCount);
        }
        users.add(user);

        return user;
    }


    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

}

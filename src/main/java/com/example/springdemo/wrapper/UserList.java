package com.example.springdemo.wrapper;

import com.example.springdemo.domain.User;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * Wrapper class to response in REST Service.
 * 
 * @author willes.reis
 */
@Component
public class UserList {

    private final List<User> users;

    public UserList() {
	users = new ArrayList<>(5);
	users.add(new User("John", "Cage", 20));
	users.add(new User("Mark", "Frank", 25));
	users.add(new User("Tom", "Hanz", 30));
	users.add(new User("Bim", "Alston", 35));
	users.add(new User("Oliver", "Tompson", 40));
    }

    public List<User> getUsers() {
	return users;
    }
}

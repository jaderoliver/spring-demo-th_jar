package com.example.springdemo.service;

import com.example.springdemo.wrapper.UserList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Service to provide resources to wherever.
 * 
 * @author willes.reis
 */
@RestController
public class UsuarioService {

    @GetMapping("/users")
    public UserList getUsers() {
	return new UserList();
    }

}

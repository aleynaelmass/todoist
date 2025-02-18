package com.vitelco.todoist.service;


import com.vitelco.todoist.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    //Method Signatures
    boolean login(User user);

    List<User> findAll();

    User save(User user);
    //static Optional<User> findById(Long id){


    //}


    Optional<User> findByEmail(String email);

    Optional<User> findById(Long id);
}

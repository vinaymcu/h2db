package com.app.h2db.service;

import com.app.h2db.entity.UserEntity;
import com.app.h2db.model.User;
import com.app.h2db.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public void saveUser(User user){
        UserEntity u=new UserEntity();
        u.setUserName(user.getUsername());
        userRepository.save(u);
    }
}

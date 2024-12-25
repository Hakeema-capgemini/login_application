//package com.example.loginapp.service;
//
//import java.util.Optional;
//
//import org.springframework.stereotype.Service;
//
//import com.example.loginapp.entity.User;
//import com.example.loginapp.repository.UserRepository;
//@Service
//public class UserServiceImpl implements UserService {
//    private final UserRepository userRepository;
//
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public Optional<User> authenticate(String username, String password) {
//        return userRepository.findByUsernameAndPassword(username, password);
//    }
//
//}

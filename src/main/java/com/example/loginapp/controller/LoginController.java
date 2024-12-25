package com.example.loginapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.loginapp.entity.User;
import com.example.loginapp.repository.UserRepository;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    // Login page
    @GetMapping("/")
    public String showLoginPage() {
        return "login";
    }

    // Handle login authentication
    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) {

        // Find user by username
        User user = userRepository.findByUsername(username);

        // If user exists and password matches
        if (user != null && user.getPassword().equals(password)) {
            // Store user data in the model
            model.addAttribute("user", user);
            return "dashboard";
        }

        // If authentication fails, return to login page
        model.addAttribute("error", "Invalid username or password.");
        return "login";
    }

    // Fetch user data after login
    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        return "dashboard";
    }
}
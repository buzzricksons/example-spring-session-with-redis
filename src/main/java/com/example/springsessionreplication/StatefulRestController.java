package com.example.springsessionreplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class StatefulRestController {
    private static final String KEY = "name";

    @RequestMapping("/login")
    public String start(@RequestParam("name") String name, HttpSession session) {
        session.setAttribute(KEY, name);
        return "login user: " + name + ", (session ID: " + session.getId() + ")";
    }

    @RequestMapping("/")
    public String start(HttpSession session) {
        String name = (String) session.getAttribute(KEY);
        return "current user: " + (name == null ? "guest" : name);
    }

}

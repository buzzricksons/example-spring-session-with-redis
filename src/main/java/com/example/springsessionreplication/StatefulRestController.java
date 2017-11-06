package com.example.springsessionreplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class StatefulRestController {
    private static final String KEY = "name";

    @RequestMapping("/change")
    public String start(@RequestParam("name") String name, HttpSession session) {
        session.setAttribute(KEY, name);
        return "set user: " + name + ", session ID: " + session.getId();
    }

    @RequestMapping("/")
    public String start(HttpSession session) {
        String name = (String) session.getAttribute(KEY);
        if (name == null) {
            return "unset";
        }

        return "current user: " + name;
    }

}

package com.burakkutbay.springkayitgirisuygulamasi.controller;

import com.burakkutbay.springkayitgirisuygulamasi.model.User;
import com.burakkutbay.springkayitgirisuygulamasi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by burakkutbay on 14.02.2019.
 */

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPage(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String saveRegisterPage(@Valid @ModelAttribute("user") User user, BindingResult result, Model model) {
        model.addAttribute("user", user);

        if (result.hasErrors()) {
            return "register";
        } else {
            userService.saveUser(user);

        }
        return "index";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/index")
    public String index2() {
        return "index";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/secure")
    public String secure() {
        return "secure";
    }
}
//https://blog.burakkutbay.com/spring-boot-mvc-uygulama-ornegi-kullanici-kayit-formu-ve-giris-cikis-islemleri.html/
//https://blog.burakkutbay.com/spring-restful-web-servis-crud-uygulama-ornegi.html/
//https://blog.burakkutbay.com/spring-mvc-dersleri-requestmapping-kullanimi.html/
//https://blog.burakkutbay.com/spring-boot-email-uygulama-ornegi.html/
//https://blog.burakkutbay.com/spring-component-service-repository-controller-uygulama-ornegi.html/
//https://blog.burakkutbay.com/spring-dersleri-component-service-repository-controller-anotasyon-kullanimi.html/
//https://blog.burakkutbay.com/spring-boot-dersleri.html/
package com.example.demo.controller;

import java.sql.Date;

import com.example.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class RegisterContoller{
    @Autowired
    UserRepository userRepository;
    @GetMapping ("/index")
    public String index(Model model) {
  
      model.addAttribute("userEntity",userRepository.findAll());
  
        return "page";
    }
  
        @PostMapping ("/save")
        public String testPage(Model model, String username, String password,Integer age,Date brithdate) 
        {
            if (username == null){
                model.addAttribute("username" , username);
            }else{
                UserEntity userEntity = new UserEntity();
                userEntity.setUsername(username);
                userEntity.setPassword(password);
                userEntity.setAge(age);
                userEntity.setBrithdate(brithdate);
                userRepository.save(userEntity);
                System.out.println("username =" + username);

            }
            return "page";
        }
    
}
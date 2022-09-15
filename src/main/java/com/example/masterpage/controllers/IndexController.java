package com.example.masterpage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public  String index(){
        return "index/index";
    }

    @GetMapping("/perfil")
    public  String perfil(Model data){
        data.addAttribute("nombrepagina","Perfil de usuario");
        return "index/perfil";
    }

    @GetMapping("/credito")
    public  String credito(){
        return "index/credito";
    }
}


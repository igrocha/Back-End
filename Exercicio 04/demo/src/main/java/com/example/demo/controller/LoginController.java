package com.example.demo.controller;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LoginController {


    @GetMapping("/autenticar/{nome}/{senha}")
    public String login(@PathVariable("nome") String nome, @PathVariable("senha") String senha) {

        if(nome.equals("igor") && senha.equals("123456"))

    {
        return "login realizado com sucesso";
    }

    return "Erro ao realizar login";
}



}

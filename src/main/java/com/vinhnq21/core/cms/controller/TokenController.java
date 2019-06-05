package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.Token;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("token")
public class TokenController {

    @RequestMapping("/getAllTokens")
    public List<Token> getAllTokens() {
        List<Token> tokens = new ArrayList<>();
        return tokens;
    }

    @RequestMapping("/getSingleToken/")
    public Token getSingleToken() {
        Token token = new Token();
        return token;
    }


    @RequestMapping("/createToken")
    public Token createToken() {
        Token token = new Token();
        return token;
    }

    @RequestMapping("/updateToken")
    public Token updateToken() {
        Token token = new Token();
        return token;
    }

    @RequestMapping("/deleteToken")
    public Token deleteToken() {
        Token token = new Token();
        return token;
    }
}

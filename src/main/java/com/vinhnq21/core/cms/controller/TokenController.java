package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.Token;
import com.vinhnq21.core.cms.entities.Token;
import com.vinhnq21.core.cms.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("token")
public class TokenController {

    @Autowired
    TokenService tokenService;

    @GetMapping("/tokens")
    public List<Token> getAllTokens() {
        return tokenService.getAllToken();
    }

    @GetMapping("/tokens/{tokenId}")
    public Token getSingleToken(@PathVariable int tokenId) {
        return tokenService.getSingleToken(tokenId);
    }


    @PostMapping("/tokens")
    public Token createToken(@RequestBody Token tokenData) {
        return tokenService.insertToken(tokenData);
    }

    @PatchMapping("/tokens")
    public Token updateToken(@RequestBody Token tokenData) {
        return tokenService.updateToken(tokenData);
    }

    @DeleteMapping("/tokens/{tokenId}")
    public Token deleteToken(@PathVariable int tokenId) {
        return tokenService.deleteToken(tokenId);
    }
}

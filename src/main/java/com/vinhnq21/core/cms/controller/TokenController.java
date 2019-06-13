package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.Token;
import com.vinhnq21.core.cms.entities.Token;
import com.vinhnq21.core.cms.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("tokens")
public class TokenController {

    @Autowired
    TokenService tokenService;

    @GetMapping
    public List<Token> getAllTokens() {
        return tokenService.getAllToken();
    }

    @GetMapping("/{tokenId}")
    public Token getSingleToken(@PathVariable int tokenId) {
        return tokenService.getSingleToken(tokenId);
    }


    @PostMapping
    public Token createToken(@RequestBody Token tokenData) {
        return tokenService.insertToken(tokenData);
    }

    @PatchMapping
    public Token updateToken(@RequestBody Token tokenData) {
        return tokenService.updateToken(tokenData);
    }

    @DeleteMapping("/{tokenId}")
    public Token deleteToken(@PathVariable int tokenId) {
        return tokenService.deleteToken(tokenId);
    }
}

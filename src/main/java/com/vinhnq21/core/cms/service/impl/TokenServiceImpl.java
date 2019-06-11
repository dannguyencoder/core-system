package com.vinhnq21.core.cms.service.impl;

import com.vinhnq21.core.cms.entities.Token;
import com.vinhnq21.core.cms.repository.TokenRepository;
import com.vinhnq21.core.cms.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    TokenRepository tokenRepository;

    @Override
    public List<Token> getAllToken() {
        return tokenRepository.findAll();
    }

    @Override
    public Token getSingleToken(int tokenId) {
        Optional<Token> optionalToken = tokenRepository.findById(tokenId);
        if (!optionalToken.isPresent()) {
            throw new RuntimeException("Token not found");
        } else {
            return optionalToken.get();
        }
    }

    @Override
    public Token insertToken(Token tokenData) {

        tokenData.setId(0);

        tokenRepository.save(tokenData);

        return tokenData;
    }

    @Override
    public Token updateToken(Token newTokenDataWithId) {

        Optional<Token> optionalToken = tokenRepository.findById(newTokenDataWithId.getId());

        if (!optionalToken.isPresent()) {
            throw new RuntimeException("Token not found");
        } else {
            tokenRepository.save(newTokenDataWithId);
        }

        return newTokenDataWithId;
    }

    @Override
    public Token deleteToken(int tokenId) {

        Optional<Token> optionalToken = tokenRepository.findById(tokenId);

        if (!optionalToken.isPresent()) {
            throw new RuntimeException("Token not found");
        } else {
            tokenRepository.deleteById(tokenId);
        }

        return optionalToken.get();
    }

}

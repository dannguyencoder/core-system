package com.vinhnq21.core.cms.service;

import com.vinhnq21.core.cms.entities.Token;

import java.util.List;


public interface TokenService {

    List<Token> getAllToken();

    Token getSingleToken(int tokenId);

    Token insertToken(Token tokenData);

    Token updateToken(Token newTokenDataWithId);

    Token deleteToken(int tokenId);

}

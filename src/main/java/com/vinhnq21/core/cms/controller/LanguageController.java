package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.Language;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("language")
public class LanguageController {

    @RequestMapping("/getAllLanguages")
    public List<Language> getAllLanguages() {
        List<Language> languages = new ArrayList<>();
        return languages;
    }

    @RequestMapping("/getSingleLanguage/")
    public Language getSingleLanguage() {
        Language language = new Language();
        return language;
    }


    @RequestMapping("/createLanguage")
    public Language createLanguage() {
        Language language = new Language();
        return language;
    }

    @RequestMapping("/updateLanguage")
    public Language updateLanguage() {
        Language language = new Language();
        return language;
    }

    @RequestMapping("/deleteLanguage")
    public Language deleteLanguage() {
        Language language = new Language();
        return language;
    }
}

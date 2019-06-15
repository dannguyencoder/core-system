package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.domain.LanguageDomain;
import com.vinhnq21.core.cms.entities.Language;
import com.vinhnq21.core.cms.entities.Language;
import com.vinhnq21.core.cms.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("languages")
public class LanguageController {

    @Autowired
    LanguageService languageService;

    @GetMapping
    public List<LanguageDomain> getAllLanguages() {
        return languageService.getAllLanguage();
    }

    @GetMapping("/{languageId}")
    public Language getSingleLanguage(@PathVariable int languageId) {
        return languageService.getSingleLanguage(languageId);
    }


    @PostMapping
    public Language createLanguage(@RequestBody Language languageData) {
        return languageService.insertLanguage(languageData);
    }

    @PatchMapping
    public Language updateLanguage(@RequestBody Language languageData) {
        return languageService.updateLanguage(languageData);
    }

    @DeleteMapping("/{languageId}")
    public Language deleteLanguage(@PathVariable int languageId) {
        return languageService.deleteLanguage(languageId);
    }
}

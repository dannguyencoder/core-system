package com.vinhnq21.core.cms.controller;

import com.vinhnq21.core.cms.entities.Language;
import com.vinhnq21.core.cms.entities.Language;
import com.vinhnq21.core.cms.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("language")
public class LanguageController {

    @Autowired
    LanguageService languageService;

    @GetMapping("/languages")
    public List<Language> getAllLanguages() {
        return languageService.getAllLanguage();
    }

    @GetMapping("/languages/{languageId}")
    public Language getSingleLanguage(@PathVariable int languageId) {
        return languageService.getSingleLanguage(languageId);
    }


    @PostMapping("/languages")
    public Language createLanguage(@RequestBody Language languageData) {
        return languageService.insertLanguage(languageData);
    }

    @PatchMapping("/languages")
    public Language updateLanguage(@RequestBody Language languageData) {
        return languageService.updateLanguage(languageData);
    }

    @DeleteMapping("/languages/{languageId}")
    public Language deleteLanguage(@PathVariable int languageId) {
        return languageService.deleteLanguage(languageId);
    }
}

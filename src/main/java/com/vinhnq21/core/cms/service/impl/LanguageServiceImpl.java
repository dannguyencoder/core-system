package com.vinhnq21.core.cms.service.impl;

import com.vinhnq21.core.cms.entities.Language;
import com.vinhnq21.core.cms.repository.LanguageRepository;
import com.vinhnq21.core.cms.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    LanguageRepository languageRepository;

    @Override
    public List<Language> getAllLanguage() {
        return languageRepository.findAll();
    }

    @Override
    public Language getSingleLanguage(int languageId) {
        Optional<Language> optionalLanguage = languageRepository.findById(languageId);
        if (!optionalLanguage.isPresent()) {
            throw new RuntimeException("Language not found");
        } else {
            return optionalLanguage.get();
        }
    }

    @Override
    public Language insertLanguage(Language languageData) {

        languageData.setId(0);

        languageRepository.save(languageData);

        return languageData;
    }

    @Override
    public Language updateLanguage(Language newLanguageDataWithId) {

        Optional<Language> optionalLanguage = languageRepository.findById(newLanguageDataWithId.getId());

        if (!optionalLanguage.isPresent()) {
            throw new RuntimeException("Language not found");
        } else {
            languageRepository.save(newLanguageDataWithId);
        }

        return newLanguageDataWithId;
    }

    @Override
    public Language deleteLanguage(int languageId) {

        Optional<Language> optionalLanguage = languageRepository.findById(languageId);

        if (!optionalLanguage.isPresent()) {
            throw new RuntimeException("Language not found");
        } else {
            languageRepository.deleteById(languageId);
        }

        return optionalLanguage.get();
    }

}

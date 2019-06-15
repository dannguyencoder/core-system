package com.vinhnq21.core.cms.service;

import com.vinhnq21.core.cms.domain.LanguageDomain;
import com.vinhnq21.core.cms.entities.Language;

import java.util.List;


public interface LanguageService {

    List<LanguageDomain> getAllLanguage();

    Language getSingleLanguage(int languageId);

    Language insertLanguage(Language languageData);

    Language updateLanguage(Language newLanguageDataWithId);

    Language deleteLanguage(int languageId);

}

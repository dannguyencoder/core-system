package com.vinhnq21.core.cms.service.impl;

import com.vinhnq21.core.cms.entities.Object;
import com.vinhnq21.core.cms.repository.ObjectRepository;
import com.vinhnq21.core.cms.service.ObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ObjectServiceImpl implements ObjectService {

    @Autowired
    ObjectRepository objectRepository;

    @Override
    public List<Object> getAllObject() {
        return objectRepository.findAll();
    }

    @Override
    public Object getSingleObject(int objectId) {
        Optional<Object> optionalObject = objectRepository.findById(objectId);
        if (!optionalObject.isPresent()) {
            throw new RuntimeException("Object not found");
        } else {
            return optionalObject.get();
        }
    }

    @Override
    public Object insertObject(Object objectData) {

        objectData.setId(0);

        objectRepository.save(objectData);

        return objectData;
    }

    @Override
    public Object updateObject(Object newObjectDataWithId) {

        Optional<Object> optionalObject = objectRepository.findById(newObjectDataWithId.getId());

        if (!optionalObject.isPresent()) {
            throw new RuntimeException("Object not found");
        } else {
            objectRepository.save(newObjectDataWithId);
        }

        return newObjectDataWithId;
    }

    @Override
    public Object deleteObject(int objectId) {

        Optional<Object> optionalObject = objectRepository.findById(objectId);

        if (!optionalObject.isPresent()) {
            throw new RuntimeException("Object not found");
        } else {
            objectRepository.deleteById(objectId);
        }

        return optionalObject.get();
    }

}

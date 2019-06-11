package com.vinhnq21.core.cms.service;

import com.vinhnq21.core.cms.entities.Object;

import java.util.List;


public interface ObjectService {

    List<Object> getAllObject();

    Object getSingleObject(int objectId);

    Object insertObject(Object objectData);

    Object updateObject(Object newObjectDataWithId);

    Object deleteObject(int objectId);

}

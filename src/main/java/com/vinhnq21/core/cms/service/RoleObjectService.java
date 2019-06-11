package com.vinhnq21.core.cms.service;

import com.vinhnq21.core.cms.entities.RoleObject;

import java.util.List;


public interface RoleObjectService {

    List<RoleObject> getAllRoleObject();

    RoleObject getSingleRoleObject(int roleObjectId);

    RoleObject insertRoleObject(RoleObject roleObjectData);

    RoleObject updateRoleObject(RoleObject newRoleObjectDataWithId);

    RoleObject deleteRoleObject(int roleObjectId);

}

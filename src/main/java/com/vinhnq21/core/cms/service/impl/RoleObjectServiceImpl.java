package com.vinhnq21.core.cms.service.impl;

import com.vinhnq21.core.cms.entities.RoleObject;
import com.vinhnq21.core.cms.repository.RoleObjectRepository;
import com.vinhnq21.core.cms.service.RoleObjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleObjectServiceImpl implements RoleObjectService {

    @Autowired
    RoleObjectRepository roleObjectRepository;

    @Override
    public List<RoleObject> getAllRoleObject() {
        return roleObjectRepository.findAll();
    }

    @Override
    public RoleObject getSingleRoleObject(int roleObjectId) {
        Optional<RoleObject> optionalRoleObject = roleObjectRepository.findById(roleObjectId);
        if (!optionalRoleObject.isPresent()) {
            throw new RuntimeException("RoleObject not found");
        } else {
            return optionalRoleObject.get();
        }
    }

    @Override
    public RoleObject insertRoleObject(RoleObject roleObjectData) {

        roleObjectData.setRoleId(0);

        roleObjectRepository.save(roleObjectData);

        return roleObjectData;
    }

    @Override
    public RoleObject updateRoleObject(RoleObject newRoleObjectDataWithId) {

        Optional<RoleObject> optionalRoleObject = roleObjectRepository.findById(newRoleObjectDataWithId.getRoleId());

        if (!optionalRoleObject.isPresent()) {
            throw new RuntimeException("RoleObject not found");
        } else {
            roleObjectRepository.save(newRoleObjectDataWithId);
        }

        return newRoleObjectDataWithId;
    }

    @Override
    public RoleObject deleteRoleObject(int roleObjectId) {

        Optional<RoleObject> optionalRoleObject = roleObjectRepository.findById(roleObjectId);

        if (!optionalRoleObject.isPresent()) {
            throw new RuntimeException("RoleObject not found");
        } else {
            roleObjectRepository.deleteById(roleObjectId);
        }

        return optionalRoleObject.get();
    }

}
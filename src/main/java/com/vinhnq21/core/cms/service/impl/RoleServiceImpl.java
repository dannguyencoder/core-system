package com.vinhnq21.core.cms.service.impl;

import com.vinhnq21.core.cms.dto.RoleDTO;
import com.vinhnq21.core.cms.entities.Role;
import com.vinhnq21.core.cms.repository.RoleRepository;
import com.vinhnq21.core.cms.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<RoleDTO> getAllRole() {
        return roleRepository.getRoles();
    }

    @Override
    public Role getSingleRole(int roleId) {
        Optional<Role> optionalRole = roleRepository.findById(roleId);
        if (!optionalRole.isPresent()) {
            throw new RuntimeException("Role not found");
        } else {
            return optionalRole.get();
        }
    }

    @Override
    public Role insertRole(Role roleData) {

        roleData.setId(0);

        roleRepository.save(roleData);

        return roleData;
    }

    @Override
    public Role updateRole(Role newRoleDataWithId) {

        Optional<Role> optionalRole = roleRepository.findById(newRoleDataWithId.getId());

        if (!optionalRole.isPresent()) {
            throw new RuntimeException("Role not found");
        } else {
            roleRepository.save(newRoleDataWithId);
        }

        return newRoleDataWithId;
    }

    @Override
    public Role deleteRole(int roleId) {

        Optional<Role> optionalRole = roleRepository.findById(roleId);

        if (!optionalRole.isPresent()) {
            throw new RuntimeException("Role not found");
        } else {
            roleRepository.deleteById(roleId);
        }

        return optionalRole.get();
    }

}

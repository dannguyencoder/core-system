package com.vinhnq21.core.cms.service;

import com.vinhnq21.core.cms.dto.RoleDTO;
import com.vinhnq21.core.cms.entities.Role;

import java.util.List;


public interface RoleService {

    List<RoleDTO> getAllRole();

    Role getSingleRole(int roleId);

    Role insertRole(Role roleData);

    Role updateRole(Role newRoleDataWithId);

    Role deleteRole(int roleId);

}

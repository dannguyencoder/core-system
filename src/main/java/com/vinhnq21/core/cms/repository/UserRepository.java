package com.vinhnq21.core.cms.repository;

import com.vinhnq21.core.cms.dto.RoleDTO;
import com.vinhnq21.core.cms.dto.UserDTO;
import com.vinhnq21.core.cms.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT NEW com.vinhnq21.core.cms.dto.UserDTO(u.id, u.username, u.password, u.roleId, r.name, u.domainId, d.name, " +
            "u.email, u.isActive, u.isVisible, u.createdAt, u.updatedAt, u.isAdmin, u.token) " +
            "FROM User u " +
            "INNER JOIN Domain d ON u.domainId = d.id " +
            "INNER JOIN Role r ON u.roleId = r.id "
    )
    public List<UserDTO> getUsers();

}

package com.vinhnq21.core.cms.repository;

import com.vinhnq21.core.cms.entities.RoleObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleObjectRepository extends JpaRepository<RoleObject, RoleObject.RoleObjectPk> {

}

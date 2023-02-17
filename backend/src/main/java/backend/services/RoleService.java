package backend.services;

import backend.entities.role.Role;

import java.util.List;
import java.util.Optional;

public interface RoleService {

    Role save (Role role);
    Optional<Role> findById(Long id);
    List<Role> findAll();

    Optional<Role> findByCode(String code);
}

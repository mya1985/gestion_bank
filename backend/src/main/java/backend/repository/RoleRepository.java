package backend.repository;

import backend.entities.role.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<backend.entities.role.Role, Long> {

    Optional<Role> findByCode(String code);
}

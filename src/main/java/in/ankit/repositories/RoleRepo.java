package in.ankit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ankit.entities.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>{

}

package ru.yourbunny.yourbunny.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.yourbunny.yourbunny.models.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}

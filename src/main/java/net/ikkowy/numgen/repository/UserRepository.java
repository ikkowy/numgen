package net.ikkowy.numgen.repository;

import net.ikkowy.numgen.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {}

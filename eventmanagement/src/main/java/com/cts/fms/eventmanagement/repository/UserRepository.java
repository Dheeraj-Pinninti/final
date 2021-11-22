package com.cts.fms.eventmanagement.repository;

import com.cts.fms.eventmanagement.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
}

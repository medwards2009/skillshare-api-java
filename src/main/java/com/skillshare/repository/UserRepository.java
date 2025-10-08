package com.skillshare.repository;

import com.skillshare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // You can add custom query methods here, like:
    // Optional<User> findByEmail(String email);
}

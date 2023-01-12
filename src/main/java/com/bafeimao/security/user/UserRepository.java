package com.bafeimao.security.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @projectName: security
 * @package: com.bafeimao.security.user
 * @className: UserRepository
 * @author: ycd20
 * @description: TODO
 * @date: 2023/1/10 23:17
 * @version: 1.0
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}

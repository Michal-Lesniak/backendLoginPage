package com.loginrestapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usersRepository extends JpaRepository<users, Long> {
    boolean existsUsersByUsernameAndPassword(String username, String password);

}

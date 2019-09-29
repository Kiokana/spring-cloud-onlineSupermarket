package com.onlineSupermarket.authService.repository;

import com.onlineSupermarket.authService.bean.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<MyUser, Long>{
    MyUser findByUsername(String username);
}

package com.auth1.auth.learn.repository;

import com.auth1.auth.learn.models.User;
import org.springframework.stereotype.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}

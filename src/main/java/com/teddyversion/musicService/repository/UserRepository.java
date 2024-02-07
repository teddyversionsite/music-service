package com.teddyversion.musicService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teddyversion.musicService.entity.User;

@Repository
@Transactional(readOnly=true)
public interface UserRepository extends JpaRepository<User, Integer> {
    
}

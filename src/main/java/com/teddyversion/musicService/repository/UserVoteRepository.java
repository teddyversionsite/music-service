package com.teddyversion.musicService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.teddyversion.musicService.entity.UserVote;

@Repository
public interface UserVoteRepository extends JpaRepository<UserVote, Integer> {
    @Query(value="SELECT * FROM user_votes WHERE user_id = ?1", nativeQuery=true)
    List<UserVote> findAllByUserId(int userId);
}

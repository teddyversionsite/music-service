package com.teddyversion.musicService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teddyversion.musicService.entity.UserVote;
import com.teddyversion.musicService.repository.PerformanceRepository;
import com.teddyversion.musicService.repository.UserRepository;
import com.teddyversion.musicService.repository.UserVoteRepository;

@Service
public class UserVoteService {
    @Autowired
    UserVoteRepository userVoteRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PerformanceRepository performanceRepository;

    public List<UserVote> getAllUserVotesForUser(int userId) {
        return userVoteRepository.findAllByUserId(userId);
    }

    public void storeUserVote(int userId, int performanceId) {
        UserVote userVote = UserVote.builder()
            .user(userRepository.getReferenceById(userId))
            .performance(performanceRepository.getReferenceById(performanceId))
            .build();
        userVoteRepository.save(userVote);
    }
}

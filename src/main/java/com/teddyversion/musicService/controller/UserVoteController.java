package com.teddyversion.musicService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teddyversion.musicService.entity.UserVote;
import com.teddyversion.musicService.service.UserVoteService;

@RestController
@RequestMapping("/userVotes")
public class UserVoteController {
    @Autowired
    UserVoteService userVoteService;

    // TODO: this shouldn't be a hardcoded user id, use the authenticated user
    final int HARDCODED_USER_ID = 1;

    @GetMapping("/")
    public List<UserVote> getAllUserVotesByUserId() {
        return userVoteService.getAllUserVotesForUser(HARDCODED_USER_ID);
    }

    @PostMapping("/")
    public void storeUserVote(@RequestParam int performanceId) {
        userVoteService.storeUserVote(HARDCODED_USER_ID, performanceId);
    }
}

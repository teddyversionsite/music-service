package com.teddyversion.musicService.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(value="classpath:application-dev.properties")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserVoteRepositoryTest {
    @Autowired
    SongRepository songRepository;

    @Autowired
    ShowRepository showRepository;

    @Autowired
    PerformanceRepository performanceRepository;

    @Autowired
    UserVoteRepository userVoteRepository;

    @Test
    public void testFindAllByUserIdIgnoresOtherUsers() {
        // TODO: refactor all the data creation into a helper class
        // TODO: need a user repository to make this work too, ugh
    }
}

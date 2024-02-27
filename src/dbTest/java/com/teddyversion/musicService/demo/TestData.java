package com.teddyversion.musicService.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.teddyversion.musicService.entity.Performance;
import com.teddyversion.musicService.entity.Show;
import com.teddyversion.musicService.entity.Song;
import com.teddyversion.musicService.entity.User;
import com.teddyversion.musicService.repository.PerformanceRepository;
import com.teddyversion.musicService.repository.ShowRepository;
import com.teddyversion.musicService.repository.SongRepository;
import com.teddyversion.musicService.repository.UserRepository;
import com.teddyversion.musicService.util.DateTools;

// THIS IS NOT REALLY A TEST
// THIS IS JUST FOR CREATING A BUNCH OF LOCAL DATA
@SpringBootTest
@TestPropertySource(value="classpath:application-dev.properties")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestData {
    @Autowired
    SongRepository songRepository;

    @Autowired
    ShowRepository showRepository;

    @Autowired
    PerformanceRepository performanceRepository;

    @Autowired
    UserRepository userRepository;

    Song moby = Song.builder().id(677).displayName("moby").build();
    Song dragonfly = Song.builder().id(694).displayName("dragonfly").build();
    Song madhuvan = Song.builder().id(512).displayName("madhuvan").build();

    Show lv1 = Show.builder()
            .id(1624331751)
            .showDate(DateTools.stringToDate("2021-06-19"))
            .venue("Legend Valley")
            .city("Thornville")
            .state("OH")
            .build();
    Show lv2 = Show.builder()
            .id(1654952852)
            .showDate(DateTools.stringToDate("2022-06-10"))
            .venue("Legend Valley")
            .city("Thornville")
            .state("OH")
            .build();
    Show missoula = Show.builder()
            .id(1680624228)
            .showDate(DateTools.stringToDate("2023-09-22"))
            .venue("Kettlehouse Amphitheater")
            .city("Bonner")
            .state("MT")
            .build();

    Performance moby1 = Performance.builder().id(1).song(moby).show(lv1).build();
    Performance moby2 = Performance.builder().id(2).song(moby).show(missoula).build();
    Performance dragonfly1 = Performance.builder().id(3).song(dragonfly).show(lv2).build();
    Performance madhuvan1 = Performance.builder().id(4).song(madhuvan).show(lv1).build();
    Performance madhuvan2 = Performance.builder().id(5).song(madhuvan).show(missoula).build();

    User user = User.builder().id(1).build();

    @Test
    public void setupData() {
        songRepository.saveAll(List.of(moby, dragonfly, madhuvan));
        showRepository.saveAll(List.of(lv1, lv2, missoula));
        performanceRepository.saveAll(List.of(moby1, moby2, dragonfly1, madhuvan1, madhuvan2));
        userRepository.save(user);
    }
}

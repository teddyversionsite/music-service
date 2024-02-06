package com.teddyversion.musicService.repository;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.teddyversion.musicService.entity.Performance;
import com.teddyversion.musicService.entity.Show;
import com.teddyversion.musicService.entity.Song;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

@SpringBootTest
@TestPropertySource(value="classpath:application-dev.properties")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PerformanceRespositoryTest {
    @Autowired
    SongRepository songRepository;

    @Autowired
    ShowRepository showRepository;

    @Autowired
    PerformanceRepository performanceRepository;

    private Date stringToDate(String dateString) {
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        try {
            return new Date(df.parse(dateString).getTime());
        } catch (ParseException pe) {
            fail("bad date parsing");
            // should never return because of the fail but whatever
            return new Date(0l);
        }
    }

    Song moby = Song.builder().id(-1).displayName("moby").build();
    Song dragonfly = Song.builder().id(-2).displayName("dragonfly").build();
    Song madhuvan = Song.builder().id(-3).displayName("madhuvan").build();

    Show lv1 = Show.builder()
            .id(-1)
            .showDate(stringToDate("2021-06-19"))
            .venue("Legend Valley")
            .city("Thornville")
            .state("OH")
            .build();
    Show lv2 = Show.builder()
            .id(-2)
            .showDate(stringToDate("2022-06-10"))
            .venue("Legend Valley")
            .city("Thornville")
            .state("OH")
            .build();
    Show missoula = Show.builder()
            .id(-3)
            .showDate(stringToDate("2023-09-22"))
            .venue("Kettlehouse Amphitheater")
            .city("Bonner")
            .state("MT")
            .build();

    Performance moby1 = Performance.builder().id(-1).song(moby).show(lv1).build();
    Performance moby2 = Performance.builder().id(-2).song(moby).show(missoula).build();
    Performance dragonfly1 = Performance.builder().id(-3).song(dragonfly).show(lv2).build();
    Performance madhuvan1 = Performance.builder().id(-4).song(madhuvan).show(lv1).build();
    Performance madhuvan2 =Performance.builder().id(-5).song(madhuvan).show(missoula).build();

    @BeforeAll
    public void setupData() {
        songRepository.saveAll(List.of(moby, dragonfly, madhuvan));
        showRepository.saveAll(List.of(lv1, lv2, missoula));
        performanceRepository.saveAll(List.of(moby1, moby2, dragonfly1, madhuvan1, madhuvan2));
    }

    @AfterAll
    public void cleanupData() {
        performanceRepository.deleteAll(List.of(moby1, moby2, dragonfly1, madhuvan1, madhuvan2));
        songRepository.deleteAll(List.of(moby, dragonfly, madhuvan));
        showRepository.deleteAll(List.of(lv1, lv2, missoula));
    }

    @Test
    public void testDoesFilterOnSongIdWork() {
        int songId = 1;
        List<Performance> allPerformances = performanceRepository.findAll();
        List<Performance> filteredPerformances = performanceRepository.findAllBySongId(songId);

        assertThat(allPerformances).isNotSameAs(filteredPerformances);
        assertThat(allPerformances.size()).isGreaterThan(filteredPerformances.size());
        filteredPerformances.stream().forEach(p -> assertThat(p.getSong().getId() == songId));
        allPerformances.stream().forEach(p -> assertThat(p.getSong().getId() != songId));
    }
}

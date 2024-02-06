package com.teddyversion.musicService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.teddyversion.musicService.entity.Performance;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, Long> {
    @Query(value="SELECT * FROM performances WHERE song_id = ?1", nativeQuery=true)
    List<Performance> findAllBySongId(int song_id);
}

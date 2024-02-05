package com.teddyversion.musicService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teddyversion.musicService.entity.Performance;

@Repository
public interface PerformanceRepository extends JpaRepository<Performance, Long> {
    
}

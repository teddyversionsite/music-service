package com.teddyversion.musicService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teddyversion.musicService.entity.Performance;
import com.teddyversion.musicService.repository.PerformanceRepository;

@Service
public class PerformanceService {
    @Autowired
    PerformanceRepository performanceRepository;

    public List<Performance> getAllPerformances() {
        return performanceRepository.findAll();
    }

    public List<Performance> getAllPerformancesBySong(int song_id) {
        return performanceRepository.findAllBySongId(song_id);
    }
}

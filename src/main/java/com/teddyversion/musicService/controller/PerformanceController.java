package com.teddyversion.musicService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teddyversion.musicService.entity.Performance;
import com.teddyversion.musicService.service.PerformanceService;

@RestController
@RequestMapping("/performances")
public class PerformanceController {
    @Autowired
    PerformanceService performanceService;

    @GetMapping("/")
    public List<Performance> getAllPerformances() {
        return performanceService.getAllPerformances();
    }
}

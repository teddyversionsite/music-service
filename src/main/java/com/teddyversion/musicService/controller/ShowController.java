package com.teddyversion.musicService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teddyversion.musicService.entity.Show;
import com.teddyversion.musicService.service.ShowService;

@RestController
@RequestMapping("/shows")
public class ShowController {
    @Autowired
    ShowService showService;

    @GetMapping("/")
    public List<Show> getAllShows() {
        return showService.getAllShows();
    }
}

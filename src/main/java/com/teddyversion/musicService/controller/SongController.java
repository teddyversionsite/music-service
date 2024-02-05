package com.teddyversion.musicService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teddyversion.musicService.entity.Song;
import com.teddyversion.musicService.service.SongService;

@RestController
@RequestMapping("/songs")
public class SongController {
    @Autowired
    SongService songService;

    @GetMapping("/")
    public List<Song> getSong() {
        return songService.getAllSongs();
    }
}

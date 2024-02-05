package com.teddyversion.musicService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teddyversion.musicService.entity.Song;
import com.teddyversion.musicService.repository.SongRepository;

@Service
public class SongService {
    @Autowired
    SongRepository songRepository;

    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }
}

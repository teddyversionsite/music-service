package com.teddyversion.musicService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teddyversion.musicService.entity.Show;
import com.teddyversion.musicService.repository.ShowRepository;

@Service
public class ShowService {
    @Autowired
    ShowRepository showRepository;

    public List<Show> getAllShows() {
        return showRepository.findAll();
    }
}

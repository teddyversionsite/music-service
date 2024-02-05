package com.teddyversion.musicService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teddyversion.musicService.entity.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

}

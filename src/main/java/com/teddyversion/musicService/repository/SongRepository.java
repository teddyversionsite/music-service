package com.teddyversion.musicService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teddyversion.musicService.entity.Song;

@Repository
@Transactional(readOnly=true)
public interface SongRepository extends JpaRepository<Song, Integer> {

}

package com.teddyversion.musicService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teddyversion.musicService.entity.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {

}

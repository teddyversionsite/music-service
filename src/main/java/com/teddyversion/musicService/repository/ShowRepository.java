package com.teddyversion.musicService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teddyversion.musicService.entity.Show;

@Repository
@Transactional(readOnly=true)
public interface ShowRepository extends JpaRepository<Show, Integer> {

}

package com.teddyversion.musicService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="songs")
public class Song {
    @Id
    private long id;

    private String displayName;   
}

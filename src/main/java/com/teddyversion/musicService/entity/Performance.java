package com.teddyversion.musicService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity(name="performances")
public class Performance {
    @Id
    private long id;

    @OneToOne
    @JoinColumn(name="song_id")
    Song song;

    @OneToOne
    @JoinColumn(name="show_id")
    Show show;
}

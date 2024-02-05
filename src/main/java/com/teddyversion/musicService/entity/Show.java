package com.teddyversion.musicService.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="shows")
public class Show {
    @Id
    private long id;

    private Date show_date;
    private String venue;
    private String city;
    private String state;
    private String country;
}

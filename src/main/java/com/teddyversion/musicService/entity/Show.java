package com.teddyversion.musicService.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor(access=AccessLevel.PACKAGE)
@NoArgsConstructor(access=AccessLevel.PACKAGE)
@Builder
@Getter
@Setter(value=AccessLevel.PACKAGE)
@Entity(name="shows")
public class Show {
    @Id
    private int id;

    private Date showDate;
    private String venue;
    private String city;
    private String state;
    private String country;
}

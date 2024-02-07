package com.teddyversion.musicService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// TODO: temporary until user service is built out
@AllArgsConstructor(access=AccessLevel.PACKAGE)
@NoArgsConstructor(access=AccessLevel.PACKAGE)
@Builder
@Getter
@Setter(value=AccessLevel.PACKAGE)
@Entity(name="users")
public class User {
    @Id
    private int id;
}

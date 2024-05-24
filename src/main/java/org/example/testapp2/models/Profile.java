package org.example.testapp2.models;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "profile")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    long id;
    @Column(name = "user_id")
    long userId;
    @Column(name = "profile_name")
    String profileName;
    @Column(name = "biography")
    String biography;
    @Lob
    @Column(name = "avatar")
    byte[] avatar;
    @Column(name = "birth_date")
    Date birthDate;
}

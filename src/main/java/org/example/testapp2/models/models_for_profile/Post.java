package org.example.testapp2.models.models_for_profile;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long profileId;
    String title;
    @Lob
    byte[] content;
    String description;
    Date createdAt;
}

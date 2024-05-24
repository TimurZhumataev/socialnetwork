package org.example.testapp2.models.models_for_post;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
public class Repost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    long profileId;
    long postId;
    Date createdAt;
}

package org.example.testapp2.models.models_for_profile;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class SavedPosts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long postId;
    long profileId;
}

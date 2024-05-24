package org.example.testapp2.models.models_for_post;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Tags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long postId;
    String tag_text;
}

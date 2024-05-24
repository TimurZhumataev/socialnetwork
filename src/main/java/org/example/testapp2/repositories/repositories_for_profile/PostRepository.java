package org.example.testapp2.repositories.repositories_for_profile;

import org.example.testapp2.models.models_for_profile.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}

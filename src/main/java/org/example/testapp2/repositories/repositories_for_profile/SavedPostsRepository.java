package org.example.testapp2.repositories.repositories_for_profile;

import org.example.testapp2.models.models_for_profile.SavedPosts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavedPostsRepository extends JpaRepository<SavedPosts, Long> {

}

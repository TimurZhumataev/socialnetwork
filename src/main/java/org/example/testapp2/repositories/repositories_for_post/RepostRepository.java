package org.example.testapp2.repositories.repositories_for_post;

import org.example.testapp2.models.models_for_post.Repost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepostRepository extends JpaRepository<Repost, Long> {

}

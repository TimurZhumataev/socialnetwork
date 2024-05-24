package org.example.testapp2.repositories.repositories_for_profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.example.testapp2.models.models_for_profile.Subscriptions;

@Repository
public interface SubscriptionsRepository extends JpaRepository<Subscriptions, Long> {
}

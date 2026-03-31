package com.tabrizgulmammadov.store.repositories;

import com.tabrizgulmammadov.store.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}
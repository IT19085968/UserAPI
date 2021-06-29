package com.userapi.web.repositories;

import java.util.List;

import com.userapi.web.models.Conference;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ConferenceRepository extends MongoRepository<Conference, String> {

    // List<Conference> findByApproved(boolean approved);

    @Query("{approved : ?0}")
    List<Conference> findByApproved(boolean approved);

}

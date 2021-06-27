package com.userapi.web.ReviewerAPI;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReviewerRepository extends MongoRepository<Reviewer, String> {
}

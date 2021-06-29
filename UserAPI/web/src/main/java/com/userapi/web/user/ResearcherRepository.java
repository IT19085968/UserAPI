package com.userapi.web.user;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResearcherRepository extends MongoRepository<Researcher, String> {

}

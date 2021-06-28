package com.userapi.web.user;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WorkshopPresenterRepository extends MongoRepository<WorkshopPresenter, String> {

    List<WorkshopPresenter> findByWorkshopProposalId(String workshopProposalId);

}

package com.userapi.web.ReviewerAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ReviewerService {
    private final ReviewerRepository reviewerRepository;

    @Autowired
    public ReviewerService(ReviewerRepository reviewerRepository) {
        this.reviewerRepository = reviewerRepository;
    }

    public List<Reviewer> getAllReviewers(){
        return reviewerRepository.findAll();
    }

    public void addNewReviewer(Reviewer reviewer){
        reviewerRepository.save(reviewer);
    }
}

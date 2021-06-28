package com.userapi.web.ReviewerAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviewerapi")
@CrossOrigin
public class ReviewerController {

    private final ReviewerService reviewerService;

    @Autowired
    public ReviewerController(ReviewerService reviewerService) {
        this.reviewerService = reviewerService;
    }

    @GetMapping("/")
    public List<Reviewer> getReviewers(){
        return reviewerService.getAllReviewers();
    }

    @PostMapping("/create")
    public void registerNewReviewer(@RequestBody Reviewer reviewer){
        reviewerService.addNewReviewer(reviewer);
    }
}

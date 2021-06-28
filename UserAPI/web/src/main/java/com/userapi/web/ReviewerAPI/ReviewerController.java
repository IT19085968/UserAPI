package com.userapi.web.ReviewerAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.userapi.web.models.ResearchPaper;
import com.userapi.web.models.WorkshopProposal;

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
    public List<Reviewer> getReviewers() {
        return reviewerService.getAllReviewers();
    }

    @GetMapping("/viewAllConferenceResearchPapers")
    public List<ResearchPaper> getResearchPapers() {
        return reviewerService.getAllResearchPapers();
    }

    @GetMapping("/viewCertainWorkshop/{id}")
    public WorkshopProposal getWorkshopById(@PathVariable String id) {
        return reviewerService.getWokshopProposal(id);
    }

    @PostMapping("/create")
    public void registerNewReviewer(@RequestBody Reviewer reviewer) {
        reviewerService.addNewReviewer(reviewer);
    }

    @PostMapping("/approveDeclineConferenceResearchPaper")
    public void approveDeclineResearchPaper(@RequestBody ResearchPaper researchPaper) {
        reviewerService.approveDeclineConferenceResearchPaper(researchPaper);
    }
}

package com.userapi.web.ReviewerAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.userapi.web.models.ResearchPaper;
import com.userapi.web.models.WorkshopProposal;
import com.userapi.web.repositories.ResearchPaperRepository;
import com.userapi.web.repositories.WorkshopRepository;

@Service
public class ReviewerService {
    private final ReviewerRepository reviewerRepository;
    private final ResearchPaperRepository researchPaperRepository;
    private final WorkshopRepository workshopRepository;

    @Autowired
    public ReviewerService(ReviewerRepository reviewerRepository, ResearchPaperRepository researchPaperRepository,
            WorkshopRepository workshopRepository) {
        this.reviewerRepository = reviewerRepository;
        this.researchPaperRepository = researchPaperRepository;
        this.workshopRepository = workshopRepository;
    }

    public List<Reviewer> getAllReviewers() {
        return reviewerRepository.findAll();
    }

    public void addNewReviewer(Reviewer reviewer) {
        reviewerRepository.save(reviewer);
    }

    public void approveDeclineConferenceResearchPaper(ResearchPaper researchPaper) {
        researchPaperRepository.save(researchPaper);
    }

    public List<ResearchPaper> getAllResearchPapers() {
        return researchPaperRepository.findAll();
    }

    public WorkshopProposal getWokshopProposal(String id) {
        return workshopRepository.findById(id).orElse(null);
        // return workshopRepository.findByWorkshopProposalId(id);
    }

    public void approveDeclineWorkshopProposal(WorkshopProposal proposal) {
        workshopRepository.save(proposal);
    }

    public List<WorkshopProposal> getAllWorkshopProposals() {
        return workshopRepository.findAll();
    }

    public ResearchPaper getResearchPaper(String id) {
        return researchPaperRepository.findById(id).orElse(null);
    }
}

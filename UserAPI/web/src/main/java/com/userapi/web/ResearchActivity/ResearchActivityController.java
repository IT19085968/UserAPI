package com.userapi.web.ResearchActivity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userapi/research_activity")
@CrossOrigin
public class ResearchActivityController {

    private final ResearchActivityService researchActivityService;

    @Autowired
    public ResearchActivityController(ResearchActivityService researchActivityService) {
        this.researchActivityService = researchActivityService;
    }

    @GetMapping("/")
    public List<ResearchActivity> getResearchActivities(){
        return researchActivityService.getAllResearchActivities();
    }

    @PostMapping("/")
    public void addNewResearchActivity(@RequestBody ResearchActivity researchActivity){
        researchActivityService.addNewResearchActivity(researchActivity);
    }

}

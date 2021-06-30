package com.userapi.web.AdminAPI;

import com.userapi.web.EditorAPI.Editor;
import com.userapi.web.EditorAPI.EditorService;
import com.userapi.web.ReviewerAPI.Reviewer;
import com.userapi.web.ReviewerAPI.ReviewerService;
import com.userapi.web.models.Activity;
import com.userapi.web.models.EditorChanges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "adminapi")
@CrossOrigin
public class AdminController {
    @Autowired
    AdminService adminService;
    @Autowired
    EditorService editorService;

    @Autowired
    ReviewerService reviewerService;

    @PostMapping("/addEditor")
    public void addEditor(@RequestBody Editor editor) {
        editorService.addNewEditor(editor);

    }

    @PostMapping("/addReviewer")
    public void addReviewer(@RequestBody Reviewer reviewer) {
        reviewerService.addNewReviewer(reviewer);
    }

    @PostMapping("/addAdmin")
    public void addAdmin(@RequestBody Admin admin) {
        adminService.addAdmin(admin);
    }

    @GetMapping(path = "/EditorChangesList")
    public List<EditorChanges> getEditorChangesList() {
        return adminService.getAllEditorChanges();
    }

    @PostMapping("/ApproveDeclineEdit")
    public void approveOrDeclineEdit(@RequestBody EditorChanges editorChanges) {

    }

    @GetMapping(path = "/viewAllActivities")
    public List<Activity> viewAllActivities() {

        return null;
    }

    @GetMapping(path = "/getActivityDetails")
    public Activity getActivityDetails(@RequestParam String id) {

        return null;
    }
}

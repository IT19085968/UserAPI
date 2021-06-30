package com.userapi.web.AdminAPI;


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

    @PostMapping("/addEditor")
    public void addEditor(){

    }
    @PostMapping("/addReviewer")
    public void addReviewer(){

    }
    @PostMapping("/addAdmin")
    public void addAdmin(@RequestBody Admin admin){
        adminService.addAdmin(admin);
    }
    @GetMapping(path = "/EditorChangesList")
    public List<EditorChanges> getEditorChangesList(){
        return adminService.getAllEditorChanges();
    }
    @PostMapping("/ApproveDeclineEdit")
    public void approveOrDeclineEdit(@RequestBody EditorChanges editorChanges){

    }
    @GetMapping(path = "/viewAllActivities")
    public List<Activity> viewAllActivities(){

        return null;
    }

    @GetMapping(path = "/getActivityDetails")
    public Activity getActivityDetails(@RequestParam String id){

        return null;
    }
}

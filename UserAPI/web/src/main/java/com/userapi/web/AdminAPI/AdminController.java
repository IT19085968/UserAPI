package com.userapi.web.AdminAPI;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adminapi")
@CrossOrigin
public class AdminController {
    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/")
    public List<Admin> getAllAdmins(){
        return adminService.getAllAdmins();
    }

    //Register New Admin
    @PostMapping("/create")
    public void addNewAdmin(@RequestBody Admin admin){
        adminService.addNewAdmin(admin);
    }
}

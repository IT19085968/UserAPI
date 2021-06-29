package com.userapi.web.AdminAPI;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<Admin> getAllAdmins(){
        return adminRepository.findAll();
    }

    public void addNewAdmin(Admin admin){
        adminRepository.save(admin);
    }
}


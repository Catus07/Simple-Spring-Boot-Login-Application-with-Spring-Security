package com.example.johnsecurity.service;

import com.example.johnsecurity.model.StaffModel;
import com.example.johnsecurity.repo.StaffRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class StaffService {
    @Autowired
    public StaffRepo staffRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;


    public StaffModel addStaff(StaffModel staffModel) {
        staffModel.setPassword(passwordEncoder.encode(staffModel.getPassword()));
        return staffRepo.save(staffModel);
    }


}


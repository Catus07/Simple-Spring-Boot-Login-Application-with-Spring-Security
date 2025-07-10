package com.example.johnsecurity.controller;

import com.example.johnsecurity.model.StaffModel;
import com.example.johnsecurity.repo.StaffRepo;
import com.example.johnsecurity.service.StaffService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@Tag(name = "staff APIs", description = "this is simple controller")
public class StaffController {
    @Autowired
    public StaffService staffService;

    @GetMapping("/home")
    public String homePage() {
        return "Welcome home!";
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerStaff(@Valid  @RequestBody StaffModel staffModel) {
        staffService.addStaff(staffModel);
        return ResponseEntity.ok("Staff registered successfully.");
    }

    @GetMapping("/staff/{id}")
    public StaffModel  userId(@PathVariable Long id) {
        return staffService.staffRepo.findById(id).orElse(null);

    }

    @GetMapping("/getDetails")
    public List<StaffModel> getDetails(StaffModel staffModel){
        return staffService.staffRepo.findAll();
    }

}

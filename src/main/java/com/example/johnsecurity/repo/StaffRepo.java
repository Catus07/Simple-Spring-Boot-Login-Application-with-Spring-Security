package com.example.johnsecurity.repo;

import com.example.johnsecurity.model.StaffModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StaffRepo extends JpaRepository<StaffModel, Long> {
    StaffModel findByUsername(String username);
}

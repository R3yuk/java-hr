package com.example.demo.View;

import com.example.demo.Model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface viewStaff extends JpaRepository<Staff, Long > {
}

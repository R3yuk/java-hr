package com.example.demo.Controller;

import com.example.demo.Model.Staff;
import com.example.demo.View.viewStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/")

public class StaffController {
    @Autowired
    private com.example.demo.View.viewStaff viewStaff;
            @GetMapping
    public List<Staff> getallStaffs()
            {
                return viewStaff.findAll();
            }
}

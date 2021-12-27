package com.example.demo;

import com.example.demo.Model.Staff;
import com.example.demo.View.viewStaff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private com.example.demo.View.viewStaff viewStaff;

	@Override
	public void run(String... args) throws Exception {
 Staff s1 = new Staff();
 s1.setFirstname("praveeeeeen");
		s1.setLastname("grg");
		viewStaff.save(s1);
	}
}

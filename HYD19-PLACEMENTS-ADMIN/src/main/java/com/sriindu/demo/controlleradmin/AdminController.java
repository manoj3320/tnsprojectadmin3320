package com.sriindu.demo.controlleradmin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sriindu.demo.entityadmin.Admin;
import com.sriindu.demo.serviceadmin.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService A1;
	
	@PostMapping("/admins")
	public Admin saveAdmin(@RequestBody Admin admin) {
		
		return A1.saveAdmin(admin);
	}
	
	@DeleteMapping("/admins/{id}")
    public String deleteAdminById(@PathVariable("id") Long adminId) {
        A1.deleteAdminById(adminId);
        return "Admin deleted Successfully!!";
	}
	
	@GetMapping("/admins")
    public List<Admin> fetchAdminList() {
        //LOGGER.info("Inside fetchAdminList of AdminController");
        return A1.fetchAdminList();
	}
	
	@GetMapping("/admins/{id}")
    public Admin fetchAdminById(@PathVariable("id") Long adminId) {
        
        return A1.fetchAdminById(adminId);
	}
	
	@PutMapping("/admins/{id}")
    public Admin updateAdmin(@PathVariable("id") Long adminId, @RequestBody Admin admin) {
        return A1.updateAdmin(adminId,admin);
	}
}
	

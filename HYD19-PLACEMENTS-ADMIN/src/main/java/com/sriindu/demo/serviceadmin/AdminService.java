package com.sriindu.demo.serviceadmin;

import java.util.List;

import com.sriindu.demo.entityadmin.Admin;

public interface AdminService {

	Admin saveAdmin(Admin admin);

	void deleteAdminById(Long adminId);

	List<Admin> fetchAdminList();

	Admin fetchAdminById(Long adminId);

	Admin updateAdmin(Long adminId, Admin admin);

	

	 
}

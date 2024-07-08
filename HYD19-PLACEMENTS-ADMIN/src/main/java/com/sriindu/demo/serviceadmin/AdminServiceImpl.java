package com.sriindu.demo.serviceadmin;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sriindu.demo.entityadmin.Admin;
import com.sriindu.demo.repositoryadmin.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepository AR ;

	@Override
	public Admin saveAdmin(Admin admin) {
		
		return AR.save(admin) ;
	}

	@Override
	public void deleteAdminById(Long adminId) {

		AR.deleteById(adminId);
		
	}

	@Override
	public List<Admin> fetchAdminList() {
		
		return AR.findAll();
	}

	@Override
	public Admin fetchAdminById(Long adminId) {
		
		return AR.findById(adminId).get() ;
	}

	@Override
	public Admin updateAdmin(Long adminId, Admin admin) {
		
		Admin admDB = AR.findById(adminId).get();

	       if(Objects.nonNull(admin.getAdminName()) && !"".equalsIgnoreCase(admin.getAdminName())) {
	         admDB.setAdminName(admin.getAdminName());
	       }

	       if(Objects.nonNull(admin.getAdminPassword()) && !"".equalsIgnoreCase(admin.getAdminPassword())) {
	          admDB.setAdminPassword(admin.getAdminPassword());
	       }

	       return AR.save(admDB);
	}


}

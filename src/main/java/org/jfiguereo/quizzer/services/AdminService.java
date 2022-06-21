package org.jfiguereo.quizzer.services;


import java.util.List;

import org.jfiguereo.quizzer.models.Admin;

public interface AdminService {

	List<Admin> getAllAdmins();
	Admin saveAdmin(Admin admin);
	Admin getAdminById(Long Id);
	void deleteAdminById(Long Id);
	
}

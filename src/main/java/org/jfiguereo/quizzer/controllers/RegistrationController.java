package org.jfiguereo.quizzer.controllers;

import org.apache.logging.log4j.util.Strings;
import org.jfiguereo.quizzer.dto.UserDTO;
import org.jfiguereo.quizzer.models.Admin;
import org.jfiguereo.quizzer.models.Student;
import org.jfiguereo.quizzer.models.Teacher;
import org.jfiguereo.quizzer.services.AdminService;
import org.jfiguereo.quizzer.services.StudentService;
import org.jfiguereo.quizzer.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {

	@Autowired
	private StudentService studentService;

	@Autowired
	private AdminService adminService;

	@Autowired
	private TeacherService teacherService;

	@PostMapping("/register")
	public String registerNewUser(@ModelAttribute UserDTO userDto) {
		if (userDto.getRole().equalsIgnoreCase("student")) {
			Student student = new Student();
			student.setFirstName(userDto.getFirstName());
			student.setLastName(userDto.getLastName());
			student.setUsername(userDto.getUsername());
			student.setPassword(userDto.getPassword());
			studentService.saveStudent(student);
		} else if (userDto.getRole().equalsIgnoreCase("admin")) {
			Admin admin = new Admin();
			admin.setFirstName(userDto.getFirstName());
			admin.setLastName(userDto.getLastName());
			admin.setUsername(userDto.getUsername());
			admin.setPassword(userDto.getPassword());
			adminService.saveAdmin(admin);
		} else if (userDto.getRole().equalsIgnoreCase("teacher")) {
			Teacher teacher = new Teacher();
			teacher.setFirstName(userDto.getFirstName());
			teacher.setLastName(userDto.getLastName());
			teacher.setUsername(userDto.getUsername());
			teacher.setPassword(userDto.getPassword());
			teacherService.saveTeacher(teacher);
		}
		return "redirect:/admin/dashboard";
	}

}

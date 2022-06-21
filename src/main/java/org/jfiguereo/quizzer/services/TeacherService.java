package org.jfiguereo.quizzer.services;

import java.util.List;

import org.jfiguereo.quizzer.models.Student;
import org.jfiguereo.quizzer.models.Teacher;

public interface TeacherService {
	List<Teacher> getAllTeachers();
	Teacher findTeacherByUsername(String username);
	Teacher saveTeacher(Teacher teacher);
	Teacher getTeacherById(Long id);
	Teacher updateTeacher(Teacher teacher);
	void deleteTeacherById(Long Id);
}

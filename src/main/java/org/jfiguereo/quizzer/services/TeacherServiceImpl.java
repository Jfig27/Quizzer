package org.jfiguereo.quizzer.services;

import java.util.List;

import org.jfiguereo.quizzer.models.Student;
import org.jfiguereo.quizzer.models.Teacher;
import org.jfiguereo.quizzer.repositories.TeacherRepository;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService{

	
	private TeacherRepository teacherRepository;

	public TeacherServiceImpl(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	@Override
	public List<Teacher> getAllTeachers() {
		return teacherRepository.findAll();
	}

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public Teacher getTeacherById(Long id) {
		return teacherRepository.findById(id).get();
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public void deleteTeacherById(Long Id) {
		teacherRepository.deleteById(Id);
	}

	@Override
	public Teacher findTeacherByUsername(String username) {
		return teacherRepository.findByusername(username);
	}
	
}

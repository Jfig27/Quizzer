package org.jfiguereo.quizzer.controllers;

import java.util.List;

import org.jfiguereo.quizzer.models.Admin;
import org.jfiguereo.quizzer.models.Question;
import org.jfiguereo.quizzer.models.Quiz;
import org.jfiguereo.quizzer.models.Session;
import org.jfiguereo.quizzer.models.Student;
import org.jfiguereo.quizzer.models.Teacher;

public class ContextController {

	public static Student student;
	public static Admin admin;
	public static Teacher teacher;
	public static Session session;
	public static Quiz quiz;
	public static List<Question> questions;
	
	public static Admin getAdmin() {
		return admin;
	}
	public static void setAdmin(Admin admin) {
		ContextController.admin = admin;
	}
	public static Student getStudent() {
		return student;
	}
	public static void setStudent(Student student) {
		ContextController.student = student;
	}
	public static Session getSession() {
		return session;
	}
	public static void setSession(Session session) {
		ContextController.session = session;
	}
	public static Quiz getQuiz() {
		return quiz;
	}
	public static void setQuiz(Quiz quiz) {
		ContextController.quiz = quiz;
	}
	public static Teacher getTeacher() {
		return teacher;
	}
	public static void setTeacher(Teacher teacher) {
		ContextController.teacher = teacher;
	}
	
	
}

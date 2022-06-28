package org.jfiguereo.quizzer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.jfiguereo.quizzer.models.Admin;
import org.jfiguereo.quizzer.repositories.AdminRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AdminRepositoryTests {
	

	Admin admin = new Admin();
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Test
	@Order(1)
	public void saveAdminTest() {
		admin.setFirstName("admin");
		admin.setLastName("robert");
		admin.setUsername("admin");
		admin.setPassword("admin");
		admin.setRole("admin");
		adminRepository.save(admin);
		Assertions.assertThat(admin.getId()).isGreaterThan(0);
		Assertions.assertThat(adminRepository.getById(admin.getId())).isEqualTo(admin);	
	}
	
	@Test
	@Order(2)
	public void getAdminTest() {
		Admin admin = adminRepository.findById(15L).get();
		Assertions.assertThat(admin.getId()).isGreaterThan(0);
		Assertions.assertThat(admin.getUsername()).isEqualTo("admin");
	}
	
	@Test
	@Order(3)
	public void updateAdminTest() {
		Admin admin = adminRepository.findById(15L).get();
		admin.setFirstName("Admin mayo");
		Admin updatedAdmin = adminRepository.save(admin);
		Assertions.assertThat(updatedAdmin.getId()).isGreaterThan(0);
		Assertions.assertThat(updatedAdmin.getFirstName()).isEqualTo("Admin mayo");
	}
	
}

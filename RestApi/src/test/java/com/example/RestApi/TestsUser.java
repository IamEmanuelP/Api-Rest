package com.example.RestApi;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.RestApi.models.UserModel;
import com.example.RestApi.respositories.UserRepository;


@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class TestsUser {

	@Autowired
	UserRepository userRepository;

	/*
	@Test
	@Order(1)
	public void testCreate() {
		UserModel u = new UserModel();
		u.setIdUser(1L);
		u.setUsername("Iampablop");
		u.setPassword("test1");
		u.setIdProfile(1);
		u.setIdEmployee(1);
		u.setStatus("Active");
		u.setUpdateDate("2022-09-09");
		u.setCreateDate("2022-09-09");
		u.setLogin("Login");
		userRepository.save(u);
		assertNotNull(userRepository.findById(1L).get());
	}*/
	
	@Test
	@Order(1)
	public void testReadAllUsers() {
		List<UserModel> list = (List<UserModel>) userRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	
	@Test
	@Order(2)
	public void testSingleUser() {
		UserModel usermodel = userRepository.findById(1L).get();
		assertEquals("Iampablop", usermodel.getUsername());
	}
	
	/*
	@Test
	@Order(4)
	public void testUpdate() {
		 UserModel u = userRepository.findById(1L).get();
		 u.setUsername("Iampablop2");
		 u.setPassword("test2");
		 u.setIdProfile(1);
		 u.setIdEmployee(1);
		 u.setStatus("Inactive");
		 u.setUpdateDate("2008-02-22");
		 u.setCreateDate("2008-02-22");
		 u.setLogin("Login");
		 userRepository.save(u);
		 assertNotEquals("Iampablop", userRepository.findById(1L).get().getUsername());
	}*/
	
	@Test
	@Order(3)
	public void testDelete() {
		userRepository.deleteById(1L);
		assertThat(userRepository.existsById(1L)).isFalse();
	}




	private void assertEquals(String string, String profile) {
		// TODO Auto-generated method stub
		
	}


}

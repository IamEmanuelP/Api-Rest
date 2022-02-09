package com.example.RestApi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.RestApi.models.ProfileModel;
import com.example.RestApi.respositories.ProfileRepository;



@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class RestApiApplicationTests {
	
	@Autowired
	ProfileRepository profileRepository;

	@Test
	@Order(1)
	public void testCreate() {
		ProfileModel p = new ProfileModel();
		p.setIdProfile(1L);
		p.setProfile("User2");
		profileRepository.save(p);
		assertNotNull(profileRepository.findById(1L).get());
	}
	
	@Test
	@Order(2)
	public void testReadAll() {
		List<ProfileModel> list = (List<ProfileModel>) profileRepository.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	
	@Test
	@Order(3)
	public void testSingleProfile() {
		ProfileModel profilemodel = profileRepository.findById(1L).get();
		assertEquals("User2", profilemodel.getProfile());
	}
	
	@Test
	@Order(4)
	public void testUpdate() {
		 ProfileModel p = profileRepository.findById(1L).get();
		 p.setProfile("Nuevo1");
		 profileRepository.save(p);
		 assertNotEquals("User2", profileRepository.findById(1L).get().getProfile());
	}
	
	@Test
	@Order(5)
	public void testDelete() {
		profileRepository.deleteById(1L);
		assertThat(profileRepository.existsById(1L)).isFalse();
	}


	private void assertNotEquals(String string, String profile) {
		// TODO Auto-generated method stub
		
	}

	private void assertEquals(String string, String profile) {
		// TODO Auto-generated method stub
		
	}


	private void assertNotNull(ProfileModel profileModel) {
		// TODO Auto-generated method stub
		
	}
	
}

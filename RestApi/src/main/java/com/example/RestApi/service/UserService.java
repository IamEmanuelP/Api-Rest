package com.example.RestApi.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestApi.models.UserModel;
import com.example.RestApi.respositories.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	public ArrayList<UserModel> obtenerUsers(){
		return (ArrayList<UserModel>) userRepository.findAll();
	}
	
	public UserModel guardarUser(UserModel user) {
		return userRepository.save(user);
	}
	
	public Optional<UserModel> obtenerId(Long idUser){
		return userRepository.findById(idUser);
	}
	
	
	public boolean eliminarUser(Long idUser) {
		try {
			userRepository.deleteById(idUser);
			return true;
		}catch(Exception err) {
			return false;
		}
	}
	
}
package com.example.RestApi.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestApi.models.ProfileModel;
import com.example.RestApi.respositories.ProfileRepository;


@Service
public class ProfileService {
	@Autowired
	ProfileRepository profileRepository;
	
	public ArrayList<ProfileModel> obtenerProfile(){
		return (ArrayList<ProfileModel>) profileRepository.findAll();
	}
	
	public ProfileModel guardarProfile(ProfileModel profile) {
		return profileRepository.save(profile);
	}
	
	public Optional<ProfileModel> obtenerIdProfile(Long IdProfile){
		return profileRepository.findById(IdProfile);
	}
	
	
	public boolean eliminarProfile(Long IdProfile) {
		try {
			profileRepository.deleteById(IdProfile);
			return true;
		}catch(Exception err) {
			return false;
		}
	}

}

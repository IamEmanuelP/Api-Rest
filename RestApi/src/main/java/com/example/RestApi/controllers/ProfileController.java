package com.example.RestApi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestApi.models.ProfileModel;
import com.example.RestApi.service.ProfileService;


@RestController
@RequestMapping("/profile")
public class ProfileController {
	@Autowired
	ProfileService profileService;
	
	@GetMapping()
	public ArrayList<ProfileModel> obtenerProfile(){
		return profileService.obtenerProfile();
	}
	
	@PostMapping()
	public ProfileModel guardarProfile(@RequestBody ProfileModel profile) {
		return this.profileService.guardarProfile(profile);
	}
	
	@GetMapping( path = "/{IdProfile}")
	public Optional<ProfileModel> obtenerProfileId(@PathVariable("IdProfile") Long IdProfile){
		return this.profileService.obtenerIdProfile(IdProfile);
	}
		
	@DeleteMapping(path = "/{IdProfile}")
	public String eliminar(@PathVariable("IdProfile")Long IdProfile) {
		boolean ok = this.profileService.eliminarProfile(IdProfile);
		if (ok) {
			return "Se elimino el usuario: " + IdProfile;
			}else {
				return "No se pudo eliminar";
			}
	}
	

	

}

package com.example.RestApi.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.RestApi.models.UserModel;
import com.example.RestApi.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping()
	public ArrayList<UserModel> obtenerUsers(){
		return userService.obtenerUsers();
	}
	
	@PostMapping()
	public UserModel guardarUser(@RequestBody UserModel user) {
		return this.userService.guardarUser(user);
	}
	
	@GetMapping( path = "/{idUser}")
	public Optional<UserModel> obtenerUserId(@PathVariable("idUser") Long idUser){
		return this.userService.obtenerId(idUser);
	}
		
	@DeleteMapping(path = "/{idUser}")
	public String eliminar(@PathVariable("idUser")Long idUser) {
		boolean ok = this.userService.eliminarUser(idUser);
		if (ok) {
			return "Se elimino el usuario: " + idUser;
			}else {
				return "No se pudo eliminar";
			}
	}
	
	
	
	

}

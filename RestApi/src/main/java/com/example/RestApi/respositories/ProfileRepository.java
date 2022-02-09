package com.example.RestApi.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.RestApi.models.ProfileModel;

@Repository
public interface ProfileRepository extends CrudRepository<ProfileModel, Long> {
	

}
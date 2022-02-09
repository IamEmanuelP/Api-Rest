package com.example.RestApi.models;

import javax.persistence.*;

@Entity
@Table(name = "tblprofiles")
public class ProfileModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long IdProfile;


	private String Profile;
	
	public Long getIdProfile() {
		return IdProfile;
	}
	public void setIdProfile(Long idProfile) {
		IdProfile = idProfile;
	}
	public String getProfile() {
		return Profile;
	}
	public void setProfile(String profile) {
		Profile = profile;
	}

}

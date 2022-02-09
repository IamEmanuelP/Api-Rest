package com.example.RestApi.models;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "tblusers")
public class UserModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long idUser;
	
	
	private String Username;
	private String Password;
	private Integer IdProfile;
	private Integer IdEmployee;
	private String Status;
	private Date CreateDate;
	private Date UpdateDate;
	private String Login;
	
	//Getters and Setters
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Integer getIdProfile() {
		return IdProfile;
	}
	public void setIdProfile(Integer idProfile) {
		IdProfile = idProfile;
	}
	public Integer getIdEmployee() {
		return IdEmployee;
	}
	public void setIdEmployee(Integer idEmployee) {
		IdEmployee = idEmployee;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date getCreateDate() {
		return CreateDate;
	}
	public void setCreateDate(Date createDate) {
		CreateDate = createDate;
	}
	public Date getUpdateDate() {
		return UpdateDate;
	}
	public void setUpdateDate(Date updateDate) {
		UpdateDate = updateDate;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	
}

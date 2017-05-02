package org.alba.boutique.entities;

import java.io.Serializable;
import java.util.Collection;



public class User implements Serializable {
	private Long idUser;
	private String userName;
	private String passWord;
	private boolean actived;
	private Collection<Role> roles;
	public User(String userName, String passWord, boolean actived) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.passWord = passWord;
		this.actived = actived;
		this.roles = roles;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	

}

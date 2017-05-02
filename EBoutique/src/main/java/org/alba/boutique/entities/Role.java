package org.alba.boutique.entities;

import java.io.Serializable;

public class Role implements Serializable{
	private Long idRole;
	private String roleName;
	public Role() {
		// TODO Auto-generated constructor stub
	}
	public Role(Long idRole, String roleName) {
		super();
		this.idRole = idRole;
		this.roleName = roleName;
	}
	public Long getIdRole() {
		return idRole;
	}
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	

}

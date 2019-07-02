package com.youtube.demo.model;

import java.sql.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")
@Access(AccessType.FIELD)
public class User extends ParentEntity{
	
	private static final long serialVersionUID = 8435405591663518471L;

	@Column(name="id_status", nullable=true, length=11)
	private Integer idStatus;
	
	@Column(name="id_profile", nullable=true, length=11)
	private Integer idProfile;	
	
	@Column(name="first_name", nullable=false, length=255)
	private String firstName;
	
	@Column(name="second_name", nullable=true, length=255)
	private String secondName;
	
	@Column(name="first_surname", nullable=false, length=255)
	private String firstSurname;
	
	@Column(name="second_surname", nullable=true, length=255)
	private String secondSurname;
	
	@Column(name="phone", nullable=true, length=30)
	private String phone;
	
	@Column(name="address", nullable=false, length=150)
	private String address;
	
	@Column(name="created_at", nullable=true)
	private Date created_at;
	
	@Column(name="updated_at", nullable=true)
	private Date updated_at;
	
	@Column(name="deleted_at", nullable=true)
	private Date  deleted_at;	
	
	public Integer getIdStatus() {
		return idStatus;
	}
	public void setIdStatus(Integer idStatus) {
		this.idStatus = idStatus;
	}
	
	public Integer getIdProfile() {
		return idProfile;
	}
	public void setIdProfile(Integer idProfile) {
		this.idProfile = idProfile;
	}	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	public String getFirstSurname() {
		return firstSurname;
	}
	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}
	
	public String getSecondSurname() {
		return secondSurname;
	}
	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreated_at() {
		return created_at;
	}
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
	public Date getDeleted_at() {
		return deleted_at;
	}
	public void setDeleted_at(Date deleted_at) {
		this.deleted_at = deleted_at;
	}

}

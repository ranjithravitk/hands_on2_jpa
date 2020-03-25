package com.modal;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	
	@Id
	private Integer us_id;
	
	private String us_name;
	private String us_email;
	
	
	@OneToMany(mappedBy = "user")
	private Set<Attempt> attemps;
	public Integer getUs_id() {
		return us_id;
	}
	public void setUs_id(Integer us_id) {
		this.us_id = us_id;
	}
	public String getUs_name() {
		return us_name;
	}
	public void setUs_name(String us_name) {
		this.us_name = us_name;
	}
	public String getUs_email() {
		return us_email;
	}
	public void setUs_email(String us_email) {
		this.us_email = us_email;
	}
	@Override
	public String toString() {
		return "User [us_id=" + us_id + ", us_name=" + us_name + ", us_email=" + us_email + "]";
	}
}

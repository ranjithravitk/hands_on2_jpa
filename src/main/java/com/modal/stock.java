package com.modal;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stocks")
public class stock implements Serializable {

	@Id
	private Integer st_id;
	private String st_code;
	private Date st_date;
	private Double st_open;
	
	
	private Double st_close;
	

	public stock() {
		super();
	}


	private Integer st_volume;


	public Integer getSt_id() {
		return st_id;
	}


	public void setSt_id(Integer st_id) {
		this.st_id = st_id;
	}


	public String getSt_code() {
		return st_code;
	}


	public void setSt_code(String st_code) {
		this.st_code = st_code;
	}


	public Date getSt_date() {
		return st_date;
	}


	public void setSt_date(Date st_date) {
		this.st_date = st_date;
	}


	public Double getSt_open() {
		return st_open;
	}


	public void setSt_open(Double st_open) {
		this.st_open = st_open;
	}


	public Double getSt_close() {
		return st_close;
	}


	public void setSt_close(Double st_close) {
		this.st_close = st_close;
	}


	public Integer getSt_volume() {
		return st_volume;
	}


	public void setSt_volume(Integer st_volume) {
		this.st_volume = st_volume;
	}


	@Override
	public String toString() {
		return "stock [st_id=" + st_id + ", st_code=" + st_code + ", st_date=" + st_date + ", st_open=" + st_open
				+ ", st_close=" + st_close + ", st_volume=" + st_volume + "]";
	}
	
}

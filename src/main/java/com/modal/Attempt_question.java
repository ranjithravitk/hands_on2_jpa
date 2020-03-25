package com.modal;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import javax.persistence.ForeignKey ;

@Entity
public class Attempt_question {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer aq_id;
	
	private Integer aq_qt_id;
	
	private Integer aq_at_id;
	
	
	
	
	
	public Integer getAq_id() {
		return aq_id;
	}
	public void setAq_id(Integer aq_id) {
		this.aq_id = aq_id;
	}
	public Integer getAq_qt_id() {
		return aq_qt_id;
	}
	public void setAq_qt_id(Integer aq_qt_id) {
		this.aq_qt_id = aq_qt_id;
	}
	public Integer getAq_at_id() {
		return aq_at_id;
	}
	public void setAq_at_id(Integer aq_at_id) {
		this.aq_at_id = aq_at_id;
	}
	@Override
	public String toString() {
		return "Attempt_question [aq_id=" + aq_id + ", aq_qt_id=" + aq_qt_id + ", aq_at_id=" + aq_at_id + "]";
	}
}

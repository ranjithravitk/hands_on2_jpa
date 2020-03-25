package com.modal;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Attempt {
      
	@Id
	private Integer at_id;
	private Date at_date;
	private Integer at_us_id;
	private Double at_score;
	
	@ManyToOne
	@JoinColumn(name="at_user_id")
	private User user;
	
	@ManyToMany
	@JoinTable(name = "attempt_question",
	        joinColumns = @JoinColumn(name = "aq_at_id"), 
	        inverseJoinColumns = @JoinColumn(name = "aq_qt_id"))

	private Set<Question> questions;
	
	
	public Set<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
	public Integer getAt_id() {
		return at_id;
	}
	public void setAt_id(Integer at_id) {
		this.at_id = at_id;
	}
	public Date getAt_date() {
		return at_date;
	}
	public void setAt_date(Date at_date) {
		this.at_date = at_date;
	}
	public Integer getAt_us_id() {
		return at_us_id;
	}
	public void setAt_us_id(Integer at_us_id) {
		this.at_us_id = at_us_id;
	}
	public Double getAt_score() {
		return at_score;
	}
	public void setAt_score(Double at_score) {
		this.at_score = at_score;
	}
	@Override
	public String toString() {
		return "Attempt [at_id=" + at_id + ", at_date=" + at_date + ", at_us_id=" + at_us_id + ", at_score=" + at_score
				+ "]";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}

package com.modal;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Question {

	@Id
	private Integer qt_id;
	private String qt_text;
	
	@ManyToMany(mappedBy = "questions")
	private Set<Attempt> attempts;
	
	@OneToMany(mappedBy = "question")
	private Set<Options> options;
	public Set<Attempt> getAttempts() {
		return attempts;
	}
	public void setAttempts(Set<Attempt> attempts) {
		this.attempts = attempts;
	}
	public Integer getQt_id() {
		return qt_id;
	}
	public void setQt_id(Integer qt_id) {
		this.qt_id = qt_id;
	}
	public String getQt_text() {
		return qt_text;
	}
	public void setQt_text(String qt_text) {
		this.qt_text = qt_text;
	}
	@Override
	public String toString() {
		return "Question [qt_id=" + qt_id + ", qt_text=" + qt_text + "]";
	}
}

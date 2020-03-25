package com.modal;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Options {

	@Id
	private Integer op_id;
	private Integer op_qt_id;
	private Double op_score;
	private String op_text;
	@ManyToOne
	@JoinColumn(name="qt_ot_id")
	private Question question;
	
	
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	public Integer getOp_id() {
		return op_id;
	}
	public void setOp_id(Integer op_id) {
		this.op_id = op_id;
	}
	public Integer getOp_qt_id() {
		return op_qt_id;
	}
	public void setOp_qt_id(Integer op_qt_id) {
		this.op_qt_id = op_qt_id;
	}
	public Double getOp_score() {
		return op_score;
	}
	public void setOp_score(Double op_score) {
		this.op_score = op_score;
	}
	public String getOp_text() {
		return op_text;
	}
	public void setOp_text(String op_text) {
		this.op_text = op_text;
	}
	@Override
	public String toString() {
		return "Options [op_id=" + op_id + ", op_qt_id=" + op_qt_id + ", op_score=" + op_score + ", op_text=" + op_text
				+ "]";
	}
}

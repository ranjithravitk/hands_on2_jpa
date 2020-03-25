package com.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AttempOption {

	@Id
	private Integer ao_id;
	private Integer ao_op_id;
	private Integer ao_aq_id;
	private boolean ao_selected;
	public Integer getAo_id() {
		return ao_id;
	}
	public void setAo_id(Integer ao_id) {
		this.ao_id = ao_id;
	}
	public Integer getAo_op_id() {
		return ao_op_id;
	}
	public void setAo_op_id(Integer ao_op_id) {
		this.ao_op_id = ao_op_id;
	}
	public Integer getAo_aq_id() {
		return ao_aq_id;
	}
	public void setAo_aq_id(Integer ao_aq_id) {
		this.ao_aq_id = ao_aq_id;
	}
	public boolean isAo_selected() {
		return ao_selected;
	}
	public void setAo_selected(boolean ao_selected) {
		this.ao_selected = ao_selected;
	}
	@Override
	public String toString() {
		return "AttempOption [ao_id=" + ao_id + ", ao_op_id=" + ao_op_id + ", ao_aq_id=" + ao_aq_id + ", ao_selected="
				+ ao_selected + "]";
	}
	
	
}

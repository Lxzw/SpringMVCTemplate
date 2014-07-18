package com.moke.springmvctest.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;


@Entity
public class MedicalHistory implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;

	@Id Integer id;
	
	@MapsId @OneToOne
	@JoinColumn(name="patient_id")
	Person patient;
}

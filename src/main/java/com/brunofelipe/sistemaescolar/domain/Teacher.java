package com.brunofelipe.sistemaescolar.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String cellPhone;
	private Integer age;
	private Float numberRegistration;
	
	public Teacher() {
		
	}

	public Teacher(Integer id, String name, String cellPhone, Integer age, Float numberRegistration) {
		super();
		this.id = id;
		this.name = name;
		this.cellPhone = cellPhone;
		this.age = age;
		this.numberRegistration = numberRegistration;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	};

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Float getNumberRegistration() {
		return numberRegistration;
	}

	public void setNumberRegistration(Float numberRegistration) {
		this.numberRegistration = numberRegistration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numberRegistration == null) ? 0 : numberRegistration.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numberRegistration == null) {
			if (other.numberRegistration != null)
				return false;
		} else if (!numberRegistration.equals(other.numberRegistration))
			return false;
		return true;
	}

	
}

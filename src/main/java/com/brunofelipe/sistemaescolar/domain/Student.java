package com.brunofelipe.sistemaescolar.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String cellPhone;
	private Integer age;
	private Double noteFirst;
	private Double noteSecond;
	private Double average;
	
	
	@ManyToMany(mappedBy= "teachers")
	private List<Teacher> teachers = new ArrayList<>();

	
	public Student() {
		
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
	}



	public Integer getAge() {
		return age;
	}



	public void setAge(Integer age) {
		this.age = age;
	}



	public Double getNoteFirst() {
		return noteFirst;
	}



	public void setNoteFirst(Double noteFirst) {
		this.noteFirst = noteFirst;
	}



	public Double getNoteSecond() {
		return noteSecond;
	}



	public void setNoteSecond(Double noteSecond) {
		this.noteSecond = noteSecond;
	}



	public Double getAverage() {
		return average;
	}



	public void setAverage(Double average) {
		this.average = average;
	}



	public Student(Integer id, String name, String cellPhone, Integer age, Double noteFirst, Double noteSecond,Double average) {
		super();
		this.id = id;
		this.name = name;
		this.cellPhone = cellPhone;
		this.age = age;
		this.noteFirst = noteFirst;
		this.noteSecond = noteSecond;
		this.average = average;
	}

	



	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}



	

}

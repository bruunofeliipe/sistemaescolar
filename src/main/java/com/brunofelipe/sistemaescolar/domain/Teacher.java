package com.brunofelipe.sistemaescolar.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Teacher implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String cellPhone;
	private Integer age;
	private Double salary;
	private String numberRegistration;
	
	@JsonManagedReference 
	@ManyToMany
	@JoinTable( name = "teacher_student",
	joinColumns = @JoinColumn (name = "teacher_id"),
	inverseJoinColumns = @JoinColumn(name = "student_id")
	)
	private List <Student> students = new ArrayList<>();

	@OneToMany(mappedBy= "teacher")
	private List <Discipline> disciplines = new ArrayList<>();
	
	
	public Teacher() {
		
	}

	public Teacher(Integer id, String name, String cellPhone, Integer age,Double salary, String numberRegistration) {
		super();
		this.id = id;
		this.name = name;
		this.cellPhone = cellPhone;
		this.age = age;
		this.salary = salary;
		this.numberRegistration = numberRegistration;
	}
	
	public List <Discipline> getDisciplines() {
		return disciplines;
	}

	public void setDisciplines(List <Discipline> disciplines) {
		this.disciplines = disciplines;
	}


	public List <Student> getStudents() {
		return students;
	}

	public void setStudents(List <Student> students) {
		this.students = students;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
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


	public String getNumberRegistration() {
		return numberRegistration;
	}

	public void setNumberRegistration(String numberRegistration) {
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

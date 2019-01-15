package com.brunofelipe.sistemaescolar.domain.enums;

public enum TypeStudent {
	
	
	STUDENTWITHDISABILITIES(1, "Aluno com deficiência"),
	NORMALSTUDENT (2,"Aluno sem deficiência");
	
	
	private int cod;
	private String description;
	
	private TypeStudent(int cod, String description) {
		this.cod = cod;
		this.description = description;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescription() {
		return description;
	}
	
	public static TypeStudent toEnum(Integer cod){
		
		if (cod == null) {
			return null;
		}
		
		for (TypeStudent x : TypeStudent.values()) {
			if (cod.equals(x.getCod()));
			return x;
		}
		
	
	throw new IllegalArgumentException("Id invalido" + cod);
	
	}
}


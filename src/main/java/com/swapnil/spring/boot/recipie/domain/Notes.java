package com.swapnil.spring.boot.recipie.domain;

import javax.persistence.*;

@Entity
public class Notes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@OneToOne
	private Recipie recipie;
	@Lob
	private String RecipieNotes;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public Recipie getRecipie() {
		return recipie;
	}
	public void setRecipie(Recipie recipie) {
		this.recipie = recipie;
	}
	public String getRecipieNotes() {
		return RecipieNotes;
	}
	public void setRecipieNotes(String recipieNotes) {
		RecipieNotes = recipieNotes;
	}
	
}

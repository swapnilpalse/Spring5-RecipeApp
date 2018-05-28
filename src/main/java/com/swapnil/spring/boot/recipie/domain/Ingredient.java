package com.swapnil.spring.boot.recipie.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Ingredient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String description;
	private BigDecimal amount;
	@ManyToOne
	private Recipie recipie;
	@OneToOne(fetch=FetchType.EAGER)
	private UnitOfMeasure unitOfMeasure;
	
	
	public Ingredient(String description, BigDecimal amount, UnitOfMeasure unitOfMeasure, Recipie recipie) {
		super();
		this.description = description;
		this.amount = amount;
		this.recipie = recipie;
		this.unitOfMeasure = unitOfMeasure;
	}
	public UnitOfMeasure getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public Recipie getRecipie() {
		return recipie;
	}
	public void setRecipie(Recipie recipie) {
		this.recipie = recipie;
	}
	
	
}

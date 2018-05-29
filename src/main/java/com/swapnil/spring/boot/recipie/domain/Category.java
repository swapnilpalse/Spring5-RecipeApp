package com.swapnil.spring.boot.recipie.domain;

import java.util.Set;
import javax.persistence.*;
@Entity
public class Category {
@Id	
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private String description;
@ManyToMany(mappedBy="categories")
private Set<Recipie> recipies;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Set<Recipie> getRecipies() {
	return recipies;
}
public void setRecipies(Set<Recipie> recipies) {
	this.recipies = recipies;
}


}

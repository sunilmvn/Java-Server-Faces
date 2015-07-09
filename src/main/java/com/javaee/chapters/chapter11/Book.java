package com.javaee.chapters.chapter11;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NamedQuery(name = " findAllBooks ", query = "SELECT b FROM Book b ORDER BY b.title DESC")

public class Book {
	
	 @Id @GeneratedValue
	 private Long id;
	 
	 @NotNull
	 private String title;
	 
	 private Float price;
	 
	 @Size(min = 10, max = 2000)
	 private String description;
	 
	 private String isbn;
	 
	 private Integer nbOfPage;
	 
	 private Boolean illustrations;
	
	public Book(String title, String desc, float price, String string3, int i,
			boolean b) {
		this.title = title;
		this.description = desc;
		this.price = price;
		this.setIsbn(string3);
		this.setNbOfPage(i);
		this.setIllustrations(b);
	}
	
	public Book(){
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getNbOfPage() {
		return nbOfPage;
	}
	public void setNbOfPage(Integer nbOfPage) {
		this.nbOfPage = nbOfPage;
	}
	public Boolean getIllustrations() {
		return illustrations;
	}
	public void setIllustrations(Boolean illustrations) {
		this.illustrations = illustrations;
	}
}

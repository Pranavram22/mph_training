package com.test;

import jakarta.persistence.Entity;

@Entity
public class Movie_3D extends Movie{
private String director;

public String getDirector() {
	return director;
}

public void setDirector(String director) {
	this.director = director;
}
}

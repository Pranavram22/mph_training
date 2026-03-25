package com.test;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@Table
@DiscriminatorValue("Car")


public class FourWheeler extends Vehicle {
private String steeringWheel;
public String getSteeringWheel() {
	return steeringWheel;
	
}


public void setSteeringWheel(String string) {
	// TODO Auto-generated method stub
	this.steeringWheel = steeringWheel;
}
}

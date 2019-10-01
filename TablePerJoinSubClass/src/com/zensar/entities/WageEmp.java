package com.zensar.entities;
/** @author kalyani
 * @creation_date 27 sept 2019 11:48 am
 *@copyright Zensar Technologies
 * @version 1.0
 * 
 */

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="wage_emp_2")
public class WageEmp extends Employee {
	
	private int hours;
	private float rate;
	public WageEmp() {
		// TODO Auto-generated constructor stub
	}
	public WageEmp(int empId, String name, LocalDate joinDate, double salary, int hours, float rate) {
		super(empId, name, joinDate, salary);
		this.hours = hours;
		this.rate = rate;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "WageEmp [hours=" + hours + ", rate=" + rate + "]";
	}
	
	

}

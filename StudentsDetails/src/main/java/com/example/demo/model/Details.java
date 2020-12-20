package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Details 
{
	    @Id
	    private int Roll_number;
	    private String Name;
	    private String Branch;
	    private String Grade;
		public int getRoll_number() {
			return Roll_number;
		}
		public void setRoll_number(int roll_number) {
			Roll_number = roll_number;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public String getBranch() {
			return Branch;
		}
		public void setBranch(String branch) {
			Branch = branch;
		}
		public String getGrade() {
			return Grade;
		}
		public void setGrade(String grade) {
			Grade = grade;
		}
		@Override
		public String toString() {
			return "Details [Roll_number=" + Roll_number + ", Name=" + Name + ", Branch=" + Branch + ", Grade=" + Grade
					+ "]";
		}
		
		
		
	    
	    
}

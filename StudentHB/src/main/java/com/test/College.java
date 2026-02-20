package com.test;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name = "college")
//@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)		// Creates a single table for all entity classes. Entity class is a pojo class and hibernate maps this entity class to database
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)  // to distinguish between different classes on the single table created on database
@DiscriminatorValue(value = "college")   // this is 
public class College {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "id")
		private int id; 
		private String c_name;
		
		public College() {
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getC_name() {
			return c_name;
		}

		public void setC_name(String c_name) {
			this.c_name = c_name;
		}
		
		public College(int id, String c_name) {
			this.id = id;
			this.c_name = c_name;
		}

		@Override
		public String toString() {
			return "College [id=" + id + ", c_name=" + c_name + "]";
		}

		
		
}

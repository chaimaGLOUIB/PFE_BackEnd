package com.TECHSUB.Models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor


public class Compte_Analytique implements Serializable{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	 private long id; 
	
     private String compte;
     
     private String description;
     
     
}

package com.example;

import java.util.Random;

import javax.ejb.Stateless;

@Stateless
public class LancadorDeDadoBean {
	
	private Random gerador = new Random () ;
	
	public int lanca(){
		
		return this.gerador.nextInt(6) + 1;
	}

}

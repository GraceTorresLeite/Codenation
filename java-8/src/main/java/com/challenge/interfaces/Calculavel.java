package com.challenge.interfaces;

import java.math.BigDecimal;

public interface Calculavel {
	
	public BigDecimal somar( Object classe ) throws IllegalArgumentException, IllegalAccessException;
	public BigDecimal subtrair( Object classe ) throws IllegalArgumentException, IllegalAccessException;
	public BigDecimal total( Object classe ) throws IllegalArgumentException, IllegalAccessException;
}



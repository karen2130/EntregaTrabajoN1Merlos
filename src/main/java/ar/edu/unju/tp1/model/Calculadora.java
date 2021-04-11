package ar.edu.unju.tp1.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	
	private double num1;
	private double num2;
	
	//constructores
	
	public Calculadora() {
		super();
	}
	
	public Calculadora(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}



	//metodos
	
	public double sumar() {
		return num1+num2;
	}

	public double restar() {
		return num1-num2;
	}
	
	public double multiplicar() {
		return num1*num2;
	}
	
	public double dividir() {
		return num1/num2;
	}
	
	//getter and setter

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(num1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(num2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calculadora other = (Calculadora) obj;
		if (Double.doubleToLongBits(num1) != Double.doubleToLongBits(other.num1))
			return false;
		if (Double.doubleToLongBits(num2) != Double.doubleToLongBits(other.num2))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calculadora [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	
	
}

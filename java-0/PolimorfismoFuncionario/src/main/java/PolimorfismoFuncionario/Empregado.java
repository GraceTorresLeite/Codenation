package PolimorfismoFuncionario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Empregado extends Empresa{
	
	private String nome;
	private String departamento;
	private LocalDate data_admissao;
	private String cpf;
	private Double salario;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public LocalDate getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(LocalDate data_admissao) {
		this.data_admissao = data_admissao;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public boolean validarData_admissao() {
		if ( data_admissao.getYear() < 2015) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
	
	public boolean validarCPF() {
		if(cpf.isEmpty() || cpf.length() < 11) {
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}
	
	public double getPLV() {
		return  this.salario * 1.0;
	}
	
	
	
	
	
}

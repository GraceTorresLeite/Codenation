package PolimorfismoFuncionario;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private List<Empregado> empregados;
	

	public Empresa() {
		empregados = new ArrayList<Empregado>();
	}

	public List<Empregado> getEmpregados() {
		return empregados;
	}

	public void setEmpregados(List<Empregado> empregados) {
		this.empregados = empregados;
	}
	
	public void adiconaEmpregadoNaEmpresa(Empregado empregados) {
		
		this.empregados.add(empregados);
	}
	
	
	
	
	
	
	
	

}

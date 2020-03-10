package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Estacionamento {
	List<Carro> carros = new ArrayList<Carro>();
	private final int lotado = 10;
	private final int idade_superior = 55;
	private final int idade_Min_carteira = 18;
	private final int max_pontos_carteira = 20;

    public void estacionar(Carro carro) {
    	if (carro.getMotorista() == null || 
    			carro.getMotorista().getIdade() < idade_Min_carteira || 
    			carro.getMotorista().getPontos() > max_pontos_carteira)
    		throw new EstacionamentoException();
    	if (carros.size() == lotado) {
    		if (carros.stream().filter(x -> x.getMotorista().getIdade() > idade_superior)
    				.collect(Collectors.toList()).size() == 10)
    		throw new EstacionamentoException();
    	if (carros.stream().filter(x -> x.getMotorista().getIdade() < idade_superior)
    			.findFirst().orElse(null) != null)carros.remove(carros.stream()
    			.filter(x -> x.getMotorista().getIdade() <idade_superior)
    			.findFirst().orElse(null));
    	else carros.remove(0);
    	}
    	carros.add(carro);      
    }

    public int carrosEstacionados() {
        return carros.size();
    }

    public boolean carroEstacionado(Carro carro) {
    	if (carros.contains(carro))
        return true;
    	return false;
    }
}

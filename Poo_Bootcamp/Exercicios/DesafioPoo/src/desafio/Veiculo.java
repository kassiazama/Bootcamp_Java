package desafio;

public class Veiculo {
    
    private double capacidade, consumo;
    private int passageiro;

    public Veiculo(double capacidade, double consumo, int passageiro) {
        this.capacidade = capacidade;
        this.consumo = consumo;
        this.passageiro = passageiro;
    }
    
    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public int getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(int passageiro) {
        this.passageiro = passageiro;
    }
    
    
    
    public double tanqueViagem(double quilometro) {
        return quilometro/(consumo * capacidade);
    }
    
    public double dividirDespesas(double combustivel, double quilometro) {
        return ((quilometro/capacidade) * combustivel)/ passageiro;
    }
    
    @Override
    public String toString() {
        return "\nO veículo comporta "+passageiro+ " passageiros, tem uma capacidade de "+capacidade+" litros de combustível e faz "+consumo+" quilômetros por litro";
    }
    
}

    

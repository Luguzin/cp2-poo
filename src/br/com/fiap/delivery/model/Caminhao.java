package br.com.fiap.delivery.model;

/**
 Veiculo para transporte pesado.
 */
public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, double capacidade, int eixos) {
        super(placa, capacidade);
        setEixos(eixos);
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        if (eixos <= 0) {
            throw new IllegalArgumentException("O número de eixos deve ser positivo.");
        }
        this.eixos = eixos;
    }

    public String getDetalhes() {
        return String.format("Caminhão [Placa: %s, Cap: %.2f kg, Eixos: %d]", 
                getPlaca(), getCapacidade(), eixos);
    }
}

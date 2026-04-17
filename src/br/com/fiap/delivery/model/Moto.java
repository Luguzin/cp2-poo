package br.com.fiap.delivery.model;

/**
Veiculo para transporte ágil.
 */
public class Moto extends Veiculo {
    private boolean possuiBau;

    public Moto(String placa, double capacidade, boolean possuiBau) {
        super(placa, capacidade);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }

    public void setPossuiBau(boolean possuiBau) {
        this.possuiBau = possuiBau;
    }

    public String getDetalhes() {
        return String.format("Moto [Placa: %s, Cap: %.2f kg, Baú: %s]", 
                getPlaca(), getCapacidade(), possuiBau ? "Sim" : "Não");
    }
}

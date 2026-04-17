package br.com.fiap.delivery.model;

/**
 * Representa um veículo no sistema FiapDelivery.
 * 
 */

public abstract class Veiculo {
    private String placa;
    private double capacidade;

    /**
     * Aqui vamos inicializar os dados básicos do veículo.
     */
    public Veiculo(String placa, double capacidade) {
        setPlaca(placa);
        setCapacidade(capacidade);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.trim().isEmpty()) {
            throw new IllegalArgumentException("A placa não pode ser nula ou vazia.");
        }
        this.placa = placa;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser um valor positivo.");
        }
        this.capacidade = capacidade;
    }

    public abstract String getDetalhes();
}

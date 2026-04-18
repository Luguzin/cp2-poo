package br.com.fiap.delivery.model;

/**
 * Gerencia a associação entre um Pacote e um Veiculo.
 */
public class Rota {
    private Pacote pacote;
    private Veiculo veiculo;

    public Rota(Pacote pacote, Veiculo veiculo) {
        if (pacote == null || veiculo == null) {
            throw new IllegalArgumentException("Pacote e Veículo são obrigatórios para uma rota.");
        }
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    public void executarEntrega() {
        System.out.println("\n--- Iniciando Entrega ---");
        System.out.println("Pacote: " + pacote.getCodigo());
        System.out.println("Status Atual: " + pacote.getStatus());
        System.out.println("Transporte: " + veiculo.getDetalhes());
        System.out.println("-------------------------");
    }

    public Pacote getPacote() { return pacote; }
    public void setPacote(Pacote pacote) { this.pacote = pacote; }
    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }
}

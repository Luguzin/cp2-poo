package br.com.fiap.delivery.view;

import br.com.fiap.delivery.model.*;

/**
 * Classe de entrada do sistema.
 */
public class Principal {
    public static void main(String[] args) {
        try {
            
        	// Veículos 
            Veiculo caminhao = new Caminhao("ABC-1234", 5000.0, 3);
            Veiculo moto = new Moto("XYZ-9876", 100.0, true);

            // Pacotes
            Pacote p1 = new Pacote("BR001", 15.5, "Pendente");
            Pacote p2 = new Pacote("SP002", 2.0, "Em Processamento");

            // Executando Rotas
            Rota r1 = new Rota(p1, caminhao);
            r1.executarEntrega();

            Rota r2 = new Rota(p2, moto);
            r2.executarEntrega();

            // Validação 
            System.out.println("\nTestando validação de carga negativa:");
            new Caminhao("ERR-0000", -50.0, 2);

        } catch (IllegalArgumentException e) {
            System.err.println("Erro de validação: " + e.getMessage());
        }
    }
}

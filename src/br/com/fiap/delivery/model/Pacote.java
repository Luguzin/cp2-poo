package br.com.fiap.delivery.model;

/**
 * Representa a carga a ser transportada.
 */
public class Pacote {
    private String codigo;
    private double peso;
    private String status;

    public Pacote(String codigo, double peso, String status) {
        setCodigo(codigo);
        setPeso(peso);
        setStatus(status);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Código inválido.");
        }
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new IllegalArgumentException("O peso deve ser positivo.");
        }
        this.peso = peso;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null || status.trim().isEmpty()) {
            throw new IllegalArgumentException("Status inválido.");
        }
        this.status = status;
    }
}

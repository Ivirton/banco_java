package model;

import java.time.LocalDate;

public class Transacao {
    private int id;
    private double valor;
    private LocalDate data;
    private String descricao;
    private TipoTransacao tipoTransacao;
    @Override
    public String toString() {
        return this.descricao + " - " + this.valor + " - " + this.data + " - " + this.tipoTransacao;
    }
}

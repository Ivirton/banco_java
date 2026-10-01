package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static model.TipoConta.CORRENTE;
import static model.TipoConta.POUPANCA;

public class Banco {
    private String nome;
    private List<Cliente> cliente  ;
    private List<ContaBancaria> contas;
    private String idBanco;

    public Banco(String nome){

        this.nome = nome;
        this.cliente = new ArrayList<>();
        this.contas = new ArrayList<>();
    }
    public  Cliente criarCliente(String nome, String endereco, LocalDate dataNascimento){
        return new Cliente(nome,endereco,dataNascimento);
    }

    public String getNome() {
        return nome;
    }
}


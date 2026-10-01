package model;

import java.time.LocalDate;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private LocalDate dataNascimento;
    private List<ContaBancaria> contasBancarias;
    private  int id;

    public Cliente(String nome, String endereco, LocalDate dataNascimento){
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;

    }
   public void adicionarConnta(ContaBancaria conta){

   }
   public void removerConnta(String numero){

   }
   public List<ContaBancaria> listarContas(){
       return contasBancarias;
   }
   public String connsultarDados(){
       return "";
   }
}

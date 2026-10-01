package model;

public abstract  class  ContaBancaria {
    private Cliente titular;
    protected double saldo;
    private String numeroConta;
    private  String agencia;
    private String senha;

    public ContaBancaria(Cliente titular,double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    public Cliente getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }
    public Boolean depositar(double saldo){
        if (saldo >= 0) {
            this.saldo +=  saldo;
            return  true;
        }else {
            return false;
        }
    }
    public Boolean sacar(double saldo){
        if (saldo <= this.getSaldo()){
            this.saldo = this.saldo -  saldo;
            return true;
        }else {
            return false;
        }
    }


}

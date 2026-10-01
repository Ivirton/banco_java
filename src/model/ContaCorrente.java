package model;

public class ContaCorrente extends ContaBancaria {
    private double limite;


    public ContaCorrente(Cliente titular,double saldo) {
        super(titular,saldo);
    }


    @Override
    public Boolean sacar(double  valor) {
        if(valor >  this.getSaldo() + limite){
            return false;
        }else {
            this.saldo -= valor;
            return true;
        }
    }


}

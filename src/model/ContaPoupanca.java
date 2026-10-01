package model;

public class ContaPoupanca extends ContaBancaria{
    private double taxa ;
    public ContaPoupanca(Cliente titular,double saldo ){
        super(titular,saldo);
    }
    public double getTaxa() {
        return taxa;
    }
    public  void setTaxa(double taxa){
        this.taxa = (taxa/100);
    }
    public void aplicarRendimento(double taxa) {
        if (taxa == 0){
            return;
        }
        this.taxa = taxa;
        this.saldo += (saldo * (taxa/100));
    }


}

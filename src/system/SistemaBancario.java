package system;

import model.Banco;

import java.util.ArrayList;
import java.util.List;

public class SistemaBancario {
    private List<Banco> bancos;
    public SistemaBancario() {
        this.bancos = new ArrayList<>();
    }
    public void adicionarBanco(Banco banco) {
        this.bancos.add(banco);
    }
    public  void listarBanco(){
        for (Banco banco : bancos){
            System.out.println(banco.getNome());
        }
    }

    public List<Banco> getBancos() {
      return bancos;
    }
}

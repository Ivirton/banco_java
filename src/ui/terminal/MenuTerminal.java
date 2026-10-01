package ui.terminal;


import model.Banco;
import system.SistemaBancario;

public class MenuTerminal  extends Menu{
    private SistemaBancario sistema;
    public MenuTerminal(SistemaBancario sistema){
        this.sistema = sistema;
    }

    public  void menuinicial(){
        this.mostrarMensagem("0 - Entrar");
        this.mostrarMensagem("1 - Sair");

    }
    public  void essssscolherBanco(){
        this.mostrarMensagem("Escolha o Banco");

        for (int i = 0; this.sistema.getBancos().size() > i; i++){
            this.mostrarMensagem(sistema.getBancos().get(i).getNome());
        }


    }
    public void exibirMenuPrincipal(){}
    public void exibirmenuCliente(){
        this.mostrarMensagem("========================================");
        this.mostrarMensagem("            MENU DE CLIENTES            ");
        this.mostrarMensagem("========================================");


    }
    public void exibirmenuConta(){}
    public void exibirmenuTransacao(){}



}

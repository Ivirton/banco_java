import model.Banco;
import ui.swing.TelaConta;
import ui.terminal.CaixaEletronico;
import system.SistemaBancario;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SistemaBancario sistemaBancario = new SistemaBancario();
        CaixaEletronico terminal = new CaixaEletronico(sistemaBancario);
        sistemaBancario.adicionarBanco(new Banco("Java"));
        sistemaBancario.adicionarBanco(new Banco("C"));
        sistemaBancario.adicionarBanco(new Banco("Python"));

        SwingUtilities.invokeLater(() -> {

            TelaConta tela = new TelaConta();

            tela.setVisible(true);

        });
    }
}
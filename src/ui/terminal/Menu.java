package ui.terminal;
import java.util.Scanner;

public abstract class Menu {
    private Scanner in = new Scanner(System.in);
    public void mostrarMensagem(String msg){
        System.out.println(msg);
    }
    public int lerOpcao(){return this.in.nextInt();}
}

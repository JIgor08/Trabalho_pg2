package trabalhopg2;
import java.util.Scanner;

public class Livraria {
    private static Scanner lr = new Scanner(System.in);
    public static void main(String[]args){
        
        Livro l1 = new Livro();
        Cliente c1 = new Cliente();
        Carrinho cr1 = new Carrinho();
        c1.registro("");

        int op;

        
        do{
            System.out.println("\n MENU:");
            System.out.println("1 - Visualizar estoque");
            System.out.println("2 - Selecionar para compra");
            System.out.println("3 - Sair");
            op = lr.nextInt();

            switch (op){
                case 1:
                    l1.Dados();
                case 2:
                    cr1.selecionar();
                case 3: 
                    System.out.println("Saindo");
            }

        } while(op!=3);
        
        
    }

    
}

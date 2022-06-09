package trabalhopg2;
import java.util.Scanner;
public class Cliente {
    String nome,sobrenome;
    int carrinho;
    
    

    void registro(String nome){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite seu nome: ");
            this.nome = input.next();
            System.out.println("Seu sobrenome: ");
            this.sobrenome = input.next();
        }
        
    }
}

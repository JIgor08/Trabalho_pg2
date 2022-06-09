package trabalhopg2;
import java.util.Scanner;
public class Livro{
    
    protected String autor,titulo,genero;
    protected double valor;
    protected int id;

    public Livro(){
        autor = null;
        titulo = null;
        valor = 0;
        id = 0;
        genero = null;
        
    }
    public Livro(String autor, String titulo, float valor, int id, String genero){
        this.autor = autor;
        this.titulo = titulo;
        this.valor = valor;
        this.id = id;
        this.genero = genero;
    }
    

    public int GetId(){
        return id;
    }
    public void SetId(int id){
        this.id = id;
    }
    public String GetAutor(){
        return autor;
    }
    public void SetAutor(String autor){
        this.autor = autor;
    }
    public String GetTitulo(){
        return titulo;
    }
    public void SetTitulo(String titulo){
        this.titulo = titulo;
    }
    public double GetValor(){
        return valor;
    }
    public void SetValor(double valor){
        this.valor = valor;
    }
    public String GetGenero(){
        return genero;
    }
    public void SetGenero(String genero){
        this.genero = genero;
    }

    public void Dados() {
    }

    
    
}
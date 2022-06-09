package trabalhopg2;

class Estoque extends Livro {
    protected int qtlivro;
    
    public int GetQtlivro(){
        return qtlivro;
    }
    public void SetQt(){
        this.qtlivro = 10;
    }
    
    

    public void Dados(){
        System.out.println("Id:"+this.id);
        System.out.println("Titulo:"+this.titulo);
        System.out.println("Autor:"+this.autor);
        System.out.println("Valor:"+this.valor);
        System.out.println("Genero:"+this.genero);        
    }
    
}

package newpackage;

import java.util.Scanner;

public class Funcionario extends Pessoa{
    
    //Scanner.
    Scanner teclado = new Scanner(System.in);
    
    //Atributos.
    private String setor;
    private boolean trabalhando;
    private String novoSetor;
    
    //Construtor.
    public Funcionario(String se, boolean t, String n, int i, String s) {
        super(n, i, s);
        this.setor = se;
        this.trabalhando = t;
    }
    
    //Método.
    
    public void status(){
        
        if(this.getTrabalhando() == true){
            
            System.out.println("-------------------------------------");
            System.out.println("Nome: "+this.getNome());
            System.out.println("Idade: "+this.getIdade());
            System.out.println("Sexo: "+this.getSexo());
            System.out.println("Setor: "+this.getSetor());
            System.out.println("Trabalhando: "+this.getTrabalhando());
            System.out.println("");
            
        }else{
            
            naoTraba();
            System.out.println("Não está trabalhando.");
            
        }
        
    }
    
    public void mudarTraba(){
        
        if (this.getTrabalhando() == true){
            
            this.setSetor(this.getNovoSetor());
            
        }else{
            
            naoTraba();
            
        }
        
    }
    
    public void sMudarTrabalho(){
        
        System.out.println("Qual o novo setor?");
        //this.cor = teclado.next();
        this.novoSetor = teclado.next();
        
    }
    
    public void naoTraba(){
        
        this.setTrabalhando(this.getTrabalhando() == false);
        
    }
    
    //Métodos especiais.
    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String se) {
        this.setor = se;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean t) {
        this.trabalhando = t;
    }

    public String getNovoSetor() {
        return this.novoSetor;
    }

    public void setNovoSetor(String ns) {
        this.novoSetor = ns;
    }
    
}

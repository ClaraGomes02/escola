package newpackage;

public class Pessoa {
    
    //Atributos.
    private String nome;
    private int idade;
    private String sexo;
    
    //Construtor.
    public Pessoa(String n, int i, String s) {
        this.nome = n;
        this.idade = i;
        this.sexo = s;
    }
    
    //Método.
    
    public void status(){
            
            System.out.println("-------------------------------------");
            System.out.println("Nome: "+this.getNome());
            System.out.println("Idade: "+this.getIdade());
            System.out.println("Sexo: "+this.getSexo());
            System.out.println("");
            
    }
    
    public void fazerAniversario(){
        
        this.setIdade(this.getIdade() + 1);
        
    }
    
    //Métodos Especiais.
    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }
    
    
    
}

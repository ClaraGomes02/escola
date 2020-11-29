package newpackage;

public class Professor extends Pessoa{
    
    //Atributos.
    private String especialidade;
    private float salario;
    
    //Construtor.
    public Professor(String e, float sa, String n, int i, String s) {
        super(n, i, s);
        this.especialidade = e;
        this.salario = sa;
    }
    
    //Método.
    
    public void status(){
            
            System.out.println("-------------------------------------");
            System.out.println("Nome: "+this.getNome());
            System.out.println("Idade: "+this.getIdade());
            System.out.println("Sexo: "+this.getSexo());
            System.out.println("Especialidade: "+this.getEspecialidade());
            System.out.println("Salário: "+this.getSalario());
            System.out.println("");
            
    } 
    
    public void receberAume(){
        
        this.setSalario(this.getSalario() + 500);
        
    }
    
    //Métodos especiais.

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String e) {
        this.especialidade = e;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float sa) {
        this.salario = sa;
    }
    
}

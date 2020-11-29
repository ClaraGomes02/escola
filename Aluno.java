package newpackage;

public class Aluno extends Pessoa{
    
    //Atributos.
    private int matricula;
    private String curso;
    
    //Construtor.

    public Aluno(int m, String c, String n, int i, String s) {
        super(n, i, s);
        this.matricula = m;
        this.curso = c;
    }
    
    
    //Método.
    
    public void status(){
            
            System.out.println("-------------------------------------");
            System.out.println("Nome: "+this.getNome());
            System.out.println("Idade: "+this.getIdade());
            System.out.println("Sexo: "+this.getSexo());
            System.out.println("Matrícula: "+this.getMatricula());
            System.out.println("Curso: "+this.getCurso());
            System.out.println("");
            
    } 
    
    public void canceMatri(){
        
        if (this.getMatricula() > 0){
            
            this.setMatricula(0);
            this.setCurso("");
            
        }
        
    }
    
    //Métodos especiais.
    public int getMatricula() {
        return this.matricula;
    }

    public void setMatricula(int m) {
        this.matricula = m;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String c) {
        this.curso = c;
    }
    
}

package newpackage;

public class NewMain {

    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("Maria Clara", 18, "F");
        Aluno p2 = new Aluno(12345, "Informática","José Maria", 59, "M");
        Professor p3 = new Professor("Fotografia", 5.004f, "Clarissa", 47, "F");
        Funcionario p4 = new Funcionario("Administrativo", true, "Maria Lucy", 77, "F");
        
        p1.status();
        p2.status();
        p3.status();
        p4.status();
                
        
    }
    
}

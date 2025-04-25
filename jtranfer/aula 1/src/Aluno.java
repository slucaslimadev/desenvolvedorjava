// Encapsulamento 
// public - todo mundo pode acessar 
// private - 
// protected - algumas pessoas podem acessar 
// package
public class Aluno { // classe
    private String nomeAluno; // atributo nome do Aluno (tipo texto)
    private int idadeAluno; // atributo idade do Aluno (tipo int)
    private int temFaculdade; // atribudo faculdade do Aluno (tipo booleano)
    // Classes Wrapper's
    public Aluno(){
        
    }
    public Aluno(String nomeAluno, int idadeAluno, int temFaculdade){
        this.nomeAluno = nomeAluno;
        this.idadeAluno = idadeAluno;
        this.temFaculdade = temFaculdade;
    }
    public String getNomeAluno(){ //metodo para pegar nome
        return nomeAluno;

    }
    public int getIdadeAluno(){ //metodo para pegar idade
        return idadeAluno;
    }
    public int getTemFaculdade(){ //metodo para pegar tem faculdade
        return temFaculdade;
    }
    

}

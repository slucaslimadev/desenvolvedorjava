import java.util.Scanner; // importando Scanner 

public class AppEscola { 
    public static void main(String args[]){
        // recebe dados do teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("==Pesquisa de Alunos");
        System.out.println("Digite seu nome: ");
        String nomeAluno = teclado.nextLine();
        System.out.println("Qual sua idade? ");
        int idadeAluno = teclado.nextInt();
        System.out.println("Tem faculdade? *0 - Não, 1 - Sim");
        
        int temFaculdade = teclado.nextInt();



        Aluno aluno = new Aluno(nomeAluno, idadeAluno, temFaculdade);
        System.out.println(aluno.getNomeAluno());
        System.out.println(aluno.getIdadeAluno());
        System.out.println(aluno.getTemFaculdade());
        if (temFaculdade == 1) {
            System.out.println("Aluno tem faculdade!");
        } 
 

        


    }
}

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;




public class App {
    public static void main(String[] args) throws Exception {
        // declaração de variáveis
        String nome; // nome funcionario
        int opcaoTransporte; // opcao transporte
        String meioTransporte = ""; // nome do transporte

        // classe para teclado
        Scanner scanner = new Scanner(System.in); // recebe dados do teclado 

        System.out.println("==Pesquisa de Transporte Diário");
        System.out.println("Digite seu nome:");
        nome = scanner.nextLine();
        System.out.println(nome);
        System.out.println("Como você vai ao trabalho?");
        System.out.println("1- Metrô");
        System.out.println("2- Ônibus");
        System.out.println("3- Caminhada");
        System.out.println("4- Uber");
        System.out.println("5- Táxi");
        System.out.println("6- Carro");
        System.out.println("Escolha uma opção de (1-6)");
        opcaoTransporte = scanner.nextInt();
        System.out.println(opcaoTransporte);
        // Opções de transporte 
        switch(opcaoTransporte){
            case 1:
              meioTransporte = "Metrô";break;
            case 2:
              meioTransporte = "Ônibus";break;
            case 3:
             meioTransporte = "Caminhada";break;
            case 4:
             meioTransporte = "Uber";break;
            case 5:
             meioTransporte = "Táxi";break;
            case 6:
             meioTransporte = "Carro";break;
            

        }
        System.out.println("Nome: "+nome+","+"Meio de Transporte: "+meioTransporte);
        // Task de amanhã: Salvar os dados no arquivo.
        // Salvar no github

        // Criando e salvando os dados em txt
        
        try (OutputStreamWriter escrita = new OutputStreamWriter(new FileOutputStream("dados.txt", true), StandardCharsets.UTF_8)) {
            escrita.write(nome + "," + meioTransporte + "\n");

            System.out.println("Dados gravados com sucesso em UTF-8!");

        } catch (IOException e) {
            System.out.println("Erro ao gravar os dados: " + e.getMessage());

        }
        
    }
}

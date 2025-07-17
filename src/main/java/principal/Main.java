package principal;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Quantas pessoas você deseja digitar? ");
       int n = input.nextInt();
       double[] idade =  new double[n];
       String[] nome = new String[n];

        for (int i=0; i<n; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nome[i] = input.next();
            System.out.print("Idade: ");
            idade[i] = input.nextInt();
        }

       double maiorIdade = idade[0];
       int nomemaiorIdade =0;
       for (int i = 0; i < n; i++) {
           if (idade[i] > maiorIdade) {
               maiorIdade = idade[i];
               nomemaiorIdade = i;
               System.out.println("Maior idade: " + nome[nomemaiorIdade]);
           }
       }
        input.close();




    }
}
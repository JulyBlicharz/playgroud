import java.sql.SQLOutput;
import java.util.Scanner;

public class ExemploComandos {
    public static void main(String[] args) {

     //If e Else Statemens
       /*  System.out.println("Qual foi a sua nota?");

        int numero = new Scanner(System.in).nextInt();

        if (numero >= 7) {
            System.out.println("Aprovado");

        } else {
            System.out.println("Reprovado");
        }
        */

      //Switch + case

       /* byte ddd = 55;

        switch (ddd) {
            case 51:
                System.out.println("Regiao Metropolitana");
                break;
            case 53:
                System.out.println("Pelotas e Região");
                break;
            case 54:
                System.out.println("Caxias do Sul e Região");
                break;
            case 55:
                System.out.println("Santa Maria e Região");
                break;
            default:
                System.out.println("Regiao desconhecida");

        }
        */

      //Switch + exercicio Notas Pessimo a Excelente
        /*
        System.out.println("Qual foi a sua nota?");

        int numero = new Scanner(System.in).nextInt();

        switch (numero) {
            case 0: // se eu deixar em branco e tirar o break, ele ira executar o case 1
                System.out.println("0/1 - péssimo");
                break;
            case 1:
                System.out.println("0/1 - péssimo");
                break;
            case 2:
                System.out.println("2-ruim");
                break;
            case 3:
                System.out.println("3-Regular");
                break;
            case 4:
                System.out.println("4-Bom");
                break;
            case 5:
                System.out.println("5 Excelente");
                break;
            default:
                System.out.println("nao participou da prova");

        }

        int contador = 0;
        while (contador <= 10) {
            contador = contador + 1;
            System.out.println(contador);
        }

        */


        // Imprima os nr de 150 a 300 (While)

        /* System.out.println("Digite um nr?");
        int myInt = new Scanner(System.in).nextInt();

            while (myInt >= 150 && myInt<=300) { // nao pedir para o usuario, declarar o 150 e fazer o loop
            myInt = myInt+1;
            System.out.println(myInt);

            }

        int count = 0;
        for (count =150, count <300, count=count+1); {
            System.out.println(count + " ");
        }

        */


     // Imprima os nr de 150 a 300 (Do While e FOR)
        /*
        System.out.println("WHILE LOOP");
        int myInt = 150;
        while (myInt<=300) {
            System.out.println(myInt);
            myInt = myInt+1;
        }
        System.out.println("DO WHILE");

        int urInt = 150;
        do {
            System.out.println(urInt);
            urInt = urInt + 1;
        } while (urInt<=300);

        System.out.println("FOR LOOP");

        for (int nrInt = 150; nrInt<=300; nrInt = nrInt+1) {
            System.out.println(nrInt);
        }
        */

//"Some 1 até 1000

     /*   System.out.println("Some 1 até 1000 (some 0+1+2+3...1000) e imprima cada cálculo no console\n" +
                "utilizando for");
        int soma = 0;
        for (int myInt = 1; myInt<=1000; myInt++) {

            soma = myInt+soma;
            System.out.println( "myInt ="+ myInt + "-> " +soma);
        }
*/

        //Imprima os múltiplos de 3

       /*System.out.println("\nImprima todos os   múltiplos de 3, entre 1 e 100 utilizando for");

        for (int multiplo = 1; multiplo <=100; multiplo = multiplo+1) {
            if (multiplo % 3 == 0)
            System.out.println("Multiplo de 3: " + multiplo);
        }
        */


      //Imprima os Fatoriais de 1 a 10

        /*System.out.println("Imprima os fatoriais de 1 a 10 utilizando FOR");

        int fatorial = 0;
        for(int contador =0; contador <=10; contador++) {
            if (contador <= 1) {
                fatorial = 1;
            } else {
                fatorial = contador * fatorial;
            }
            System.out.println(contador + "!: " + fatorial);
        }
*/

    }
}

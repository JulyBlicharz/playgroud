public class ExerciciosIIComandos {

    public static void main(String[] args) {
        //   imprimirSoma();
        //   int retorno = imprimirFatoral();

    //} METODO imprimirFatorial + retorno

    /*private static int imprimirFatoral() {
        System.out.println("Imprimir Fatorial");

        int fatorial = 0;
        for (int contador = 0; contador <= 10; contador++) {
            if (contador <= 1) {
                fatorial = 1;
            } else {
                fatorial = contador * fatorial;
            }
            System.out.println(contador + "!: " + fatorial);
        }
        System.out.println("____________");
        return fatorial;
    }*/

    //Metodo Imprimir Soma 1 a 100

    /*public static void imprimirSoma() {

        System.out.println("ImprimirSoma1te100");

        int soma = 0;
        for (int i=1; i <100; i++) {
            soma = i+1;
            System.out.println("i = " +i + "->"+soma);
        }
        System.out.println("______________");

       } */
   //    ARRAYS
/*
        int[] anos = new int[2];
        anos[0] = 2020;
        anos[1] = 2021;

        System.out.println(anos[0]);

        char[] tiposDeConta = new char[]{'C', 'D'};

        for (int i = 0; i < 2; i++) { // ou i < tiposDeConta.length
            System.out.println(tiposDeConta[i]);
        }

        //FOREACH
        //tipo nome : array

        for (char tipoConta : tiposDeConta) {
            System.out.println(tipoConta);
        }
*/

        // MENOR VALOR DE UMA LISTA

/*
        int[] numeros = {88, 7, 0, -1, 45, 3, 92, -9, 300000001, 12, 23567};
        int menorValor = numeros[0]; // sempre o primeiro ->88
        for (int valor : numeros) { // valor verifica todos os valores e compara com 88
            if (valor < menorValor) {
                menorValor = valor;
            }
        }
            System.out.println("Menor valor: " + menorValor); // fora do loop. Assume o ultimo valor de menorValor
*/

       }

    }





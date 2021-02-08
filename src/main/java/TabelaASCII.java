import java.util.Scanner;

public class TabelaASCII {

    public static void main(String[] args) {

        //int -> char

        /*
        int[] numeros = {86, 99, 32, 101, 104, 32, 100, 101, 109, 97, 105,
                115, 33, 32, 83, 117, 97, 32, 114, 101, 115, 111, 108, 117, 99, 97,
                111, 32, 101, 115, 116, 97, 104, 32, 99, 111, 114, 114, 101, 116, 97,
                33, 33, 32, 78, 97, 111, 32, 99, 111, 110, 116, 101, 32, 97, 111, 115,
                32, 100, 101, 109, 97, 105, 115, 32, 58, 41};

        for (int i = 0; i < numeros.length; i++) {
              System.out.print(Character.toString(numeros[i]));
        }

          //  for (int i = 0; i < numeros.length; i++) {
          //  System.out.print((char)numeros[i]);
                //}

    }
    */


     /*
        Crie uma função que recebe uma classe Character (pressupondo que seja uma letra maiúscula)
        e converta a mesma para minúscula.
         */
        //char letraX = 'C';
        //char k = Character.toLowerCase(letraX);
        //System.out.println(k);


        //String letraC = converteEmMinuscula('C');
        //System.out.println(letraC);

        //  String letraD = converteEmMinuscula(Character.valueOf('D'));
        //  System.out.println(letraD);

        String blin = "KURWA";

        System.out.println(converteEmMinuscula(blin));

        System.out.println(blin + converteEmMinuscula(blin));
    }

    public static String converteEmMinuscula(String blin) {
        String letraC = blin.toLowerCase();
        System.out.println(letraC);

        return letraC;

    }

}





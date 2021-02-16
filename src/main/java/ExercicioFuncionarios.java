import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ExercicioFuncionarios {

    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(Path.of("src/main/resources/pessoas.csv"));
        System.out.println(sc.nextLine());

            while (sc.hasNext()) {
                String line = sc.nextLine();
                listaDeFuncionarios(line);
            }

    }
    public static void listaDeFuncionarios(String line) throws IOException {
     //   Scanner sc = new Scanner(Path.of("src/main/resources/pessoas.csv")); // erro dentro do metodo le o sacenner 1 linha sempre

       // sc.nextLine();
        //String linha = sc.nextLine();
        String[] funcionarios = line.split(",");

        float salario = (Float.parseFloat(funcionarios[3]));
        float beneficio = (Float.parseFloat(funcionarios[4]));

        StringBuilder builder = new StringBuilder(); //System.out.println(funcionarios[1]+ " "+ funcionarios[2]+" - "+ funcionarios[3]+ " + " +funcionarios[4]);
        builder.append(funcionarios[1] + " ").append(funcionarios[2] + ", ");
        builder.append(salario + beneficio);
        String cadastro = builder.toString();
        System.out.println(cadastro);


        }

        /*  boolean testeNovaLina = linha.hasNext();

        //boolean testeNovaLina = sc.hasNext(); // boolean - saber se ha uma nova linha **nao chamar infinitamente
        //String linha = sc.nextLine(); // troca e retorna uma nova linha
        */


}


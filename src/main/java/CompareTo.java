import java.util.Scanner;

public class CompareTo {

    public static void main(String[] args) {

        //COMPARACAO

        /*System.out.println("Dog".compareTo("DOG") == 0);
        // System.out.println("Dog".compareToIgnoreCase("DOG"));
         System.out.println("Dog".equals("DOG"));
        System.out.println("teste");

        System.out.println("Dog".equalsIgnoreCase("DOG"));
        */

        //Metods String (trim/isEmpty/isBlank
        /*
        //String senha = "  se   nha  a";
        //System.out.println(senha.trim());

        // System.out.println("".isEmpty()); // true
        // System.out.println("      ".isEmpty());// false pois considera os espaos em branco mo caracter
        // System.out.println("       ".isBlank()); // true, pois considera apenas caracther, espaço m branco considera empty

        // System.out.println("Enter your email: ");
        //String email = new Scanner(System.in).nextLine();

        //String emailSemEspacos = email.trim();
        //System.out.println(email.equals("chuckemail@gmail.com"));

        //if (emailSemEspacos.isBlank()) {
        //  System.out.println("Bem Vindo" + email);
        //        } else {
        //System.out.println("É necessario informar seu email");
        */

        //Metods String )replaceAll/endsWith
        /*
        //String ditado = "Cao que ladra nao morde";
        //System.out.println(ditado.replaceAll("nao", " "));
       // System.out.println("seusite.com".endsWith(".com"));
        */

        //String.format e concatenacao
        /*
        int qnt = 125;
        String fruta = "tomate";
        String informacao = String.format("Total: %d tomates", qnt); // usa menos memoria q a concatenacao, mas é mais lento

        //System.out.println("Total: %d %s", qnt, fruta); // melhor

        System.out.println(informacao);
        String informacao2 = "Total: "+qnt+ " "+"tomate"; // usa mais memoria - sempre q possivel usar o format
        */

        //valueOff -> transforma em String
        //charAt -> obtem o char em uma  determinada posicao
        //getByte -> retorna a string em bytes (como um array)
        /*
        char primeiraLetra = "Cao".charAt(0);
        System.out.println(primeiraLetra);

        //getBytes();
        byte[] bytesDoCao = "Cao".getBytes();
        String aVoltaDaString = new String(bytesDoCao);
*/


        //String Builder e String Buffer

        /*StringBuilder builder = new StringBuilder();
        builder.append("Itens: ");
        for (int i = 0; i < 10; i++) {
            builder.append(i).append("-");
        }
        System.out.println(builder.toString());
*/
    }
}
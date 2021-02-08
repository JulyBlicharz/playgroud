import java.util.Scanner;

public class CompareTo {

    public static void main(String[] args) {
        System.out.println("Dog".compareTo("DOG") == 0);
        // System.out.println("Dog".compareToIgnoreCase("DOG"));
         System.out.println("Dog".equals("DOG"));

        // System.out.println("Dog".equalsIgnoreCase("DOG"));

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

        //String ditado = "Cao que ladra nao morde";
        //System.out.println(ditado.replaceAll("nao", " "));


       // System.out.println("seusite.com".endsWith(".com"));

        int qnt = 125;
        String fruta = "tomate";
        String informacao = String.format("Total: %d tomates", qnt); // usa menos memoria q a concatenacao, mas é mais lento

        //System.out.println("Total: %d %s", qnt, fruta); // melhor

        System.out.println(informacao);
        String informacao2 = "Total: "+qnt+ " "+"tomate"; // usa mais memoria - sempre q possivel usar o format


        //valueOff -> transforma em String
        //charAt

        char primeiraLetra = "Cao".charAt(0);
        System.out.println(primeiraLetra);

        //getBytes()
        byte[] bytesDoCao = "Cao".getBytes();
        String aVoltaDaString = new String(bytesDoCao);

        //String Builder e String Buffer

      //  StringBuilder builder = new StringBuilder();
      //  builder.append("Itens: ");
       // for (i=0; i<100; i++) {
          //  builder.append(i);
        }
        //System.out.println(builder.toString());




        }



public class Aula_ExercicioFunciionarios {

/*

        /*
         * - Vamos ler o arquivo pessoas.csv e para cada linha
         * mostraremos o nome completo (nome + sobrenome)
         * e o valor do salário com benefícios.

       public static void main(String[] args) throws IOException {

                //Lê arquivo
                Scanner scanner = new Scanner(Path.of("src/main/resources/dados/pessoas.csv"));
//        Scanner scanner = new Scanner(SalarioFuncionarios.class.getResourceAsStream("/dados/pessoas.csv"));

                System.out.println("Ignorado: "+scanner.nextLine());

                System.out.printf("\n%-20s \t %s \n\n", "Nome", "Salário+Benefícios");

                StringBuffer stringBuffer = new StringBuffer();

                while (scanner.hasNext()){
                    String linha = scanner.nextLine();

                    String nome = obtemNomeCompleto(linha);
                    float soma = obtemSomaSalarioBeneficios(linha);

                    stringBuffer.append(String.format("%-20s \t R$ %.2f \n", nome, soma));
                }

                System.out.print(stringBuffer.toString());
            }

            private static String obtemNomeCompleto(String linha) {
                String[] partes = linha.split(",");
                return new StringBuffer(partes[1])
                        .append(" ")
                        .append(partes[2])
                        .toString();
            }

            private static float obtemSomaSalarioBeneficios(String linha) {
                String[] partes = linha.split(",");
                return Float.parseFloat(partes[3])+Float.parseFloat(partes[4]);
            }
        }

    }
}
         */
}
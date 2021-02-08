public class InformacoesSistema {
    public static void main(String[] args) {

        System.out.println("Processadores disponiveis: ");
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.printf("Processadores disponiveis: %d \n", Runtime.getRuntime().availableProcessors());

        System.out.println("Memoria máxima utilizada pela JVM (HEAP): ");
        System.out.printf(" %d MB \n",  Runtime.getRuntime().maxMemory()/1024/1024); // divisao para tornar KB em megabyte

        System.out.println("Memoria máxima utilizada pela JVM (HEAP): ");
        System.out.printf(" %d MB \n", Runtime.getRuntime().totalMemory()/1024/1024); // resultado 128, O quanto o pc disponibiliz. é possivel impor limiter
        // em caso de nao ter memoria, o pc ira acusar










    }

}
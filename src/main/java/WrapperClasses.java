public class WrapperClasses {

    public static void main(String[] args) {
        // soComPrimitivos();

        float salario = 0; // nunca tem o valor nulo
        Float beneficio; // Por referencia nao ha necessidade de colocar o null

       // System.out.println(salario);
        //System.out.println(beneficio);


    }

    public static void soComPrimitivos() {

        int[] lista = new int [1];
        lista [0] = 25;
        int primeiroNumero = lista [0];
        }

    public static void soComWrapper() {

        Integer [] lista = new Integer [1];
        lista [0] = Integer.valueOf(25); // new Integer(25);
        Integer primeiroNumero = lista [0];
        int compareTo = primeiroNumero.compareTo(25);

    }




}

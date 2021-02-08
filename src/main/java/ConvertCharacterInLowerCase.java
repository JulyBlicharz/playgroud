public class ConvertCharacterInLowerCase {
    public static void main(String[] args) {

        String letraC = convertToLowerCase('B');
        System.out.println(letraC);

    }

    public static String convertToLowerCase (Character letraC) {

        Character word = letraC;

        return String.valueOf(Character.toLowerCase(word)); // convert Character in a String
    }

}

package B11_20;

public class L13_StringMethods {
    public static void main(String[] args){

        String name = "Biggetje";

        int length = name.length();
        System.out.println(length);

        char letter = name.charAt(0);
        System.out.println(letter);

        int index = name.indexOf("g");
        System.out.println(index);

        int lastIndex = name.lastIndexOf("e");
        System.out.println(lastIndex);

        name = name.toUpperCase();
        System.out.println(name);

        name = name.toLowerCase();
        System.out.println(name);

        name = "       Biggetje      ";
        System.out.println(name);

        name = name.trim();
        System.out.println(name);

        name = name.replace("e", "a");
        System.out.println(name);

        System.out.println(name.isEmpty()); //completely nothing
        System.out.println(name.isBlank()); //no text or numbers, spaces and enters possible

        name = "Biggetje";
        System.out.println(name.contains("a"));

        System.out.println(name.equals("biggetje"));
        System.out.println(name.equalsIgnoreCase("biggetje"));
    }
}

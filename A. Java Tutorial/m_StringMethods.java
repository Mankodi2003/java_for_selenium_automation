public class m_StringMethods {
    public static void main(String[] args) {
        String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the text string is: " + text.length());



        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());

        System.out.println(txt.indexOf("World"));

        System.out.println(txt.charAt(8));

        String txt1 = "Hello";
        String txt2 = "Hello";

        String txt3 = "Greetings";
        String txt4 = "Great things";

        System.out.println(txt1.equals(txt2));
        System.out.println(txt3.equals(txt4));

        String txt5 = "      Hello World      ";
        System.out.println("Before: [" + txt5 + "]");
        System.out.println("After: [" + txt5.trim() + "]");
    }
}
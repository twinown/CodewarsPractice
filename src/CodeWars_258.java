public class CodeWars_258 {
    public static boolean validateHello(String greetings) {
        greetings = greetings.toLowerCase();
        return greetings.contains("hello")
                || greetings.contains("ciao")
                || greetings.contains("salut")
                || greetings.contains("hallo")
                || greetings.contains("hola")
                || greetings.contains("ahoj")
                || greetings.contains("czesc");
    }

    public static void main(String[] args) {
        System.out.println(validateHello("hello"));
    }
}

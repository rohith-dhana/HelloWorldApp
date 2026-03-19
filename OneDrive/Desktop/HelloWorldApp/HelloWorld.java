public class HelloWorld {
    public static void main(String[] args) {

        // Default name is "World"
        String name = (args.length > 0) ? args[0] : "World";
        System.out.println("Hello " + name);

    }
}
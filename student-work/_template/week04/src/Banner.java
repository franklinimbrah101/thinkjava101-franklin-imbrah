public class Banner {

    public static void dashes() {
        System.out.println("--------------------");
    }

    public static void title() {
        dashes();
        System.out.println("MY FIRST PROGRAM");
        dashes();
    }

    public static void main(String[] args) {
        title();
        System.out.println("Hello, methods!");
        dashes();
    }
}
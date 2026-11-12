public class SwitchDemo {

    public static String numberWord(int number) {

        String word;

        switch (number) {

            case 1:
                word = "one";
                break;

            case 2:
                word = "two";
                break;

            case 3:
                word = "three";
                break;

            default:
                word = "unknown";
                break;
        }

        return word;
    }

    public static void describe(String food) {

        switch (food) {

            case "apple":
            case "banana":
            case "cherry":
                System.out.println(food + ": Fruit!");
                break;

            case "asparagus":
            case "broccoli":
            case "carrot":
                System.out.println(food + ": Vegetable!");
                break;

            default:
                System.out.println(food + ": unknown food");
                break;
        }
    }

    public static void main(String[] args) {

        System.out.println("2 is " + numberWord(2));
        System.out.println("7 is " + numberWord(7));

        describe("banana");
        describe("carrot");
        describe("pizza");
    }
}
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--->GUI

//        String name = JOptionPane.showInputDialog("Enter your name");
//        JOptionPane.showMessageDialog(null, "Hello " + name);
//
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
//        JOptionPane.showMessageDialog(null, "You are " + age + " years old!");

        //--->Triangle

//        double x;
//        double y;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter side x:");
//        x = scanner.nextDouble();
//
//        System.out.println("Enter side y:");
//        y = scanner.nextDouble();
//
//        double x2 = x*x;
//        double y2 = y*y;
//        double hypotenuse = Math.sqrt(x2+y2);
//
//        System.out.println("The hypotenuse is " + hypotenuse);
//
//        scanner.close();

//        ---> if/else statement with scanner
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("How old are you?");
//        int age = scanner.nextInt();
//
//        if (age >= 75) {
//            System.out.println("You are a senior citizen.");
//        } else if (age >= 13 && age <= 19) {
//            System.out.println("You are a teenager.");
//        } else if (age >= 20 && age <= 29) {
//            System.out.println("You are a twenty something.");
//        }else {
//            System.out.println("You are neither a teenager nor a senior citizen.");
//        }
//
//        scanner.close();

//        ---> Switch Statements

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("What day of the week is it?");
//        String day = scanner.next();
//        switch (day) {
//            case "Sunday" -> System.out.println("Today is Sunday.");
//            case "Monday" -> System.out.println("Today is Monday.");
//            case "Tuesday" -> System.out.println("Today is Tuesday.");
//            case "Wednesday" -> System.out.println("Today is Wednesday.");
//            case "Thursday" -> System.out.println("Today is Thursday.");
//            case "Friday" -> System.out.println("Today is Friday.");
//            case "Saturday" -> System.out.println("Today is Saturday.");
//            default -> System.out.println("That is not a day.");
//        }
//        scanner.close();

//        ---> While Loop

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("What do you have to say for yourself?");
//        String input = sc.nextLine();
//
//        do {
//            System.out.println("Well...we are waiting...");
//            input = sc.nextLine();
//
//        } while (input.isBlank());
//
//        System.out.println("Your input was " + input + " which is ultimately useless. Goodbye.");
//
//        sc.close();

//        System.out.println("What do you have to say for yourself?");
//        String input = sc.nextLine();
//
//        while(input.isBlank()){
//            System.out.println("We are still waiting...");
//            input = sc.nextLine();
//        }
//
//        System.out.println("Meaningless... " + input);


//        for (int i = 10; i >= 0; i--) {
//            System.out.println("Happy to count to " + i + " with you.");
//        }
//
//        System.out.println("Numbers are fun...now go count this money!");

//        ---> Nested Loop

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Input number of rows: ");
//        int rows = sc.nextInt();
//        System.out.print("Input number of columns: ");
//        int columns = sc.nextInt();
//        System.out.print("Input symbol of your choice: ");
//        String symbol = sc.next();
//
//        for (int i = 1; i <= rows; i++) {
//            System.out.println();
//            for (int j = 1; j <= columns; j++) {
//                System.out.print(symbol);
//            }
//        }

//        ---> Arrays
//
//        String[] cars = {"Corvette", "Mustang", "Camaro"};
//
//        for (String car : cars) {
//            System.out.println(car);
//        }

//        ---> 2D Arrays
//        String[][] cars = new String[3][3];
//        cars[0][0] = "BWM";
//        cars[0][1] = "Tesla";
//        cars[0][2] = "Ford";
//
//        cars[1][0] = "Nissan";
//        cars[1][1] = "Volkswagen";
//        cars[1][2] = "Honda";
//
//        cars[2][0] = "Lamborghini";
//        cars[2][1] = "Jeep";
//        cars[2][2] = "Fiat";
//
//        for (int i = 0; i < cars.length; i++) {
//            System.out.println();
//            for (int j = 0; j < cars[i].length; j++) {
//                System.out.print(cars[i][j] + " ");
//            }
//        }
//
//        ---> String Methods
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What is your name in all caps? ");
//        String caps = scanner.next();
//        System.out.print("What is your name in all lowercase? ");
//        String lowercase = scanner.next();
//        System.out.println("I will tell you if they both are the same...and...");
//        if (caps.equalsIgnoreCase(lowercase)) {
//            System.out.println("Your name is the same, congratulations!");
//        } else {
//            System.out.println("Unfortunately, they are not the same so...later.");
//        }
//
//        ---> ArrayLists
//
//        ArrayList<String> food = new ArrayList<>();
//        food.add("pizza");
//        food.add("hamburger");
//        food.add("hot dog");
//        food.add("chicken");
//
//        food.set(2, "sushi");
//
//        for (int i = 0; i < food.size(); i++) {
//            System.out.println(food.get(i));
//        }
//
//        2D ArrayList
//
//        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
//
//        ArrayList<String> produceList = new ArrayList<>();
//        produceList.add("apples");
//        produceList.add("broccoli");
//        produceList.add("peppers");
//
//        ArrayList<String> meatList = new ArrayList<>();
//        meatList.add("chicken");
//        meatList.add("fish");
//        meatList.add("steak");
//
//        ArrayList<String> snackList = new ArrayList<>();
//        snackList.add("chips");
//        snackList.add("doughnuts");
//        snackList.add("candy");
//
//        groceryList.add(produceList);
//        groceryList.add(meatList);
//        groceryList.add(snackList);
//
//
//        System.out.println(groceryList);
//
//        System.out.println(groceryList.get(1).get(1));
//
//        ---> For-Each Loop
//
//        ArrayList<String> xmen = new ArrayList<String>();
//        xmen.add("Cyclops");
//        xmen.add("Storm");
//        xmen.add("Wolverine");
//
//
//        for (String i : xmen) {
//            System.out.println(i);
//        }
//

    }
}
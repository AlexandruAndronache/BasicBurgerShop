import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    private ArrayList<String> meat = new ArrayList<>();
    private ArrayList<String> bread = new ArrayList<>();
    private ArrayList<String> vegetables = new ArrayList<>();
    private ArrayList<String> sauce = new ArrayList<>();

    private ArrayList<String> addBread() {
        ArrayList<String> breadMenu = new ArrayList<>();
        System.out.println("Add the type of bread, type 'quit' to quit");

        while (true) {
            String breadFromKeyboard = scanner.nextLine();

            if (breadFromKeyboard.equals("quit")) {
                break;
            }

            breadMenu.add(breadFromKeyboard);
        }

        System.out.println("You've added:");
        for (int i = 0; i < breadMenu.size(); i++) {
            System.out.println(breadMenu.get(i) + ", ");
        }
        return breadMenu;
    }

    private ArrayList<String> addMeat() {
        ArrayList<String> meatMenu = new ArrayList<>();
        System.out.println("Add the type of meat, type -1 to quit");

        while (true) {
            String meatFromKeyboard = scanner.nextLine();

            if (Integer.parseInt(meatFromKeyboard) == -1) {
                break;
            }

            meatMenu.add(meatFromKeyboard);
        }

        return meatMenu;
    }

    private ArrayList<String> addVegetables() {
        ArrayList<String> vegetablesMenu = new ArrayList<>();
        System.out.println("Add the type of vegetables, type -1 to quit");

        while (true) {
            String vegetablesFromKeyboard = scanner.nextLine();

            if (Integer.parseInt(vegetablesFromKeyboard) == -1) {
                break;
            }

            vegetablesMenu.add(vegetablesFromKeyboard);
        }

        return vegetablesMenu;
    }

    private ArrayList<String> addSauce() {
        ArrayList<String> sauceMenu = new ArrayList<>();
        System.out.println("Add the type of sauce, type -1 to quit");

        while (true) {
            String sauceFromKeyboard = scanner.nextLine();

            if (Integer.parseInt(sauceFromKeyboard) == -1) {
                break;
            }

            sauceMenu.add(sauceFromKeyboard);
        }

        return sauceMenu;
    }

    public void createMenu() {
        System.out.println("1 - to add bread");
        System.out.println("2 - to add meat");
        System.out.println("3 - to add vegetables");
        System.out.println("4 - to add sauce");
        System.out.println("0 - to quit ");

        int choice = Integer.parseInt(scanner.nextLine());
        boolean isTrue = true;

        while (isTrue) {

            switch (choice) {
                case 1:
                    bread = addBread();
                    choice = scanner.nextInt();
                    break;

                case 2:
                    meat = addMeat();
                    choice = scanner.nextInt();
                    break;

                case 3:
                    vegetables = addVegetables();
                    choice = scanner.nextInt();
                    break;

                case 4:
                    sauce = addSauce();
                    choice = scanner.nextInt();
                    break;

                case 0:
                    System.out.println("Quitting...");
                    isTrue = false;

                    break;
            }

        }
    }

    public void displayMenu() {
        for (int i = 0; i < bread.size(); i++) {
            System.out.println(bread.get(i) + ", ");
        }

        for (int i = 0; i < meat.size(); i++) {
            System.out.println(meat.get(i) + ", ");
        }

        for (int i = 0; i < vegetables.size(); i++) {
            System.out.println(vegetables.get(i) + ", ");
        }

        for (int i = 0; i < sauce.size(); i++) {
            System.out.println(sauce.get(i) + ", ");
        }
    }
    
    public boolean checkBread(String bread){

        for (int i = 0; i < this.bread.size() ; i++) {
            
            if (this.bread.get(i).equals(bread)){
                return true;
            }
        }
        
        return false;
    }
    public boolean checkMeat(String meat){

        for (int i = 0; i < this.meat.size() ; i++) {

            if (this.meat.get(i).equals(meat)){
                return true;
            }
        }

        return false;
    }

    public boolean checkVegetables(String vegetables){

        for (int i = 0; i < this.vegetables.size() ; i++) {

            if (this.vegetables.get(i).equals(vegetables)){
                return true;
            }
        }

        return false;
    }

    public boolean checkSauce(String sauce){

        for (int i = 0; i < this.sauce.size() ; i++) {

            if (this.sauce.get(i).equals(sauce)){
                return true;
            }
        }

        return false;
    }

    
    


}

import java.util.Scanner;

class Customer {

    String[] cat = {"Dairy", "Snacks", "Beverages"};
    String[] dairy = {"Milk", "Paneer", "Curd"};
    String[] snacks = {"Chips", "Biscuits", "Samosa"};
    String[] drinks = {"Coffee", "Lemon Soda", "Badam Milk"};
    int[] dp = {28, 90, 35};
    int[] sp = {20, 15, 12};
    int[] bp = {25, 30, 45};
    int tot = 0;
    int[][] quantity = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

    void getMenu() {
        System.out.println("Categories:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + cat[i] + ":");
            if (i == 0) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("   " + (j + 1) + ". " + dairy[j] + ": Rs." + dp[j]);
                }
            } else if (i == 1) {
                for (int j = 0; j < 3; j++) {
                    System.out.println("   " + (j + 1) + ". " + snacks[j] + ": Rs." + sp[j]);
                }
            } else {
                for (int j = 0; j < 3; j++) {
                    System.out.println("   " + (j + 1) + ". " + drinks[j] + ": Rs." + bp[j]);
                }
            }
        }
    }

    void getDairy() {
        System.out.println("Dairy & Price:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + dairy[i] + ": Rs." + dp[i]);
        }
    }

    String getDairy(int i) {
        return dairy[i - 1];
    }

    void getSnacks() {
        System.out.println("Snacks & Price:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + snacks[i] + ": Rs." + sp[i]);
        }
    }

    String getSnack(int i) {
        return snacks[i - 1];
    }

    void getDrinks() {
        System.out.println("Beverages & Price:");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " + drinks[i] + ": Rs." + bp[i]);
        }
    }

    String getDrink(int i) {
        return drinks[i - 1];
    }

    void setQuantity(int i, int j, int k) {
        quantity[i - 1][j - 1] += k;
    }

    void getTotal() {
        tot = 0; // reset so the total isn't added twice when viewed again
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    tot += quantity[i][j] * dp[j];
                } else if (i == 1) {
                    tot += quantity[i][j] * sp[j];
                } else {
                    tot += quantity[i][j] * bp[j];
                }
            }
        }
        System.out.println("Total is Rs." + tot);
    }
}

class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Store:");
        while (true) {
            System.out.println("1. View Categories");
            System.out.println("2. Add items");
            System.out.println("3. View total");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    c1.getMenu();
                    break;
                case 2:
                    System.out.println("Select category:");
                    int catChoice = sc.nextInt();
                    switch (catChoice) {
                        case 1:
                            c1.getDairy();
                            System.out.println("Select dairy item to add (1-3):");
                            int dairyChoice = sc.nextInt();
                            System.out.println("Enter quantity:");
                            int quantity1 = sc.nextInt();
                            c1.setQuantity(1, dairyChoice, quantity1);
                            System.out.println(quantity1 + " " + c1.getDairy(dairyChoice) + " added to cart.");
                            break;
                        case 2:
                            c1.getSnacks();
                            System.out.println("Select snack to add (1-3):");
                            int snackChoice = sc.nextInt();
                            System.out.println("Enter quantity:");
                            int quantity2 = sc.nextInt();
                            c1.setQuantity(2, snackChoice, quantity2);
                            System.out.println(quantity2 + " " + c1.getSnack(snackChoice) + " added to cart.");
                            break;
                        case 3:
                            c1.getDrinks();
                            System.out.println("Select beverage to add (1-3):");
                            int drinkChoice = sc.nextInt();
                            System.out.println("Enter quantity:");
                            int quantity3 = sc.nextInt();
                            c1.setQuantity(3, drinkChoice, quantity3);
                            System.out.println(quantity3 + " " + c1.getDrink(drinkChoice) + " added to cart.");
                            break;
                        default:
                            System.out.println("Invalid category choice.");
                    }
                    break;
                case 3:
                    c1.getTotal();
                    break;
                case 4:
                    System.out.println("Thank you for shopping!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
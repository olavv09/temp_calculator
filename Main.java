import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice;
        do {
        System.out.println("What temperature unit do you want to enter first? ");
        System.out.println("1.Celcius\n2.Kelvin\n3.Fahrenheit\n4.Exit");
        choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the temperature in C :");
                    float celcius = keyboard.nextFloat();
                    System.out.println("What temperature do you want to convert to:");
                    System.out.println("1.Fahrenheit\n" + "2.Kelvin\n");
                    int choice2 = keyboard.nextInt();
                    switch (choice2) {
                        case 1:
                            float C_to_F = (float) ((celcius * 1.8) + 32);
                            System.out.println("F=" + C_to_F);
                            break;
                        case 2:
                            float C_to_K = (float) (celcius + 273.15);
                            System.out.println("K=" + C_to_K);
                            break;
                    }
                    break;
                case 2:
                    System.out.print("Enter the temperature in K :");
                    Float kelvin = keyboard.nextFloat();
                    System.out.println("What temperature do you want to convert to:");
                    System.out.print("1.Celcius\n" + "2.Fahrenheit\n");
                    int choice3 = keyboard.nextInt();
                    switch (choice3) {
                        case 1:
                            float K_to_C = (float) (kelvin - 273.15);
                            System.out.println("C=" + K_to_C);
                            break;
                        case 2:
                            float K_to_C2 = (float) (kelvin - 273.15);
                            float K_to_F = (float) ((K_to_C2 * 1.8) + 32);
                            System.out.println("F=" + K_to_F);
                            break;
                    }
                    break;
                case 3:
                    System.out.print("Enter the temperature in F :");
                    float fahrenheit = keyboard.nextFloat();
                    System.out.print("What temperature do you want to convert to:");
                    System.out.println("1.Celcius\n" + "2.Kelvin\n");
                    int choice4 = keyboard.nextInt();
                    switch (choice4) {
                        case 1:
                            float F_to_C = (float) ((fahrenheit - 32)/1.8);
                            System.out.println("C=" + F_to_C);
                            break;
                        case 2:
                            float F_to_K = (float) ((fahrenheit + 459.67)*(5/9));
                            System.out.println("K=" + F_to_K);
                            break;
                    }
                    break;
                case 4:
                    break;
            }
        } while (choice!=4);
    }
}
package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean running = true; // Holder programmet kørende

        while (running) {

            System.out.println("Calculator");

            //Første tal indtastnings kode del
            System.out.println("Indtast det første tal, og tast 'C' hvis du fortryder det indtastet tal:");
            String input1 = scanner.next();

            // fortrydelses logik for indtastning af C for første tal
            if (input1.equalsIgnoreCase("C")) {
                System.out.println("Det første tal er slettet! Start forfra...");
                continue; //  while-loopet starter for fra
            }
            // Konverter første tal, input1 til en double
            double firstNumber = Double.parseDouble(input1);


            // Operation indtastning kode del
            System.out.println("Vælg operation (+, -, *, /, %) eller tast 'C' hvis du fortryder den indtastet operation:");
            String operation = scanner.next();


            // fortrydelses logik for indtastning af C for operation
            if (operation.equalsIgnoreCase("C")) {
                System.out.println("Du har valgt at slette operatoren! Start forfra...");
                continue; // while-loopet starter forfra
            }


            // Andet tal indtastnings kode del
            System.out.println("Indtast det andet tal, og tast 'C' hvis du fortryder det indtastet tal:");
            String input2 = scanner.next();

            if (input2.equalsIgnoreCase("C")) {
                System.out.println("Du har valgt at slette tallet! Start forfra...");
                continue;
            }

            // Konverter det andet tal
            double secondNumber = Double.parseDouble(input2);



            double result = 0; // En start værdi

            // Beregnings logik
            try {
                switch (operation) {
                    case "+":
                        result = calculator.Addition(firstNumber, secondNumber);
                        break;
                    case "-":
                        result = calculator.Subtraction(firstNumber, secondNumber);
                        break;
                    case "*":
                        result = calculator.Multiplication(firstNumber, secondNumber);
                        break;
                    case "/":
                        result = calculator.Division(firstNumber, secondNumber);
                        break;
                    case "%":
                        result = calculator.Modulus(firstNumber, secondNumber);
                        break;
                    default:
                        System.out.println("Ugyldig operation! Prøv igen.");
                        continue;
                }

                System.out.println("Resultat: " + result);
            } catch (Exception e) {
                System.out.println("Fejl: " + e.getMessage());
            }

            // Slut logik
            // Spørger brugeren, om de vil fortsætte eller afslutte
            System.out.println("Tryk 'Q' for at afslutte eller 'Enter' for at lave en ny beregning:");
            scanner.nextLine();
            if (scanner.nextLine().equalsIgnoreCase("Q")) {
                running = false;
            }
        }

        System.out.println("Tak for at bruge lommeregneren!");
        scanner.close();
    }
}
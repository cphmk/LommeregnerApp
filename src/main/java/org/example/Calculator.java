package org.example;

public class Calculator {



        public Double Addition( Double a, Double b) {
            return a + b;
        }


        public Double Subtraction(Double a, Double b) {
            return a - b;
        }


        public Double Multiplication(Double a, Double b) {
            return a * b;
        }

        public Double Division(Double a, Double b) {
            if(b==0)
            {
                throw new ArithmeticException("zero cannot be divided");
            }
            return a / b;
        }

        public Double Modulus(Double a, Double b) {
            return a % b;
        }


}

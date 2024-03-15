package com.perscholas.java_basics;

public class JavaBasicPractice {
	public static void main(String[] args) {
        /*
        Write a program that declares two integer variables, assigns an integer to each,
        and adds them together. Assign the sum to a variable. Print out the result
        */
        int variableOne;
        int variableTwo;
        variableOne = 42;
        variableTwo = 42;
        int sumVariable = variableOne + variableTwo;
        System.out.println(sumVariable);


        /*
        Write a program that declares two double variables, assigns a number to each,
        and adds them together. Assign the sum to a variable. Print out the result.
         */
        double doubleOne;
        double doubleTwo;
        doubleOne = 42.01;
        doubleTwo = 42.001;
        double sumDouble = doubleOne + doubleTwo;
        System.out.println(sumDouble);


        /*
        Write a program that declares an integer variable and a double variable, assigns numbers
        to each, and adds them together. Assign the sum to a variable. Print out the result.
        What variable type must the sum be?
         */
        int integerVariable;
        double doubleVariable;
        integerVariable = 42;
        doubleVariable = 42.001;
        double sumIntFloat = integerVariable + doubleVariable;
        System.out.println(sumIntFloat); // the variable type must be a double


        /* 
        Write a program that declares two integer variables, assigns an integer to each,
        and divides the larger number by the smaller number. Assign the result to a variable.
        Print out the result.
        Now change the larger number to a decimal. What happens? What corrections are needed?
         */
        int largerNumber;
        int smallerNumber;
        largerNumber = 42;
        smallerNumber= 7;
        int quotient = largerNumber/smallerNumber;
        System.out.println(quotient);
       /*
       Changing the larger number to a decimal requires changing the data type of the original variable largerNumber.
       The variable quotient would also need to become a double. Below is an example with new variables using the double
       data type.
        */
        double largerNumberDecimal = 42.1;
        double quotientDecimal = largerNumberDecimal / smallerNumber;
        System.out.println(quotientDecimal);


        /*
        Write a program that declares two variables, assigns a number to each, and divides the larger by the smaller number.
        Assign the result to a variable. Print out the result.
        Now, cast the result to an integer. Print out the result again.
         */
        double largerVariable;
        double smallerVariable;
        largerVariable = 500.5;
        smallerVariable = 73;
        double result = largerVariable/smallerVariable;
        System.out.println(result);
        int integerResult = (int)result;
        System.out.println(integerResult);

        /*
        Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
        Declare a variable q and assign y/x to it and print q.
        Now, cast y to a double and assign it to q. Print q again.
         */

        int x = 5;
        int y = 6;
        double q = (double)y/x;
        System.out.println(q);

        q = (double)y;
        System.out.println(q);

        /*
        Write a program that declares a named constant and uses it in a calculation. Print the result.
         */

        final double PI = 3.14159;
        int radius = 2;
        double circumference = radius*2*PI;
        System.out.println(circumference);

        /*
        Write a program where you create three variables that represent products at a cafe.
        The products could be beverages like coffee, cappuccino, espresso, green tea, etc. Assign prices to each product.
        Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product,
        four items of the second product, and two items of the third product.
        Add them all together to calculate the subtotal.
        Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount.
        Be sure to format the results to two decimal places.
         */

        double coffee = 5.50;
        double matcha = 6.75;
        double scone = 10.98;
        double subtotal;
        double totalSale;

        subtotal = 3*coffee + 4*matcha + 2*scone;
        final double SALES_TAX = 6;
        totalSale= subtotal + SALES_TAX;
        System.out.printf("$%.2f",totalSale);
	}    

}

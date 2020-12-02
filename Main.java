package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // create an invoice for a store
        // input products and prices
        // print out invoice
        //exit
        Scanner input = new Scanner(System.in);
        ArrayList<String> product = new ArrayList<String>();
        ArrayList<Double> price = new ArrayList<Double>();
        ArrayList<String> cartProduct = new ArrayList<String>();
        ArrayList<Double> cartPrice = new ArrayList<Double>();

        product.add("Bison Sweater");
        price.add(55.99);
        product.add("Bison Tee");
        price.add(14.99);
        product.add("Bison Hoodie");
        price.add(23.99);
        product.add("Bison Bumpersticker");
        price.add(4.99);

        String answer = "";
        String name = "";
        double total = 0.0;
        int index = -1;

        do {
            System.out.println("What would you like to do? ");
            System.out.println("1.) Add purchase 2.) Show purchases 3.) Finish transaction");
            answer = input.nextLine();

            if (answer.equals("1")) {
                System.out.print("Product: ");
                name = input.nextLine();
                cartProduct.add(name);

                for (int i= 0; i < product.size(); i++){
                    if (name.equals(product.get(i))){
                        index = i;
                    }
                }
                cartPrice.add(price.get(index));

            } else if (answer.equals("2")) {
                for (int i = 0; i < cartProduct.size(); i++) {
                    System.out.println(cartProduct.get(i) + " - " + cartPrice.get(i));

                }

            }


        } while (!answer.equals("3"));

       {
          for ( int i = 0; i < cartProduct.size(); i++)
           total += cartPrice.get(i);

        }
        System.out.println("Thank you for shopping at Howard University! Your total is:  " + total + ".");
    }
}




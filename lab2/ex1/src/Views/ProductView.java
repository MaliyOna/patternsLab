package Views;

import Models.Product;

import java.util.ArrayList;

public class ProductView {
    public void printList(ArrayList<Product> products){
        for (Product product : products){
            System.out.println(product.toString());
        }
        System.out.println();
    }

    public void printSentence(String sentence){
        System.out.println(sentence);
    }

    public void printLine(){
        System.out.println("----------------");
    }

    public void printTitle(String title){
        printSentence(title);
        printLine();
    }
}

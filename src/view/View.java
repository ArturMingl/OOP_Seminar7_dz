package view;

import java.util.Scanner;

public class View {
    Scanner input = new Scanner(System.in);
    public double inputValue(String title){
        System.out.printf("%s", title);
        return input.nextDouble();
    }
    public char inputOperationSign(String title){
        System.out.printf("%s", title);
        return input.next(".").charAt(0);
    }
}
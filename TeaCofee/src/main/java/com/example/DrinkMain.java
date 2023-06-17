package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Scanner;

public class DrinkMain {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Do you want to add sugar? (yes/no): ");
        String userInput = scanner.nextLine();

        // Convert the user input to lowercase
        userInput = userInput.toLowerCase();

        // Get the Tea bean from the ApplicationContext
        Tea tea = ac.getBean(Tea.class);
        tea.setSugar(userInput.equals("yes"));
        tea.typeOfDrink();
        tea.valueOfDrink();
        tea.checkSugarAdded();


        // Get the Coffee bean from the ApplicationContext
        Coffee coffee = ac.getBean(Coffee.class);
        coffee.setSugar(userInput.equals("yes"));
        coffee.typeOfDrink();
        coffee.valueOfDrink();
        coffee.checkSugarAdded();

        // Close the scanner and ApplicationContext
        scanner.close();
        ((ClassPathXmlApplicationContext) ac).close();
    }
}

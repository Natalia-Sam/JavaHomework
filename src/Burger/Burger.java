package Burger;

import java.util.Scanner;

public class Burger {

    int fullPrice = 0;

    public int basicOrder() {
        int burgerPrice = 50;
        int saucePrice = 10;
        int cheesePrice = 20;
        int cutletPrice = 30;

        System.out.println("Стоимость бургера: 50 грн." +
                "\n Введите номер дополнительного ингридиента к вашему бургеру: " +
                "\n 0. Не нужно дополнительных ингридиентов" +
                "\n 1. Соус - стоимость 10 грн." +
                "\n 2. Сыр - стоимость 20 грн." +
                "\n 3. Котлета - стоимость 30 грн.");
        Scanner scanner = new Scanner(System.in);
        int additionalIngredient = scanner.nextInt();

        switch (additionalIngredient) {
            case 0 -> {
                fullPrice = burgerPrice;
                System.out.println("Стоимость вашего бургера " + fullPrice + " грн.");
            }
            case 1 -> {
                fullPrice = burgerPrice + saucePrice;
                System.out.println("Стоимость вашего бургера " + fullPrice + " грн.");
            }
            case 2 -> {
                fullPrice = burgerPrice + cheesePrice;
                System.out.println("Стоимость вашего бургера " + fullPrice + " грн.");
            }
            case 3 -> {
                fullPrice = burgerPrice + cutletPrice;
                System.out.println("Стоимость вашего бургера " + fullPrice + " грн.");
            }
            default -> System.out.println("Для рассчета стоимости выберите, пожалуйста, одну из опций");
        }
        return fullPrice;
    }


    public void askAgain() {
        System.out.println("Добавить ли еще ингридиенты к бургеру?");
        Scanner scan = new Scanner(System.in);
        String addIngredient = scan.nextLine();
        do {
            if (addIngredient.equalsIgnoreCase("Да")) {
                basicOrder();
            } else {
                System.out.println("Сумма вашего заказа: " + fullPrice);
            }
        } while (addIngredient.equalsIgnoreCase("Да"));
    }
}

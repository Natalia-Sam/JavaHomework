package Burger;

import java.util.Scanner;

public class Burger {

    int burgerPrice = 50;
    int saucePrice = 10;
    int cheesePrice = 20;
    int cutletPrice = 30;


    public void BasicOrder() {
        System.out.println("Введите номер дополнительного ингридиента к вашему бургеру: " +
                "\n 0. Не нужно дополнительных ингридиентов" +
                "\n 1. Соус - стоимость 10 грн." +
                "\n 2. Сыр - стоимость 20 грн." +
                "\n 3. Котлета - стоимость 30 грн.");
        Scanner scanner = new Scanner(System.in);
        int additionalIngredient = scanner.nextInt();


        switch (additionalIngredient) {
            case 0 -> System.out.println("Стоимость вашего бургера " + burgerPrice + " грн.");
            case 1 -> {
                int fullPrice = burgerPrice + saucePrice;
                System.out.println("Стоимость вашего бургера " + fullPrice + " грн.");
            }
            case 2 -> {
                int fullPrice = burgerPrice + cheesePrice;
                System.out.println("Стоимость вашего бургера " + fullPrice + " грн.");
            }
            case 3 -> {
                int fullPrice = burgerPrice + cutletPrice;
                System.out.println("Стоимость вашего бургера " + fullPrice + " грн.");
            }
            default -> System.out.println("Для рассчета стоимости выберите, пожалуйста, одну из опций");

        }
    }


    public void askAgain() {
        System.out.println("Добавить ли еще ингридиенты к бургеру?");
        Scanner scan = new Scanner(System.in);
        String addIngredient = scan.nextLine();
        do {
            BasicOrder();

            if(addIngredient.equalsIgnoreCase("Да")){

            } else {
                System.out.println("Сумма вашего заказа: ");
            }
        } while (addIngredient.equalsIgnoreCase("Да"));
    }

}

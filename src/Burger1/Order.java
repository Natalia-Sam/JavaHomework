package Burger1;

import Burger1.BurgerIngredients;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {

        // Пользователю должно быть предложены выбрать доп. ингредиенты для бургера(стоимость бургера - 50)
        // с указанием цен! (Соус - 10, Сыр - 20, котлета - 30,).
        // После того, как пользователь ввёл доп. ингредиенты в консоль(или название или номер),
        // спросить хочет ли пользователь добавить 2-й ингредиент, если он вводит "нет",
        // тогда вывести в консоль стоимость бургера с доп. ингредиентом(-ами)!

        System.out.println("Введите номер дополнительного ингридиента к вашему бургеру: " +
                "\n 0. Не нужно дополнительных ингридиентов" +
                "\n 1. Соус - стоимость 10 грн." +
                "\n 2. Сыр - стоимость 20 грн." +
                "\n 3. Котлета - стоимость 30 грн.");
        Scanner scanner = new Scanner(System.in);
        int additionalIngredient = scanner.nextInt();


        BurgerIngredients burger = BurgerIngredients.BURGER;
        BurgerIngredients sauce = BurgerIngredients.SAUCE;
        BurgerIngredients cheese = BurgerIngredients.CHEESE;
        BurgerIngredients cutlet = BurgerIngredients.CUTLET;

        switch (additionalIngredient) {
            case 0 -> System.out.println("Стоимость вашего бургера " + burger.price + " грн.");
            case 1 -> System.out.println(burger.price + sauce.price);
            case 2 -> System.out.println("Стоимость вашего бургера составит " + burger.price + cheese.price + " грн.");
            case 3 -> System.out.println("Стоимость вашего бургера составит " + burger.price + cutlet.price + " грн.");
            default -> System.out.println("Для рассчета стоимости выберите, пожалуйста, одну из опций");
        }


    }
}

package Burger1;

public enum BurgerIngredients {
    BURGER(50),
    SAUCE(10),
    CHEESE(20),
    CUTLET(30);

    int price;

    BurgerIngredients(int price) {
        this.price = price;
    }
}

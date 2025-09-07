package chapter03;

enum Fruit {
    苹果, 梨, 香蕉, 西瓜, 芒果
}

public class Example3_10 {
    public static void main(String[] args) {
        double price = 0;
        boolean show = false;
        for (Fruit fruit : Fruit.values()) {
            show = switch (fruit) {
                case 苹果 -> {
                    price = 1.5;
                    yield true;
                }
                case 芒果 -> {
                    price = 6.8;
                    yield true;
                }
                case 香蕉 -> {
                    price = 2.8;
                    yield true;
                }
                default -> false;
            };
            if (show) {
                System.out.println(fruit + "500克的价格：" + price + "元");
            }
        }
    }
}
 


public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        calc.println.accept(c);
        /* В devide нет проверки деления на 0, поэтому при вызове calc.devide.apply(a, b) возникает ошибка, так как b равен 0
           Решение: будем проверять делитель на ноль с помощью тернарного оператора
         */
    }
}

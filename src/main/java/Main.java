public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println("Сумма = " + calc.sum(4, 33));
        System.out.println("Умножение = " + calc.mult(4, 7));
        System.out.println("Возведение в степень = " + calc.pow(3, 3));
        System.out.println("Деление = " + calc.div(12, 6));
    }
}

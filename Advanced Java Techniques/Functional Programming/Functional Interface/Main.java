public final class Main {
    public static void main(String[] args) {
        BinaryOperation add = (a, b) -> a + b;
        System.out.println(add.apply(a:2, b:3)); // 5
    }
}

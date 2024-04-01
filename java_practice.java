import java.math.BigDecimal;

public class java_practice {
    public static void main(String[] args) {
        double a = 0.02;
        double b = 0.03;
        double c = b - a;
        System.out.println(c);

        BigDecimal a1 = new BigDecimal("0.02");
        BigDecimal b1 = new BigDecimal("0.03");
        BigDecimal c1 = b1.subtract(a1);
        System.out.println(c1);
    }
}

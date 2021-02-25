import java.util.*;

public class Gravitacija {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double visina = sc.nextDouble();

        System.out.println(pospesek(visina));
    }

    private static double pospesek(double nadmorskaVisina){
        double G = 6.674 * Math.pow(10,-11);
        double MASA_ZEMLJE = 5.972 * Math.pow(10,24);
        double RADIJ_ZEMLJE = 6.371 * Math.pow(10,6);

        return (G * MASA_ZEMLJE) / Math.pow((RADIJ_ZEMLJE + nadmorskaVisina), 2);
    }
}
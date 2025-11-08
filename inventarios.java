import java.util.Scanner;

public class inventarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K, D, h, L, n;
        double y, t0, Le, Pr, TCU;

        System.out.println("Resolver Sistemas de Inventarios");
        System.out.println("Teclea el valor de la demanda diaria (D):");
        D = sc.nextInt();
        System.out.println("Teclea el valor del costo de pedido (K):");
        K = sc.nextInt();
        System.out.println("Teclea el valor del costo de mantenimiento (h):");
        h = sc.nextInt();
        System.out.println("Teclea los días que tarda el proveedor en entregar el pedido (L):");
        L = sc.nextInt();

        y = Math.sqrt((2 * K * D) / h);
        System.out.println("Valor de y*: " + y);
        t0 = y / D;
        System.out.println("Valor de t0: " + t0);
        n = (int) (L / t0);
        System.out.println("Valor de n: " + n);
        Le = L - (n * t0);
        System.out.println("Valor de Le: " + Le);
        Pr = Le * D;
        System.out.println("Valor de Pr: " + Pr);
        TCU = (K / y / D ) + (h * (y / 2));
        System.out.println("Valor de TCU: " + TCU);
    }
}

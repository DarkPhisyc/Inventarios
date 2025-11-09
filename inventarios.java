import java.util.Scanner;

public class inventarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K, D, h, L, n, opcion;
        double y, t0, Le, Pr, TCU;

        do {
            System.out.println("\n \nRESOLVER MODELOS DE INVENTARIOS");
            System.out.println("Por favor teclea la opcion que deseas realizar:");
            System.out.println("1. Resolver Modelo de Inventario Clasico:");
            System.out.println("2. Resolver Modelo de Inventario con Descuento:");
            System.out.println("3. Salir");
            opcion = sc.nextInt();

            switch(opcion) {
                
            }
            System.out.println("Debe comprar " + (int)y + " unidades cada " + n + " dias, o cuando el nivel de inventario descienda a " + (int)Pr + " unidades.");
            } while (opcion != 3);
    }
}

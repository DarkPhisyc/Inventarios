import java.util.Scanner;

public class inventarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nC, n, m, opcion;
        double K, D, L, y, h, t0, Le, Pr, TCU, i, mCTU;
        double[] C, hD, yD, CTUd;
        do {
            System.out.println("\n \n    RESOLVER MODELOS DE INVENTARIOS");
            System.out.println("\t \tMenu:");
            System.out.println("1. Resolver Modelo de Inventario Clasico");
            System.out.println("2. Resolver Modelo de Inventario con Descuento");
            System.out.println("3. Salir");
            System.out.println("\nTeclea la opcion que deseas realizar:");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("\nMODELO DE INVENTARIO CLASICO");
                    System.out.println("Teclea el valor de la demanda diaria (D):");
                    D = sc.nextDouble();
                    System.out.println("Teclea el valor del costo de pedido (K):");
                    K = sc.nextDouble();
                    System.out.println("Teclea el valor del costo de mantenimiento (h):");
                    h = sc.nextDouble();
                    System.out.println("Teclea los dias que tarda el proveedor en entregar el pedido (L):");
                    L = sc.nextDouble();
                    y = Math.sqrt((2 * K * D) / h);
                    System.out.println("\nValor de y*: " + y);
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
                    System.out.println("\nDebe comprar " + (int)y + " unidades cada " + (int)t0 + " dias, o cuando el nivel de inventario descienda a " + (int)Pr + " unidades.");
                    break;
                case 2:
                    System.out.println("\nMODELO DE INVENTARIO CON DESCUENTO");
                    System.out.println("Teclea el valor de la demanda diaria (D):");
                    D = sc.nextDouble();
                    System.out.println("Teclea el valor del costo de pedido (K):");
                    K = sc.nextDouble();
                    System.out.println("Teclea cuantos precios se manejan (C):");
                    nC = sc.nextInt();
                    C = new double[nC];
                    hD = new double[nC];
                    yD = new double[nC];
                    CTUd = new double[nC];
                    for(int j = 0; j < nC; j++) {
                        System.out.println("Teclea el valor de C" + (j + 1) + ":");
                        C[j] = sc.nextDouble();
                    }
                    System.out.println("Teclea cuantos dias tarda el proveedor en entregar el pedido (L):");
                    L = sc.nextDouble();
                    System.out.println("Teclea el valor del descuento (%) en decimales:");
                    i = sc.nextDouble();
                    for(int j = 0; j < nC; j++) {
                        hD[j] = C[j] * i;
                        yD[j] = Math.sqrt((2 * K * D) / hD[j]);
                        CTUd[j] = (D * C[j]) + ((D * K) / yD[j]) + (hD[j] * yD[j] / 2);
                        System.out.println("\nh" + (j + 1) + ": " + hD[j]);
                        System.out.println("y" + (j + 1) + ": " + yD[j]);
                        System.out.println("CTU" + (j + 1) + ": " + CTUd[j]);
                    }
                    t0 = yD[0] / D;
                    System.out.println("\nValor de t0: " + t0);
                    n = (int) (L / t0);
                    System.out.println("Valor de n: " + n);
                    Le = L - (n * t0);
                    System.out.println("Valor de Le: " + Le);
                    Pr = Le * D;
                    System.out.println("Valor de Pr: " + Pr);
                    TCU = (K / yD[0] / D ) + (hD[0] * (yD[0] / 2));
                    System.out.println("Valor de TCU: " + TCU);
                    mCTU = CTUd[0];
                    m = 0;
                    for(int j = 1; j < nC; j++) {
                        if(CTUd[j] < mCTU) {
                            mCTU = CTUd[j];
                            m = j;
                        }
                    }
                    System.out.println("\nDebe pedir C" + (m + 1) + " para un costo minimo total de CTU: " + mCTU + "y un TCU de: " + TCU + ".");
                    break;
                case 3:
                    System.out.println("\nSaliendo...");
                    break;
                default:
                    System.out.println("\nOPCION NO VALIDA");
                    break;
            }
        } while (opcion != 3);
        sc.close();
    }
}


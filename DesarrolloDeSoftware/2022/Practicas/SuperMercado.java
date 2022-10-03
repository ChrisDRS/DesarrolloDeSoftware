import java.util.Scanner;

class SuperMercado 
{
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nombreArticulo;
        int codigoNumericoArticulo, cantidadArticulo, continuar = 1;
        double precioArticulo, precioParcialCompra = 0, precioTotalCompra;

        System.out.println("Ingrese los datos del primer articulo:");

        while (continuar == 1) {

            System.out.print("\nIngrese el nombre del articulo: ");
            nombreArticulo = scanner.nextLine();

            System.out.print("Ingrese el codigo del articulo: ");
            codigoNumericoArticulo = scanner.nextInt();

            System.out.print("Ingrese el precio del articulo: ");
            precioArticulo = scanner.nextDouble();

            System.out.print("Ingrese la cantidad del articulo: ");
            cantidadArticulo = scanner.nextInt();

            precioParcialCompra = precioParcialCompra + (precioArticulo * cantidadArticulo);

            System.out.println("\n+----------+------------------------------");
            System.out.println("| Nombre   | " + nombreArticulo);
            System.out.println("| Codigo   | " + codigoNumericoArticulo);
            System.out.println("| Precio   | " + precioArticulo);
            System.out.println("| Cantidad | " + cantidadArticulo);
            System.out.println("+----------+------------------------------");

            System.out.print("\n¿Quiere ingresar otro articulo mas?, digite '1' para ingresar uno mas o '0' para no ingresar mas articulos: ");
            continuar = scanner.nextInt();

        }

        precioTotalCompra = precioParcialCompra;

        System.out.println("\nEl precio total de la compra es: " + precioTotalCompra);

        scanner.close();

    }

}
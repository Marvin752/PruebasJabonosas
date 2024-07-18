import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void holamundo()
    {
        System.out.println("Mira mamá, mi primer prgrama en java!!!");
        System.out.println("Hola mundo!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Menu de Ejercicios");
            System.out.println("1. - Hola mundo");
            System.out.println("6. - Pa Juera");
            opcion = scanner.nextInt();
            switch (opcion)
            {
                case 1:
                    holamundo();
                    break;
                case 6:
                    System.out.println("Saliendo del programa . . . . . Chao");
                default:
                    System.out.println("Opción no válida, intente otra vez");
            }
        }while(opcion!=6);
        //Ayuda no se usar Java
    }
}
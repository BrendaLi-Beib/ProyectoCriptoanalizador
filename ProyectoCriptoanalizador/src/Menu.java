import java.util.Scanner;

public class Menu {

    public void MenuInicio (){
        Scanner s = new Scanner(System.in);
        boolean salir = true;
        do {
            System.out.println("¿Qué deseas hacer? \n1.- Encriptar\n2.-Desencriptar\n3.-Salir\n");
            System.out.println("Elige una opcion: ");

            int opcion = s.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Elige clave de encriptacion");
                    Scanner c = new Scanner(System.in);
                    int clave = c.nextInt();
                    Encriptar encriptando = new Encriptar();
                    encriptando.Encriptar(clave, "TextoEncriptado.txt");
                    System.out.println("Archivo encriptado con exito \n tu clave fue: " + clave);

                    break;}
                case 2: {
                    System.out.println("Elegiste Desencriptar");
                    Desencriptar desencriptando = new Desencriptar();
                    desencriptando.Desencriptar();

                    break;}
                case 3:
                    System.out.println("Elegiste Salir");
                    salir = false;
                    break;
                default:
                    System.out.println("Esa opcion no es correcta");

            }
        } while (salir);
    }

}

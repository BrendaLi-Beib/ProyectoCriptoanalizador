import java.io.*;

public class LeerArchivo {

    String LeerArchivo (String texto) {
        BufferedReader archivo;
        StringBuilder stringBuilder = new StringBuilder();

        {
            try {
                archivo = new BufferedReader(new FileReader(texto));
                String linea = archivo.readLine();
                while (linea != null) {
                    stringBuilder.append(linea);
                    stringBuilder.append("\n");
                    linea = archivo.readLine();
                }

            } catch (IOException e) {
                System.out.println("No se encontro archivo");
            }

        }
        String cadena = stringBuilder.toString();
        return cadena;
    }

}

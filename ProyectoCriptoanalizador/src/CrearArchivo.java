import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CrearArchivo {
    void CrearArchivo (String str, String nombre) {

            try (FileWriter archivoCreado = new FileWriter(nombre);){
                archivoCreado.write(str);
            } catch (IOException e) {
                System.out.println("No se pudo crear el archivo");
            }
    }
}

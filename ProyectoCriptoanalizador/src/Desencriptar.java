import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Desencriptar {
    LeerArchivo archivoEncriptado = new LeerArchivo();
    String cadenaEncriptada = archivoEncriptado.LeerArchivo("TextoEncriptado.txt");
    Recorrer posibleCadena = new Recorrer();

    void Desencriptar(){
        int clave = buscarPalabra();
        if (clave != 0){
            String desencriptado = posibleCadena.cadenaRecorrida(-clave,cadenaEncriptada);
            CrearArchivo archivoDesencriptado = new CrearArchivo();
            System.out.println("\n" + desencriptado);
            System.out.println("La clave para desencriptar fue: "+ clave);
            archivoDesencriptado.CrearArchivo(desencriptado, "TextoDesencriptado.txt");
        }
        else System.out.println("Imposible Desencriptar");
    }

    private int buscarPalabra (){
        int clave = 0;
        for (int i= 1; i<10000; i++){
            String str = posibleCadena.cadenaRecorrida(-i,cadenaEncriptada);
            boolean encontrada = buscarPalabras(str);
            if (encontrada){
                System.out.println("DESENCRIPTACION EXITOSA");
                clave = i;
                break;
            }
        }
            return clave;
    }

   private boolean buscarPalabras (String posibleCadena) {
        HashSet<String> palabrasSpanish = new HashSet<>();
       Collections.addAll(palabrasSpanish, "hola", " a ","ante", "bajo",
               "cabe"," con ","contra", " des", "desde", "durante", " en ", "entre","hacia",
               "hasta","mediante","para"," por ","segun", " sin","so", "sobre", "tras", " el ", " la ", "ellos",
               "ellas", "todos", "todas", " con ", "quiero", "cuando", "donde", "por", "hubiera",
               "ayer", "mañana", "pasado"," si ", " no ");

        boolean encontroPalabra = false;

        Iterator<String> iterator = palabrasSpanish.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            encontroPalabra = posibleCadena.contains(str);
        }
        return encontroPalabra;
    }


}

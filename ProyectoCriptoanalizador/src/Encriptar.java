public class Encriptar {
    private LeerArchivo archivoLeido = new LeerArchivo();
   private Recorrer encriptando = new Recorrer();
   private CrearArchivo archivoEncriptado = new CrearArchivo();


    String Encriptar (int clave, String nombre) {

        String archivo = archivoLeido.LeerArchivo("texto.txt");
        String cadenaEncriptada = encriptando.cadenaRecorrida(clave, archivo);
        archivoEncriptado.CrearArchivo(cadenaEncriptada, nombre);
        System.out.println(cadenaEncriptada);
        return cadenaEncriptada;
    }


}

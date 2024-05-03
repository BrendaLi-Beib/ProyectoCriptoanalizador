public class Recorrer{
   private char recorrerLetra(char letra, int clave) {

            int recorriendoLetra = letra + clave;
            char nuevaLetra = (char) recorriendoLetra;
            return nuevaLetra;
    }

    String cadenaRecorrida (int clave, String archivo){
        StringBuilder unirCadena = new StringBuilder();

        for (int i = 0; i<archivo.length(); i++){
            char letraArchivo = archivo.charAt(i);
            if (letraArchivo == ' ' || letraArchivo == ',' || letraArchivo == '.' || letraArchivo == '\n'){
                unirCadena.append(letraArchivo);
            }
            else {
                char letraEncriptada = recorrerLetra(letraArchivo, clave);
                unirCadena.append(letraEncriptada);
            }
        }

        String cadenaRecorrida = unirCadena.toString();
        return cadenaRecorrida;
    }


}

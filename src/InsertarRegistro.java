


import java.io.*;

public class InsertarRegistro {
public static void main(String[] args){
    File origen= new File("C:\\Users\\Admin\\Documents\\REGISTROS/RegistrosNuevos.txt");
    String insertar="9814647 JUANA MIMOSA oliveros ganados lia 6.0";
    escribirFichero(origen, insertar);
}    
static void escribirFichero(File origen, String insertar){
    try{
        //si no existe el fichero lo crea
        if(!origen.exists()){
            origen.createNewFile();
        }
        /* abre un flujo de escritura sobre el fichero con codificacion utf-8 
        ademas  en el pedazo sentencial "FileOutputStream(Ffichero, true)",
        true es por si existe el fichero seguir añadiendo texto y no borrar lo que tenia
        */
        
        BufferedWriter Fescribe= new BufferedWriter(new OutputStreamWriter(new FileOutputStream(origen,true),"utf-8"));
        /*
         escribe en el fichero  la cadena que recibe  la funcion.
        el string  "\ r \n significa salto de linea
        */
        Fescribe.write(insertar + "\r\n");
        //cierra el flujo de  escritura 
        Fescribe.close();
       System.out.println("Registro guardado exitosamente");
    }catch( Exception ex){
        //captura un posible error le imprime en pantalla 
    System.out.println(ex.getMessage());
    }
}
}

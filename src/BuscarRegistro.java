import java.io.*;
import java.util.StringTokenizer;

public class BuscarRegistro {
   public static void main(String[] args) throws FileNotFoundException, IOException {
       
     try{
     File infile= new File( "C:\\Users\\Admin\\Documents\\REGISTROS/Registro.txt");
     BufferedReader reader= new BufferedReader(new FileReader(infile));
     String busqueda="9814635";//Clave a buscar dentro del txt
     String line="";
     StringTokenizer st;
     int i=0;
     while ((line=reader.readLine())!= null){
         st=new StringTokenizer(line);
         while(st.hasMoreTokens()){
             String str= st.nextToken();
             if(str.equals(busqueda)){
                 System.out.println(line);
                 
                 i++;
                 break;
             }
         }
     }System.out.println("Numero de registros encontrados:"+i);
     if(i==0){
         System.out.println("registro no encontrado");
     }
     reader.close();
    } catch(IOException e){
        System.err.println(e);
        System.exit(1);
    }
   }
}

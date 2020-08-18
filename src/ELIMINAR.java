

import static java.awt.PageAttributes.MediaType.B;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author PC-1
 */
public class ELIMINAR {
        public String cuenta;

    /**
     * @param args the command line arguments
     */
        
        public void removeLineFromFile() throws FileNotFoundException, IOException{
            String file = "C:\\Users\\Admin\\Documents\\REGISTROS/Registro.txt";
           String cuenta ="9814635";
            try{
                File inFile= new File(file);
                if(!inFile.isFile()){
                    System.out.println("parametro no es un archvo");
                    return;
                }
                File tempFile = new File(inFile.getAbsolutePath()+".tmp");
                BufferedReader br=new BufferedReader(new FileReader(file));
                PrintWriter pw =new PrintWriter(new FileWriter(tempFile));
            String line ="";
            StringTokenizer st;
            while((line=br.readLine())!=null){
               st = new StringTokenizer(line);
               while(st.hasMoreTokens()){
                   String str = st.nextToken();
                   if(!str.trim().equals(cuenta)){
                       pw.println(line);
                       break;
                   }else{
                       break;
                   }
               }
            }
            pw.close(); 
            br.close();
            if(!inFile.delete()){
                System.out.println("no se pudo");
                return;
            }
            if(!tempFile.renameTo(inFile))
                    System.out.println("cambiar el nnombre");
            }
            catch(FileNotFoundException ex){
                ex.printStackTrace();
            }
            catch(IOException ex){
                ex.printStackTrace();;
            }
        }
        public ELIMINAR() throws IOException{
            removeLineFromFile();
        }
        
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
      new ELIMINAR();  
      
}
    
}

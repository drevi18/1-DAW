import java.io.*;
import java.io.FileOutputStream;
import java.io.FileWriter;


public class EscrituraFileWriter {
    public static void main(String[] args) {
        FileOutputStream f= null;
        String[] amigos= {"Juan Maria", "Maria", "Pepe", "Manuela"};
        escribirFileWriter(amigos, "amigos.txt");

        //leerFileReader("amigos.txt");


    }

    public static void escribirFileWriter( String []amigos, String nombreFichero){

        try {
            
        File fs= new File(nombreFichero);
        FileWriter fw= new FileWriter(fs,true);
        
        int i=0;
            for(String s : amigos){
                s=i+" "+s;
                fw.write(s,0,s.length());
                fw.write("\r\n");
                i++;
            }
            if(fw !=null){fw.close();}
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

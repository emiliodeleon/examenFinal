/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiPackage;

/**
 *
 * @author sea_hack
 */
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Fernando
 */
public class Distribucion {
    
      
    public static String readFile(String path, Charset encoding) 
        throws IOException 
        {
         byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
        }
    
    public static int validacion(ArrayList<String> users1, String user,String pwd){
        // Crea una lista para el resultado del método
        int validar=0;
        boolean validacion=false;
        // Recorre la lista de nombres en orden inverso
        for (int i = 0; i<users1.size(); i++) {
             // Añade cada nombre al resultado
            if((users1.get(i).equals(user))&&(users1.get(i+1).equals(pwd))){
            validacion=true;
            if (user.charAt(0)=='a')
                validar = 1;
            if (user.charAt(0)=='c')
                validar = 2;
            if (user.charAt(0)=='m')
                validar=3;
            break;
            }
            else
            validacion=false;
        }
        return validar;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Luis
 */
public class File {
    
    public String ReadFile(String nameFile, int num)
    {
        java.io.File file;
        FileReader fr;
        BufferedReader br;
        String ret = null;
        try
        {
            file = new java.io.File(nameFile);
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            
            String line = br.readLine();
            
            int i = 0;
            int max = 0;
                        
            String [] lines = new String[100];
            while((line) != null)
            {
                lines[i] = line;
                line = br.readLine();
                i++;
            }
            br.close();
            fr.close();
            ret = lines[num].toString();            
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return ret;
    }
}

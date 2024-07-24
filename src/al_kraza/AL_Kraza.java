/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package al_kraza;

import LOGIN.LOGI;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author mac10    
 */
public class AL_Kraza {

/**
 * @param args the command line arguments
 */
public static void main(String[] args) throws Exception{
System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8.name()));
    LOGI l = new LOGIN.LOGI();
           l.setVisible(true);

}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.Random;
import services.Link;

/**
 *
 * @author Luvi
 */
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Link l = new Link();
//        l.listUser();


    Random rnd = new Random();
    
    String tiket = "" + (char)(rnd.nextInt(91) + 65)
            + (char)(rnd.nextInt(65) + 65)
            + (char)(rnd.nextInt(65) + 65)
            + rnd.nextInt(10)
            + rnd.nextInt(10);
        System.out.println(tiket);
    }
    
}

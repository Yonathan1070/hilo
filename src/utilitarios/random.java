/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Yonathan
 */
public class random {
    
    public static int random(){
        int randomNum = ThreadLocalRandom.current().nextInt(-3, 3 + 1);
        return randomNum;
    }
}

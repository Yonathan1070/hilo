/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import utilitarios.Divisa;
import utilitarios.HiloUsuario;

/**
 *
 * @author Yonathan
 */
public class logica {
    Divisa di = new Divisa("USD", 3800);
    Divisa di1 = new Divisa("EUR", 3500);
    
    HiloUsuario hu = new HiloUsuario("Yonathan", di);
    HiloUsuario hu1 = new HiloUsuario("Linux", di1);
    
    public void iniciar(){
        hu.start();
        hu1.start();
    }
}

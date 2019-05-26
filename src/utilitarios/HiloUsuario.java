/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yonathan
 */
public class HiloUsuario extends Thread {

    Divisa divisas;
    private String nombre;

    public HiloUsuario(String nombre, Divisa divisas) {
        this.nombre = nombre;
        this.divisas = divisas;
    }

    @Override
    public void run() {
        while (true) {
            int aleatorio = random.random() * 10;
            System.out.println(nombre + " ha Generado: " + aleatorio + "%");
            switch (divisas.getDivisa()) {
                case "USD":
                    divisas.setValor(divisas.getValor()*aleatorio/100+divisas.getValor());
                    System.out.println("Nuevo valor de "+divisas.getDivisa()+" es " + divisas.getValor());
                    break;
                case "EUR":
                    divisas.setValor(divisas.getValor()*aleatorio/100+divisas.getValor());
                    System.out.println("Nuevo valor de "+divisas.getDivisa()+" es " + divisas.getValor());
                    break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}

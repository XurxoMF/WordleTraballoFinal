/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xurxo.martinez.wordle;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import xurxo.martinez.wordle.game.Colores;
import xurxo.martinez.wordle.game.WordleClass;
import xurxo.martinez.wordle.io.IMotorPalabras;
import xurxo.martinez.wordle.io.MotorTest;
import xurxo.martinez.wordle.io.MotorDocumento;

/**
 *
 * @author xurxo
 */
public class Wordle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        WordleClass game = new WordleClass();
        
        List<Colores> test = game.comprobarPalabra("CASAS", "PACOL");
        for (Colores col : test) {
            switch(col) {
                case VERDE:
                    System.out.println("VERDE");
                    break;
                case AMARILLO:
                    System.out.println("AMARILLO");
                    break;
                case ROJO:
                    System.out.println("ROJO");
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        }
        
        System.out.println(game.getBien());
        System.out.println(game.getMal());
        System.out.println(game.getExiste());
        */
        
        try {
            IMotorPalabras motor = new MotorDocumento();
            System.out.println(motor.getPalabraRandom());
        } catch (IOException ex) {
            Logger.getLogger(Wordle.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
} 

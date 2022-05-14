/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xurxo.martinez.wordle.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author alumno
 */
public class MotorTest implements IMotorPalabras {
    
    private final String[] ar = {"CASAS", "HOLAX", "LAURA", "PASAR", "ARROZ"};
    private final List<String> palabras = new ArrayList<>(Arrays.asList(ar));
    
    public MotorTest(){}
    
    @Override
    public String getPalabraRandom() {
        return palabras.get((int)Math.floor(Math.random() * palabras.size()));
    }

    @Override
    public boolean existePalabra(String palabra) {
        return palabras.contains(palabra);
    }

    @Override
    public boolean anhadirPalabra(String palabra) {
        if (palabra.matches("[A-Z]{5}") && !palabras.contains(palabra)) {
            return palabras.add(palabra);
        } else {
            return false;
        }
    }

    @Override
    public boolean eliminarPalabra(String palabra) {
        return palabras.remove(palabra);
    }
    
    @Override
    public boolean checkPalabra(String palabra) {
        return palabra.matches("[A-Z]{5}");
    }
    
}

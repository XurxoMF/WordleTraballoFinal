/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package xurxo.martinez.wordle.io;

/**
 *
 * @author xurxo
 */
public interface IMotorPalabras {
    
    public String getPalabraRandom();
    
    public boolean existePalabra(String palabra);
    
    public boolean anhadirPalabra(String palabra);
    
    public boolean eliminarPalabra(String palabra);
    
    public boolean checkPalabra(String palabra);
    
}

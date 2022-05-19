/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xurxo.martinez.wordle.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author alumno
 */
public class WordleClass {

    private final Set<Character> bien;
    private final Set<Character> mal;
    private final Set<Character> existe;

    public WordleClass() {
        bien = new TreeSet<>();
        mal = new TreeSet<>();
        existe = new TreeSet<>();
    }

    public List<Colores> comprobarPalabra(String palabraRandom, String palabraUsuario) {
        List<Colores> resultado = new ArrayList<>(5);
        List<Character> pRand = new ArrayList<>(5);
        for (char letra : palabraRandom.toCharArray()) {
            pRand.add((Character) letra);
        }
        List<Character> pUser = new ArrayList<>();
        for (char letra : palabraUsuario.toCharArray()) {
            pUser.add((Character) letra);
        }

        for (int i = 0; i < pRand.size(); i++) {
            if (pUser.get(i).equals(pRand.get(i))) {
                resultado.add(Colores.VERDE);
                existe.remove(pUser.get(i));
                bien.add(pUser.get(i));
                pRand.set(i, null);
                pUser.set(i, null);
            } else if (!pRand.contains(pUser.get(i))) {
                resultado.add(Colores.ROJO);
                if (!bien.contains(pUser.get(i)) && !existe.contains(pUser.get(i))) {
                    mal.add(pUser.get(i));
                }
                pUser.set(i, null);
            }
        }

        for (int i = 0; i < pRand.size(); i++) {
            if (pUser.get(i) != null) {
                if (pRand.contains(pUser.get(i))) {
                    resultado.add(i, Colores.AMARILLO);
                    if (!bien.contains(pUser.get(i))) {
                        mal.remove(pUser.get(i));
                        existe.add(pUser.get(i));
                    }
                    pRand.set(pRand.indexOf(pUser.get(i)), null);
                    pUser.set(i, null);
                } else {
                    resultado.add(Colores.ROJO);
                    if (!bien.contains(pUser.get(i)) && !existe.contains(pUser.get(i))) {
                        mal.add(pUser.get(i));
                    }
                    pUser.set(i, null);
                }
            }
        }

        return resultado;
    }

    public String getBien() {
        if (bien.isEmpty()) {
            return "";
        }
        StringBuilder strb = new StringBuilder("");
        Iterator<Character> it = bien.iterator();
        while (it.hasNext()) {
            Character letra = it.next();
            strb.append(letra).append(", ");
        }
        strb.delete(strb.length() - 2, strb.length());
        return strb.toString();
    }

    public String getMal() {
        if (mal.isEmpty()) {
            return "";
        }
        StringBuilder strb = new StringBuilder("");
        Iterator<Character> it = mal.iterator();
        while (it.hasNext()) {
            Character letra = it.next();
            strb.append(letra).append(", ");
        }
        strb.delete(strb.length() - 2, strb.length());
        return strb.toString();
    }

    public String getExiste() {
        if (existe.isEmpty()) {
            return "";
        }
        StringBuilder strb = new StringBuilder("");
        Iterator<Character> it = existe.iterator();
        while (it.hasNext()) {
            Character letra = it.next();
            strb.append(letra).append(", ");
        }
        strb.delete(strb.length() - 2, strb.length());
        return strb.toString();
    }
}

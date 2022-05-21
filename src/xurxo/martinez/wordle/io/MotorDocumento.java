/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xurxo.martinez.wordle.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author xurxo
 */
public class MotorDocumento implements IMotorPalabras {

    private final File f = new File("." + File.separator + "data" + File.separator + "palabras.txt");
    private final List<String> palabras = new ArrayList<>();

    public MotorDocumento() throws IOException {
        if (!f.exists()) {
            if (f.getParentFile().exists()) {
                try ( BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
                    bw.write("FILES\n");
                    palabras.add("FILES");
                }
            } else {
                if (f.getParentFile().mkdirs()) {
                    try ( BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
                        bw.write("FILES\n");
                        palabras.add("FILES");
                    }
                } else {
                    throw new IOException("No se pudo crear el fichero!");
                }
            }
        } else {
            /**
             * Leo ao iniciar MotorDocumento para gardar todas as palabras nunha
             * lista, logo me encargo nos métodos de añadir e eliminar palabras e
             * de que esta lista se manteña sempre cas mesmas palabra que o
             * ficheiro e así evitar leer o ficheiro cada vez que quero buscar
             * algunha palabra.
             */
            boolean error = false;
            try ( BufferedReader br = new BufferedReader(new FileReader(f))) {
                String linea = br.readLine();
                while (linea != null) {
                    if (linea.matches("[A-Z]{5}")) {
                        palabras.add(linea);
                        linea = br.readLine();
                    } else {
                        error = true;
                    }
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

            if (palabras.isEmpty()) {
                try ( BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
                    bw.write("FILES\n");
                    palabras.add("FILES");
                }
            } else if (error == true) {
                /**
                 * Na línea 57 fago un if para checkear que aas palabras que
                 * está lendo cumplen o formato [A-Z]{5}, se algunha non cumple
                 * este requisito esta non se engade a lista de palabras. Este
                 * if sobreescribe o ficheiro solo cas palabras que cumplen o
                 * formato anterior, as que non cumplian o formato son
                 * eliminadas automanticamente.
                 *
                 * Solo entraría aquí se se modificou o documento a man, se non
                 * non debería de haber palabras erróneas xa que as comprobo
                 * antes de engadilas.
                 */
                try ( BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
                    StringBuilder txt = new StringBuilder("");
                    for (String pal : palabras) {
                        txt.append(pal).append("\n");
                    }
                    bw.write(txt.toString());
                }
            }
        }
    }

    @Override
    public String getPalabraRandom() {
        return palabras.get((int) Math.floor(Math.random() * palabras.size()));
    }

    @Override
    public boolean existePalabra(String palabra) {
        return palabras.contains(palabra);
    }

    @Override
    public boolean anhadirPalabra(String palabra) {
        if (palabra.matches("[A-Z]{5}") && !palabras.contains(palabra)) {
            palabras.add(palabra);
            try ( BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
                StringBuilder txt = new StringBuilder("");
                for (String pal : palabras) {
                    String aux = pal + "\n";
                    txt.append(aux);
                }
                bw.write(txt.toString());
                return true;
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                palabras.add(palabra);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean eliminarPalabra(String palabra) {
        if (palabras.remove(palabra)) {
            try ( BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
                StringBuilder txt = new StringBuilder("");
                for (String pal : palabras) {
                    txt.append(pal).append("\n");
                }
                bw.write(txt.toString());
                return true;
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
                palabras.add(palabra);
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean checkPalabra(String palabra) {
        return palabra.matches("[A-Z]{5}");
    }

}

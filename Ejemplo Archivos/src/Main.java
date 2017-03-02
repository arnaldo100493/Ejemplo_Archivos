/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FABAME
 */
public class Main {

    public static Console c = new Console("ARCHIVOS");

    public Main() {

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Archivo a = new Archivo("data/alumnos.txt");
        if (!a.reset()) {
            c.println("Problema con el archivo.");
        } else {
            // c.println("Archivo Listo.");
            String linea = a.readLine();
            // int suma = 0;
            // int contador = 0;
            while (linea != null) {
                // contador++;
                // c.println(linea);
                // int numero = Integer.parseInt(linea);
                // suma += numero;
                String[] arreglo = linea.split("#");
                String nombre = arreglo[0];
                int nota1 = Integer.parseInt(arreglo[1]);
                int nota2 = Integer.parseInt(arreglo[2]);
                int nota3 = Integer.parseInt(arreglo[3]);
                Alumno alumno = new Alumno(nombre, nota1, nota2, nota3);
                c.println(nombre);
                linea = a.readLine();
            }
            a.close();
            // int promedio = suma / contador;
            // c.println("SUMA: " + suma);
            // c.println("PROMEDIO: " + promedio);

        }
    }
}

package org.umg.curso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by alumno on 26/06/2017.
 */
public class Banco {
    public static void main(String[] args) throws IOException {

        Cliente c = new Cliente();
        c.setNombre("Diego");
        c.setEdad(29);
        c.setSalario(3870);

        System.out.println("Estimado cliente: " + c.getNombre() + ", su salario será de: " + c.getSalario());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Su Nombre");
        c.setNombre(reader.readLine());
        System.out.println("Su edad");
        c.setEdad(Integer.parseInt(reader.readLine()));
        System.out.println("Su salario");
        c.setSalario(Integer.parseInt(reader.readLine()));
    }
}

package br.com.exerc.problens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Salario1008 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int numero = Integer.parseInt(in.readLine());
        int horas = Integer.parseInt(in.readLine());
        double salario = Double.parseDouble(in.readLine());

        System.out.printf("NUMBER = %d\n", numero);
        System.out.printf("SALARY = U$ %.2f\n",(salario*horas));
    }
}

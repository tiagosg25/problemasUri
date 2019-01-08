package br.com.exerc.problens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaCirculo{

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        double raio = Double.parseDouble(in.readLine());
        double area = 3.14159 * (Math.pow(raio,2));

        System.out.printf("A=%.4f\n",area);
    }
}

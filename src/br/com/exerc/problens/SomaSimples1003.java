package br.com.exerc.problens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SomaSimples1003 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int soma = a+b;

        System.out.println("SOMA = "+soma);
    }
}

package br.com.exerc.problens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Diferenca1007 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());
        int c = Integer.parseInt(in.readLine());
        int d = Integer.parseInt(in.readLine());
        int dif = (a*b)-(c*d);

        System.out.println("DIFERENCA = "+dif);
    }
}

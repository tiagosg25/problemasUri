package br.com.exerc.problens;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Basico1001 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int num1 = Integer.parseInt(in.readLine());
        int num2 = Integer.parseInt(in.readLine());
        int res = num1 + num2;

        System.out.println("X = "+res);

    }

}

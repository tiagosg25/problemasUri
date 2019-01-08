package br.com.exerc.problens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blobs1170 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int numeroTeste = Integer.parseInt(in.readLine());
        for(int i = numeroTeste; i > 0; i--){
            double comida = Double.parseDouble(in.readLine());
            int dias = 0;
            while(comida >1){
                comida = comida/2;
                dias++;
            }
            System.out.println(dias+" dias");
        }
    }
}

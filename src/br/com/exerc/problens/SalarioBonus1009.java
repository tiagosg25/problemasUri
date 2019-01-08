package br.com.exerc.problens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SalarioBonus1009 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String nome = in.readLine();
        double fixo = Double.parseDouble(in.readLine());
        double vendas = Double.parseDouble(in.readLine());
        double sal = fixo + (vendas*0.15);
        System.out.printf("TOTAL = R$ %.2f\n",sal);
    }
}

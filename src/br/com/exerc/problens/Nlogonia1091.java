package br.com.exerc.problens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nlogonia1091 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int numeroTestes = Integer.parseInt(in.readLine());
        while (numeroTestes != 0){
            String cordenadasDiv[] = in.readLine().split(" ");
            int divisorLO = Integer.parseInt(cordenadasDiv[0]);
            int divisorNS = Integer.parseInt(cordenadasDiv[1]);

            for (int i = 0 ; i < numeroTestes; i++) {
                String cordenadasCasa[] = in.readLine().split(" ");
                int casaLO = Integer.parseInt(cordenadasCasa[0]);
                int casaNS = Integer.parseInt(cordenadasCasa[1]);

                int relacaoLO = casaLO - divisorLO;
                int relacaoNS = casaNS - divisorNS;

                String regiao = "divisa";

                if(relacaoLO > 0 && relacaoNS > 0){
                    regiao = "NE";
                }
                else if(relacaoLO > 0 && relacaoNS <0){
                    regiao = "SE";
                }
                else if(relacaoLO < 0 && relacaoNS > 0){
                    regiao = "NO";
                }
                else if(relacaoLO < 0 && relacaoNS < 0){
                    regiao = "SO";
                }
                System.out.println(regiao);
            }
            numeroTestes = Integer.parseInt(in.readLine());
        }
    }
}
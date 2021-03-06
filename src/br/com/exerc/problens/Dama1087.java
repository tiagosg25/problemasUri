package br.com.exerc.problens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dama1087 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        String[] dados = in.readLine().split(" ");
        while(!(dados[0].equals("0")&&dados[1].equals("0")&&dados[2].equals("0")&&dados[3].equals("0"))){
            int damaLinha = Integer.parseInt(dados[0]);
            int damaColuna = Integer.parseInt(dados[1]);
            int destinoLinha = Integer.parseInt(dados[2]);
            int destinoColuna = Integer.parseInt(dados[3]);

            int contador = 0;
            while(damaLinha != destinoLinha || damaColuna != destinoColuna){
                if(Math.abs(damaColuna-destinoColuna) == Math.abs(damaLinha - destinoLinha)) {
                    contador++;
                    break;
                }
                if(damaColuna != destinoColuna){
                    damaColuna = destinoColuna;
                    contador++;
                }
                if(damaLinha != destinoLinha){
                    damaLinha = destinoLinha;
                    contador++;
                }
            }
            System.out.println(contador);
            dados = in.readLine().split(" ");
        }
    }
}

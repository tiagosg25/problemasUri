package br.com.exerc.problens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaraOuCoroa1329 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);

        int numeroTestes = Integer.parseInt(in.readLine());
        do {
            String[] casos = in.readLine().split(" ");
            int john = 0;
            int mary = 0;
            for(int i = 0 ; i < numeroTestes ; i++){
                if(casos[i].equals("0")){
                    mary++;
                }else{
                    john++;
                }
            }
            System.out.println("Mary won "+mary+" times and John won "+john+" times");
            numeroTestes = Integer.parseInt(in.readLine());
        }while (numeroTestes != 0);
    }
}

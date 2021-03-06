package br.com.exerc.problens;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MensagemOculta1272 {

    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int n = Integer.parseInt(in.readLine());

        for(int i = 0; i < n ; i++ ){
            String txt = in.readLine().trim();
            String[] text = txt.split(" ");

            String newTxt = "";

            for(int j = 0; j < text.length; j++){
                if(!text[j].equals("")) {
                    newTxt = newTxt + text[j].substring(0,1);
                }
            }
            System.out.println(newTxt);
        }
    }
}

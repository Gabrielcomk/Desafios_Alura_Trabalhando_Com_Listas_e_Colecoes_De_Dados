package Desafio4.Des2_3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Titulo> listaTitulares= new ArrayList<>();
        listaTitulares.add(new Titulo("Carlo"));
        listaTitulares.add(new Titulo("Bernardo"));
        listaTitulares.add(new Titulo("Aaron"));
        Collections.sort(listaTitulares);
        for (Titulo titulo : listaTitulares){
            System.out.println(titulo.getNome());
        }
    }
}

package Desafio4.Des4_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista;
        lista = new ArrayList<>();
        lista.add("CoisaA");
        lista.add("CoisaA2");
        System.out.println("ArrayList: " + lista);
        lista = new LinkedList<>();
        lista.add("CoisaL");
        lista.add("CoisaL2");
        System.out.println("LinkedList: " + lista);
    }
}

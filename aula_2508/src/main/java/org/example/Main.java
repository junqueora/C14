package org.example;

import pilha.Pilha;

public class Main {
    public static void main(String[] args) {

        Pilha<Integer> pilha1 = new Pilha();
        pilha1.push(1);

        System.out.println(pilha1.size());
    }
}
package classes;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pilha<T> {
    private List<T> elementos = new ArrayList<T>();
    private int tamanho = 0;

    public int size() {
        return tamanho;
    }

    public boolean pilhaVazia() {
        return (tamanho == 0);
    }

    public void push(T elemento) {
        elementos.add(elemento);
        tamanho++;
    }

    public T pop()  throws EmptyStackException {
        if (pilhaVazia()) {
            throw new EmptyStackException();
        }
        T elemento = elementos.get(tamanho - 1);
        tamanho--;
        return elemento;
    }

    public void showElementos() {
        System.out.println("Elementos da pilha:");
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }

}

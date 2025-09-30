package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Fila<T> {

    private List<T> elementos = new ArrayList<>();

    public int size() {
        return elementos.size();
    }

    public boolean filaVazia() {
        return elementos.isEmpty();
    }

    public void enfileirar(T elemento) {
        elementos.add(elemento);
    }

    public T removerFila()  throws NoSuchElementException {
        if (filaVazia()) {
            throw new NoSuchElementException();
        }
        return elementos.removeFirst();
    } //teste de gatilho

    public T getElemento(int index) throws NoSuchElementException {
        if (filaVazia()) {
            throw new NoSuchElementException();
        }
        return elementos.get(index);
    }

    public void showElementos() {
        System.out.println("Elementos da fila:");
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}

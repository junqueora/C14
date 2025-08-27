package teste;
import classes.Pilha;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PilhaTeste {

    @Test
    public void testePilhaVazia(){
        Pilha<Integer> pilhaInteiros = new Pilha<>();
        boolean vazia = pilhaInteiros.pilhaVazia();
        assertTrue(vazia);
    }

    @Test
    public void testePilhaPush(){
        Pilha<Integer> pilhaInteiros = new Pilha<>();
        pilhaInteiros.push(13);
        int tamanho = pilhaInteiros.size();
        assertEquals(1, tamanho);
    }

    @Test
    public void testePilhaPop(){
        Pilha<Integer> pilhaInteiros = new Pilha<>();
        pilhaInteiros.push(13);
        pilhaInteiros.push(23);
        pilhaInteiros.pop();
        pilhaInteiros.pop();
        int tamanho = pilhaInteiros.size();

        assertEquals(0, tamanho);
    }

    @Test(expected = EmptyStackException.class)
    public void testePilhaPopException(){
        Pilha<Integer> pilhaInteiros = new Pilha<>();
        pilhaInteiros.pop();
    }

    @Test
    public void testePilhaRetorno(){
        Pilha<Integer> pilhaInteiros = new Pilha<>();
        int valor = 13;
        pilhaInteiros.push(valor);
        int retorno = pilhaInteiros.pop();

        assertEquals(valor, retorno);
    }

}

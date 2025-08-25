package teste;

import org.junit.Assert;
import org.junit.Test;
import pilha.Pilha;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class PilhaTeste {

    @Test
    public void testePilhaVazia() {

        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();

        boolean vazia = pilhaInteiros.pilhaVazia();

        assertTrue(vazia);
    }

    @Test
    public void testePilhaPush() {
        Pilha<Integer> pilhaInteiros = new Pilha<Integer>();
        pilhaInteiros.push(12);
        int tamanho = pilhaInteiros.size();
        Assert.assertEquals(1,  tamanho);
    }
}

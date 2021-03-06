/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolb;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author jorge
 */
public class Pagina {

    private LinkedList<Nodo> Nodos;
    private LinkedList<Pagina> Paginas;
    private Pagina Padre;

    public Pagina() {
        Nodos = new LinkedList();
        Paginas = new LinkedList();
    }

    public LinkedList<Nodo> getNodos() {
        return Nodos;
    }

    public void setNodos(LinkedList<Nodo> Nodos) {
        this.Nodos = Nodos;
    }

    public LinkedList<Pagina> getPaginas() {
        return Paginas;
    }

    public void setPaginas(LinkedList<Pagina> Paginas) {
        this.Paginas = Paginas;
    }

    public void addNodo(Nodo nodo) {
        Nodos.add(nodo);
	sortNodos();
    }

    public void addPagina(Pagina pagina) {
        Paginas.add(pagina);
    }

    private void sortNodos() {
        for (int i = 0; i < Nodos.size(); i++) {
            int menor = (int) Double.POSITIVE_INFINITY;
            int pos = 0;
            for (int j = i; j < Nodos.size(); j++) {
                if (Nodos.get(j).getID() < menor) {
                    menor = Nodos.get(j).getID();
                    pos = j;
                }
            }
            Nodo aux = Nodos.get(i);
            Nodos.set(i, Nodos.get(pos));
            Nodos.set(pos, aux);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(Nodos.toArray());
    }

}

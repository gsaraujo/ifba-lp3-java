package iunidade.playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Playlist {
    private List<Musica> faixas;

    public Playlist(boolean usarLinkedList) {

        if (usarLinkedList) {
            faixas = new LinkedList<Musica>();
        } else {
            faixas = new ArrayList<Musica>();
        }

    }

    public void adicionar(Musica musica) {
        faixas.add(musica);//add adiciona no final
    }

    public void adicionarNoInicio(Musica musica) {
        faixas.add(0,musica);
    }

    public Musica tocarProxima() {
        int qtdMusicas = faixas.size();
        if (qtdMusicas > 1) {
            this.faixas.removeFirst();//mesmo efeito de this.faixas.remove(0);
            return this.faixas.getFirst();//mesmo efeito de this.faixas.get(0);
        } else {
            if (qtdMusicas == 1) {
                this.faixas.removeFirst();
            }
            return null;
        }

    }

    public boolean removerPorTitulo(String titulo) {
        for (Musica musica : faixas) {
            if (musica.getTitulo().equals(titulo)) {
                return faixas.remove(musica);
            }
        }
        return false;

    }

    public Musica buscarPorArtista(String artista) {
        for (Musica musica : faixas) {
            if (musica.getArtista().equals(artista)) {
                return musica;
            }
        }
        return null;
    }

    public int totalDeFaixas() {
        return faixas.size();
    }

    public void listarTodas() {
        for (Musica musica : faixas) {
            System.out.println(this.faixas.indexOf(musica));//Isso me informa qual o índice daquela música que estamos visualizando no momento.
            System.out.println(musica);
        }

    }

    public Musica acessoPorIndice(int indice) {
        return faixas.get(indice);
    }
}

package playlist;

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

    public Musica tocarProxima(Musica musica) {
        return null;

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
        return null;

    }

    public int totalDeFaixas() {
        return faixas.size();
    }

    public void listarTodas() {

    }

    public Musica acessoPorIndice(int indice) {
        return faixas.get(indice);
    }
}

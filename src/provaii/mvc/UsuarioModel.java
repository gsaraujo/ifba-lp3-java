package provaii.mvc;

import java.util.ArrayList;
import java.util.List;

// Interface para observadores
interface UsuarioObserver {
    void onUsuarioChanged(String propertyName, Object oldValue, Object newValue);
}

// Classe UsuarioModel
public class UsuarioModel {
    private String nome;
    private int idade;
    private String cpf;

    private final List<UsuarioObserver> observers = new ArrayList<>();

    public void addObserver(UsuarioObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(UsuarioObserver observer) {
        observers.remove(observer);
    }

    // Metodo para notificar os observadores
    private void notifyObservers(String propertyName, Object oldValue, Object newValue) {
        for (UsuarioObserver observer : observers) {
            observer.onUsuarioChanged(propertyName, oldValue, newValue);
        }
    }

    // Getters e Setters com notificação
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        notifyObservers("nome", oldNome, nome); // Notifica a mudança
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        int oldIdade = this.idade;
        this.idade = idade;
        notifyObservers("idade", oldIdade, idade); // Notifica a mudança
    }
}



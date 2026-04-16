package model;

public class Student {
    private int id;
    private String name;
    private int anoNascimento;
    public Student(int id, String name, int anoNascimento) {
        this.id = id;
        this.name = name;
        this.anoNascimento = anoNascimento;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

}

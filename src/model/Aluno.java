package model;

public class Aluno extends Pessoa{
    private long id;
    private String mesnascimento;
    private String interesses;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInteresses() {
        return interesses;
    }

    public void setInteresses(String interesses) {
        this.interesses = interesses;
    }

    public String getMesnascimento() {
        return mesnascimento;
    }

    public void setMesnascimento(String mesnascimento) {
        this.mesnascimento = mesnascimento;
    }
}   
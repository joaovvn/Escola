package model;
public class Curso {
    public long idcurso;
    public String titulo;
    public String descricao;
    public double valor;
    public String professor;
    public int vagas = 30;

    public long getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(long idcurso) {
        this.idcurso = idcurso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    } 
}
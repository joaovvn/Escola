package model;
public class Matricula {
    public long codigo;
    public byte mesmatricula;
    public short anomatricula;
    Aluno aluno = new Aluno();
    Curso curso = new Curso();

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public byte getMesmatricula() {
        return mesmatricula;
    }

    public void setMesmatricula(byte mesmatricula) {
        this.mesmatricula = mesmatricula;
    }

    public short getAnomatricula() {
        return anomatricula;
    }

    public void setAnomatricula(short anomatricula) {
        this.anomatricula = anomatricula;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }   
}
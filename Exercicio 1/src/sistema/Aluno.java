package sistema;

public class Aluno {
    private String aluno;
    private int nota;

    public Aluno(String aluno, int nota){
        this.aluno = aluno;
        this.nota = nota;


    }

    public String getNome(){
        return aluno;
    }
    public void setNome(String aluno){
        this.aluno = aluno;
    }
    public int getNota(){
        return nota;

    }
    public void setNota(int nota){

        this.nota = nota;
    }



}

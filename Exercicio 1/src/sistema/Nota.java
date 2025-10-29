package sistema;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Nota {

    private List<Aluno> alunos;
    

    public Nota(){
        alunos = new ArrayList<>();

    }

    public void adicionarnota(String nome , int nota){
      alunos.add(new Aluno(nome, nota));

    }

    public void Lista(){
        for(Aluno b : alunos){
            System.out.println(b);
            Collections.sort(alunos);

            if( nota >= 8){
                System.out.print("maior nota");


            }else if( this.nota <= 5){
                System.out.println("menor nota");

            }
            
            
        }
    }





}

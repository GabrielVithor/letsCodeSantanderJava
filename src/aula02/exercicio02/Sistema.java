package aula02.exercicio02;

public class Sistema{
    public static void main(String[] args) {
        AlunoJava aluno1 = new AlunoJava("Gabriel","123456789");
        AlunoJava aluno2 = new AlunoJava("Vithor","987654321");
        AlunoJava aluno3 = new AlunoJava("Thiago","789465132");
        AlunoJS aluno4 = new AlunoJS("Lucas","147258399");
        AlunoJS aluno5 = new AlunoJS("Jose","147258399");
        AlunoJS aluno6 = new AlunoJS("Daniel","147258399");

        Professor professor = new Professor("Jose","321654987");
        Turma<AlunoJava> turmaJava = new Turma<>(professor);
        Turma<AlunoJS> turmaJS = new Turma<>(professor);
        turmaJava.inserirAlunoTurma(turmaJava,aluno1,aluno2,aluno3);
        turmaJS.inserirAlunoTurma(turmaJS,aluno4,aluno5,aluno6);
        turmaJava.printarTurma();
        turmaJS.printarTurma();
    }

}

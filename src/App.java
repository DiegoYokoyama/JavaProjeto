import Dominio.*;

public class App {

    public static void main(String[] args) throws Exception{
        Aluno a1 = new Aluno(11, "Luiza", "223", "255");
        a1.setNota(7.5);
        a1.exibir();

        Aluno a2 = new Aluno(22, "Paulo", "231", "477");
        a2.setNota(9.0);
        a2.exibir();

        Aluno a3 = new Aluno(10, "Gabriela", "312", "393");
        a3.setNota(3.5);
        a3.exibir();

        Aluno a4 = new Aluno(30, "Carlos", "342", "777");
        a4.setNota(6.5);
        a4.exibir();

        Aluno a5 = new Aluno(40, "Felipe", "364", "323");
        a5.setNota(10.0);
        a5.exibir();

        Professor p1 = new Professor(1200, "Daniel", "987", 5200.0);
        p1.exibir();

        Professor p2 = new Professor(230, "Murilo", "321", 5600.0);
        p2.exibir();

        Professor p3 = new Professor(400, "Paulo", "111", 5400.0);
        p3.exibir();
    }
}
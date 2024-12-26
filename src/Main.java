import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Bem vindo professor!
                Eu sou a calculadora de notas.
                """);
Scanner scanner = new Scanner(System.in);
        System.out.println("Professor digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Agora, sua matéria:");
        String materia = scanner.nextLine();

        System.out.println("Nome do Aluno:");
        String nomeAluno = scanner.nextLine();

        System.out.println("Notas do " + nomeAluno + " nos quatro bimestres:");
        Double[] notas = new Double[4];
        for (int i = 0; i < 4; i++) {
            notas[i] = scanner.nextDouble();
        }

        double somaDeNotas = 0;
        for (double nota: notas) {
            somaDeNotas += nota;
        }

        double mediaAluno = somaDeNotas / 4;

        System.out.println("A média do(a) " + nomeAluno + " é de: " + mediaAluno);

        if (mediaAluno >= 6) {
            System.out.println(nomeAluno + " está APROVADO(A).");
        } else {
            System.out.println(nomeAluno + " está REPROVADO(A).");
        }

        scanner.close();
    }
}
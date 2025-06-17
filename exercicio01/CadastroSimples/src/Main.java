public class Main {
    public static void main(String[] args) {
        String nome = "Daniel dos Santos Bittencourt"; // Nome do Aluno
        int idade = 30; // Idade do Aluno
        double nota1 = 9.8; // Nota da primeira Prova
        double nota2 = 8.5; // Nota da segunda Prova

        // Calcula a media

        double media = (nota1 + nota2) / 2;

        // Apresenta os dados do Aluno

        System.out.println("Aluno: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Média Final: " + media);

    }
}
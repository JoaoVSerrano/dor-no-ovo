package app;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "João";
        a1.idade = 18;

        Aluno a2 = a1;
        a2.nome = "José";



        System.out.println("[ A1 ]");
        System.out.println();
        System.out.println("nome = " + a1.nome);
        System.out.println("idade = " + a1.idade);
        System.out.println();

        System.out.println("[ A2 ]");
        System.out.println();
        System.out.println("nome = " + a2.nome);
        System.out.println("idade = " + a2.idade);

        System.out.println(" [ CHAMADA DE MÉTODO ] ");
        System.out.println("a1 = " + a1.getDados());
        System.out.println("a2 = " + a2.getDados());

        Aluno a3 = new Aluno("Maria", 35);
        System.out.println(" [ CHAMADA DE MÉTODO ] ");
        System.out.println("a3 = " + a3.getDados());

        Cliente c1 = new Cliente();
        c1.setNome("Teste");
        System.out.println(" [ CHAMADA DE MÉTODO ] ");
        System.out.println(c1.getNome());
    }
}
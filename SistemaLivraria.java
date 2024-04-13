import java.util.ArrayList;

public class SistemaLivraria {
    private static ArrayList<String> titulos = new ArrayList<>();
    private static ArrayList<String> autores = new ArrayList<>();
    private static ArrayList<Integer> anosPublicacao = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Detalhar livro");
            System.out.println("4 - Sair");

            int opcao = Integer.parseInt(System.console().readLine());

            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    detalharLivro();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void cadastrarLivro() {
        System.out.println("Digite o título do livro:");
        String titulo = System.console().readLine();
        System.out.println("Digite o autor do livro:");
        String autor = System.console().readLine();
        System.out.println("Digite o ano de publicação do livro:");
        int ano = Integer.parseInt(System.console().readLine());

        titulos.add(titulo);
        autores.add(autor);
        anosPublicacao.add(ano);

        System.out.println("Livro cadastrado com sucesso!");
    }

    private static void listarLivros() {
        if (titulos.isEmpty()) {
            System.out.println("Nenhum livro cadastrado ainda.");
        } else {
            System.out.println("Lista de livros cadastrados:");
            for (int i = 0; i < titulos.size(); i++) {
                System.out.println((i + 1) + " - " + titulos.get(i));
            }
        }
    }

    private static void detalharLivro() {
        if (titulos.isEmpty()) {
            System.out.println("Nenhum livro cadastrado ainda.");
            return;
        }

        System.out.println("Digite o número do livro que deseja detalhar:");
        int numeroLivro = Integer.parseInt(System.console().readLine());
        if (numeroLivro < 1 || numeroLivro > titulos.size()) {
            System.out.println("Número de livro inválido.");
            return;
        }

        String titulo = titulos.get(numeroLivro - 1);
        String autor = autores.get(numeroLivro - 1);
        int ano = anosPublicacao.get(numeroLivro - 1);

        System.out.println("Detalhes do livro:");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de publicação: " + ano);
    }
}

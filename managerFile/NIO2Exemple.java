package managerFile;
import java.nio.file.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class NIO2Exemple {
    private static final Path FILE_PATH = Paths.get("exemplo.txt");
    private static final Path DIR_PATH = Paths.get("novaPasta");

    public static void criarDiretorio() {
        try {
            Files.createDirectories(DIR_PATH);
            System.out.println("✅ Diretório criado: " + DIR_PATH);
        } catch (IOException e) {
            System.out.println("❌ Erro ao criar diretório");
            e.printStackTrace();
        }
    }

    public static void escreverArquivo() {
        String conteudo = "Primeira linha\nSegunda linha";
        try {
            Files.write(FILE_PATH, conteudo.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("✅ Arquivo escrito com sucesso.");
        } catch (IOException e) {
            System.out.println("❌ Erro ao escrever no arquivo");
            e.printStackTrace();
        }
    }

    public static void lerArquivo() {
        try {
            List<String> linhas = Files.readAllLines(FILE_PATH);
            System.out.println("📄 Conteúdo do arquivo:");
            for (String linha : linhas) {
                System.out.println("  ➤ " + linha);
            }
        } catch (IOException e) {
            System.out.println("❌ Erro ao ler arquivo");
            e.printStackTrace();
        }
    }

    public static void adicionarLinha() {
        try {
            Files.write(FILE_PATH, Arrays.asList("Nova linha adicionada!"), StandardOpenOption.APPEND);
            System.out.println("✅ Linha adicionada ao final do arquivo.");
        } catch (IOException e) {
            System.out.println("❌ Erro ao adicionar linha");
            e.printStackTrace();
        }
    }

    public static void deletarArquivo() {
        try {
            Files.deleteIfExists(FILE_PATH);
            System.out.println("✅ Arquivo excluído com sucesso.");
        } catch (IOException e) {
            System.out.println("❌ Erro ao excluir o arquivo");
            e.printStackTrace();
        }
    }
}

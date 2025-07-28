package managerFile;

public class Main2 {
    public static void main(String[] args) {

        // Criar diretório
        NIO2Exemple.criarDiretorio();

        // Escrever conteúdo inicial
        NIO2Exemple.escreverArquivo();

        // Ler conteúdo
        NIO2Exemple.lerArquivo();

        // Adicionar nova linha
        NIO2Exemple.adicionarLinha();

        // Ler novamente para ver a nova linha
        NIO2Exemple.lerArquivo();

        // Deletar o arquivo
        NIO2Exemple.deletarArquivo();
    }
    
}

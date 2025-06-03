package agjava2025;
public class AGMain {

    public static void main(String[] args) {
        AGBruteForce meuBruteForce = new AGBruteForce(8);
        meuBruteForce.carregaArquivo("dados.csv");
        meuBruteForce.resolver();
        meuBruteForce.mostrarMelhorSolucao();
    }
    
}

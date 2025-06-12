package agjava2025;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AlgoritmoGenetico {
    private int tamanhoCromossomo; // tamanho do vetor
    private int numeroGeracoes;
    private int tamanhoPopulacao;
    private int probabilidadeMutacao;
    private int qtdeCruzamentos;
    private double capacidadeMochila;

    private ArrayList<Produto> produtos = new ArrayList<>();

    public AlgoritmoGenetico( int nGeracoes, 
                            int tPopulacao, int probMutacao, 
                            int qtCruzamentos, double capacidade){

    this.numeroGeracoes = nGeracoes;
    this.tamanhoPopulacao = tPopulacao;
    this.probabilidadeMutacao = probMutacao;
    this.qtdeCruzamentos = qtCruzamentos;
    this.capacidadeMochila = capacidade;
   }
   public void carregaArquivo(String fileName) {
        String line = "";
        String[] produto = null;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                produto = line.split(",");
                Produto novoProduto = new Produto();
                novoProduto.setDescricao(produto[0]);
                novoProduto.setPeso(Double.parseDouble(produto[1]));
                novoProduto.setValor(Double.parseDouble(produto[2]));
                System.out.println("Produto:"+novoProduto.getDescricao());
                produtos.add(novoProduto);
            }
            this.tamanhoCromossomo = produtos.size();
            System.out.println("Total de produtos carregados: " + produtos.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

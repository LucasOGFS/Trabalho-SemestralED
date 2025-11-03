package util;
import java.io.*;

import br.edu.fateczl.listaSimples.Lista;

public class arquivoUtil {
	
	//Le o arquivo para coleta dos dados
	public static Lista<String> lerArquivo(String caminho) throws Exception, IOException {
        Lista<String> linhas = new Lista<>();
        File arquivo = new File(caminho);
        
        if (!arquivo.exists()) {
            arquivo.getParentFile().mkdirs();
            arquivo.createNewFile();
            return linhas; 
        }

        BufferedReader br = new BufferedReader(new FileReader(arquivo));
        String linha;
        while ((linha = br.readLine()) != null) {
            linhas.add(linha, 0);
        }
        br.close();

        return linhas;
    }

	//Grava todos os dados no arquivo
    public static void gravarArquivo(String caminho, Lista<String> linhas) throws Exception, IOException  {
        File arquivo = new File(caminho);
        arquivo.getParentFile().mkdirs(); 

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, false));
        
        for (int i = 0; i < linhas.size(); i++) {
            String linha = linhas.get(i);
            
            bw.write(linha);
            bw.newLine();
        }
        
        bw.close();
    }

    //Adiciona uma linha
    public static void adicionarLinha(String caminho, String linha) throws Exception, IOException  {
        File arquivo = new File(caminho);
        arquivo.getParentFile().mkdirs();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true));
        bw.write(linha);
        bw.newLine();
        bw.close();
    }
    
}
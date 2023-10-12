import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class BancoDePalavras {
	
	private String path;
	private ArrayList<String> listaDePalavras = new ArrayList<String>();
	
	public BancoDePalavras(String path) throws FileNotFoundException {
		this.path = path;
		readArquivo();
		
	}
	
	
	/**
	 * Lê arquivo arquivo de palavras especificado em this.path e adiciona palavras à listaDePalavras. 
	 * Se listaDePalavras já configurado, todos os itens de listaDePalavras são excluídos.
	 * @throws FileNotFoundException
	 */
	private void readArquivo() throws FileNotFoundException {
		
		if (listaDePalavras.size() > 0) {
			listaDePalavras.clear();
		}
		
		File file = new File(path);
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine())
			listaDePalavras.add(sc.nextLine());
	}
	
	/**
	 * Sorteia uma palavra da listaDePalavras
	 * @return palavra uma palavra sorteada da listaDePalavras.
	 */
	public String sorteiaPalavra() {
		Random rand = new Random();
		return listaDePalavras.get(rand.nextInt(listaDePalavras.size()));
	}

	/**
	 * Reconfigura o caminho para o banco de palavras. 
	 * Todas as palavras do arquivo são automaticamente importadas, substituindo as antigas.
	 * @param path novo caminho para ser importado o banco de palavras
	 * @throws FileNotFoundException
	 */
	public void setPath(String path) throws FileNotFoundException {
		this.path = path;
		readArquivo();
	}
	
	/**
	 * Retorna o tamanho da lista de palavras atual
	 */
	public int getTamanhoLista() {
		return listaDePalavras.size();
	}
}

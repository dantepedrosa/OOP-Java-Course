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
	
	private void readArquivo() throws FileNotFoundException {
		
		File file = new File(path);
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine())
			listaDePalavras.add(sc.nextLine());
			
	}
	
	public String sorteiaPalavra() {
		Random rand = new Random();
		return listaDePalavras.get(rand.nextInt(listaDePalavras.size()));
	}

	public void setPath(String path) throws FileNotFoundException {
		this.path = path;
		readArquivo();
	}
}

package vo;

public class No {

	int inicio;
	int anterior;
	int proximo;
	int elemento;

	String[] musicas = {"Baby - Justin Bieber", "Gavi�o - Gino e Geno","Lover - Taylow Swift",
			"Ave Maria - Roberto Carlos", "Decode - Paramore"};
	
	public void No(int inicio, int anterior, int proximo, int elemento) {
		this.inicio = 0;
		this.anterior = 0;
		this.proximo = 1;
		this.elemento = 0;
		
	}

	public String getMusicas() {
		return musicas[elemento];
	}

	public void setMusicas(String[] musicas) {
		this.musicas = musicas;
	}

	public int getProximo() {
		return proximo;
	}

	public void setProximo() {
		if (proximo ==  musicas.length) {
			System.out.println("N�o existe pr�xima m�sica.");
		}else {
			this.anterior = elemento;
			this.elemento = proximo;
			this.proximo = proximo + 1;
		}
	}

	public int getAnterior() {
		return anterior;
	}

	public void setAnterior() {
		if(anterior == 0) {
			System.out.println("N�o existe m�sica anterior.");
		}else {
			proximo = elemento;
			elemento = anterior;
			this.anterior = anterior - 1;
		}
	}
	
	
	
	

	
	
}

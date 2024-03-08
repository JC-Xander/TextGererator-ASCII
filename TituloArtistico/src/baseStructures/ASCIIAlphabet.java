package baseStructures;

/**
 * Conjunto de {@link ASCIICharacter} que en conjunto conforma un alfabeto el cual esta odenado
 * siguiendo la numerocion de los simbolos ASCII en forma ASCEDENTE par poder realizar una busqueda
 * binaria.
 * 
 * @author J-Xander
 * @version 1.0.0
 * @since 24/02/22
 * @date 24/02/26
 */
public abstract class ASCIIAlphabet {

	protected ASCIICharacter[] ASCIIAlphabet;   //Abecedario
	protected int numberOfRows;                 //Numero de lineas global de cada caracter de la fuente
	protected ASCIICharacter charErr;           //caracter que se usara cuando no se encuentre el solocitado.

	/**
	 * Busca un caracter en el abecedario.
	 * @param character caracter a buscar
	 * @return Retorna el ASCIICharaster correspondiente al parametro enviado.
	 * @throws ASCIICharacterNotFound En caso de que no encuentre el caracter.
	 */
	protected String[] searchCharacter(char character){
		return BusquedaBinaria(0, this.ASCIIAlphabet.length - 1, (int) character);
	}

	/**
	 * Metodo privado el cual se utiliza para llevar a cabo la busqueda binaria de forma recursiva.
	 * @param Start Posicion del elemento donde iniciara la busqueda.
	 * @param end Posicion del elemento donde finalizará la busqueda.
	 * @param characterSearch Codigo ASCII del caracter a buscar.
	 * @return Retorna el elemento encontrado de lo contrario retorna:
	 * @throws ASCIICharacterNotFound 
	 */
	private String[] BusquedaBinaria(int Start, int end, int characterSearch){
		if (Start > end)
			return this.charErr.ASCIIArtStringArray();	

		int mid = (int) ((Start + end) / 2);
		int target = this.ASCIIAlphabet[mid].getCharacter();

		if (target == characterSearch)
			return this.ASCIIAlphabet[mid].ASCIIArtStringArray();
		else if (target < characterSearch)
			return BusquedaBinaria(mid + 1, end, characterSearch);
		else
			return BusquedaBinaria(Start, mid - 1, characterSearch);
	}

	/**
	 * Crea una Una matriz de cadenas la cual contendra todos los elemetos del texto enviado 
	 * separador por letras y cada letra estara separada por lineas.
	 * @param Texto Palabra/s que queremos en desglozar.
	 * @return Retorna Retorna el texto enviado en formato ASCII de forma Horizontal.
	 */
	public StringBuilder sortASCIIArays(String Texto){
		String[][] ArrayCharacter = new String[Texto.length()][];
		for (int i = 0; i < Texto.length(); i++) {
			ArrayCharacter[i] = searchCharacter(Texto.charAt(i));
		}

		StringBuilder Container = new StringBuilder();

		for (int i = 0; i < this.numberOfRows; i++) {
			for (int j = 0; j < Texto.length(); j++) {
				Container.append(String.format("%s", ArrayCharacter[j][i]));
			}
			Container.append("\n");
		}

		return Container;
	}
}

package baseStructures;
/**
 * Clase Base la cual se encarga de almacenar el modelo Ascii junto al caracter al que representa en el abecedario.
 * 
 * @author J-Xander.
 * @version 1.1.0
 * @since 2024/02/23
 * @date 2024/02/15
 */
public class ASCIICharacter {

    private int character;
    private String ASCIIArt;

    public ASCIICharacter(char character, String ASCIIArt){
        this.character = (int)character;
        this.ASCIIArt = ASCIIArt;
    }

    public int getCharacter(){
        return (int)this.character;
    }
    
    /**
     * Retorna un arreglo el cual contiene las lineas por separado de toda la secuencia ASCII
     * @return un Arreglo de cadena.
     */
    public String[] ASCIIArtStringArray() {
    	return this.ASCIIArt.split("\n");
    }
}
    
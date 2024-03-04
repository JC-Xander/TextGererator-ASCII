package listAlphabetASCII;

import baseStructures.ASCIICharacter;
import baseStructures.ASCIIAlphabet;

/**
 * Avecedario ASCII con estilo 3D
 * 
 * @author J-Xander
 * @version 1.0.0
 * @since 2024/02/10
 * @date 2024/02/27
 */
public class Ascii3D extends ASCIIAlphabet {

	public Ascii3D() {
		this.ASCIIAlphabet = new ASCIICharacter[39];

		this.ASCIIAlphabet[0] = new ASCIICharacter(' ', """
				░
				░
				░
				░
				░
				░""");

		this.ASCIIAlphabet[1] = new ASCIICharacter('1', """
				░░███╗░░
				░████║░░
				██╔██║░░
				╚═╝██║░░
				███████╗
				╚══════╝""");

		this.ASCIIAlphabet[2] = new ASCIICharacter('2', """
				██████╗░
				╚════██╗
				░░███╔═╝
				██╔══╝░░
				███████╗
				╚══════╝""");

		this.ASCIIAlphabet[3] = new ASCIICharacter('3', """
				██████╗░
				╚════██╗
				░█████╔╝
				░╚═══██╗
				██████╔╝
				╚═════╝░""");

		this.ASCIIAlphabet[4] = new ASCIICharacter('4', """
				░░██╗██╗
				░██╔╝██║
				██╔╝░██║
				███████║
				╚════██║
				░░░░░╚═╝""");

		this.ASCIIAlphabet[5] = new ASCIICharacter('5', """
				███████╗
				██╔════╝
				██████╗░
				╚════██╗
				██████╔╝
				╚═════╝░""");

		this.ASCIIAlphabet[6] = new ASCIICharacter('6', """
				░█████╗░
				██╔═══╝░
				██████╗░
				██╔══██╗
				╚█████╔╝
				░╚════╝░""");

		this.ASCIIAlphabet[7] = new ASCIICharacter('7', """
				███████╗
				╚════██║
				░░░░██╔╝
				░░░██╔╝░
				░░██╔╝░░
				░░╚═╝░░░""");

		this.ASCIIAlphabet[8] = new ASCIICharacter('8', """
				░█████╗░
				██╔══██╗
				╚█████╔╝
				██╔══██╗
				╚█████╔╝
				░╚════╝░""");

		this.ASCIIAlphabet[9] = new ASCIICharacter('9', """
				░█████╗░
				██╔══██╗
				╚██████║
				░╚═══██║
				░█████╔╝
				░╚════╝░""");

		this.ASCIIAlphabet[10] = new ASCIICharacter('A', """
				░█████╗░
				██╔══██╗
				███████║
				██╔══██║
				██║░░██║
				╚═╝░░╚═╝""");

		this.ASCIIAlphabet[11] = new ASCIICharacter('B', """
				██████╗░
				██╔══██╗
				██████╦╝
				██╔══██╗
				██████╦╝
				╚═════╝░""");

		this.ASCIIAlphabet[12] = new ASCIICharacter('C', """
				░█████╗░
				██╔══██╗
				██║░░╚═╝
				██║░░██╗
				╚█████╔╝
				░╚════╝░""");

		this.ASCIIAlphabet[13] = new ASCIICharacter('D', """
				██████╗░
				██╔══██╗
				██║░░██║
				██║░░██║
				██████╔╝
				╚═════╝░""");

		this.ASCIIAlphabet[14] = new ASCIICharacter('E', """
				███████╗
				██╔════╝
				█████╗░░
				██╔══╝░░
				███████╗
				╚══════╝""");

		this.ASCIIAlphabet[15] = new ASCIICharacter('F', """
				███████╗
				██╔════╝
				█████╗░░
				██╔══╝░░
				██║░░░░░
				╚═╝░░░░░""");

		this.ASCIIAlphabet[16] = new ASCIICharacter('G', """
				░██████╗░
				██╔════╝░
				██║░░██╗░
				██║░░╚██╗
				╚██████╔╝
				░╚═════╝░""");

		this.ASCIIAlphabet[17] = new ASCIICharacter('H', """
				██╗░░██╗
				██║░░██║
				███████║
				██╔══██║
				██║░░██║
				╚═╝░░╚═╝""");

		this.ASCIIAlphabet[18] = new ASCIICharacter('I', """
				██╗
				██║
				██║
				██║
				██║
				╚═╝""");

		this.ASCIIAlphabet[19] = new ASCIICharacter('J', """
				░░░░░██╗
				░░░░░██║
				░░░░░██║
				██╗░░██║
				╚█████╔╝
				░╚════╝░""");

		this.ASCIIAlphabet[20] = new ASCIICharacter('K', """
				██╗░░██╗
				██║░██╔╝
				█████═╝░
				██╔═██╗░
				██║░╚██╗
				╚═╝░░╚═╝""");

		this.ASCIIAlphabet[21] = new ASCIICharacter('L', """
				██╗░░░░░
				██║░░░░░
				██║░░░░░
				██║░░░░░
				███████╗
				╚══════╝""");

		this.ASCIIAlphabet[22] = new ASCIICharacter('M', """
				███╗░░░███╗
				████╗░████║
				██╔████╔██║
				██║╚██╔╝██║
				██║░╚═╝░██║
				╚═╝░░░░░╚═╝""");

		this.ASCIIAlphabet[23] = new ASCIICharacter('N', """
				███╗░░██╗
				████╗░██║
				██╔██╗██║
				██║╚████║
				██║░╚███║
				╚═╝░░╚══╝""");

		this.ASCIIAlphabet[24] = new ASCIICharacter('O', """
				░█████╗░
				██╔══██╗
				██║░░██║
				██║░░██║
				╚█████╔╝
				░╚════╝░""");

		this.ASCIIAlphabet[25] = new ASCIICharacter('P', """
				██████╗░
				██╔══██╗
				██████╔╝
				██╔═══╝░
				██║░░░░░
				╚═╝░░░░░""");

		this.ASCIIAlphabet[26] = new ASCIICharacter('Q', """
				░██████╗░
				██╔═══██╗
				██║██╗██║
				╚██████╔╝
				░╚═██╔═╝░
				░░░╚═╝░░░""");

		this.ASCIIAlphabet[27] = new ASCIICharacter('R', """
				██████╗░
				██╔══██╗
				██████╔╝
				██╔══██╗
				██║░░██║
				╚═╝░░╚═╝""");

		this.ASCIIAlphabet[28] = new ASCIICharacter('S', """
				░██████╗
				██╔════╝
				╚█████╗░
				░╚═══██╗
				██████╔╝
				╚═════╝░""");

		this.ASCIIAlphabet[29] = new ASCIICharacter('T', """
				████████╗
				╚══██╔══╝
				░░░██║░░░
				░░░██║░░░
				░░░██║░░░
				░░░╚═╝░░░""");

		this.ASCIIAlphabet[30] = new ASCIICharacter('U', """
				██╗░░░██╗
				██║░░░██║
				██║░░░██║
				██║░░░██║
				╚██████╔╝
				░╚═════╝░""");

		this.ASCIIAlphabet[31] = new ASCIICharacter('V', """
				██╗░░░██╗
				██║░░░██║
				╚██╗░██╔╝
				░╚████╔╝░
				░░╚██╔╝░░
				░░░╚═╝░░░""");

		this.ASCIIAlphabet[32] = new ASCIICharacter('W', """
				░██╗░░░░░░░██╗
				░██║░░██╗░░██║
				░╚██╗████╗██╔╝
				░░████╔═████║░
				░░╚██╔╝░╚██╔╝░
				░░░╚═╝░░░╚═╝░░""");

		this.ASCIIAlphabet[33] = new ASCIICharacter('X', """
				██╗░░██╗
				╚██╗██╔╝
				░╚███╔╝░
				░██╔██╗░
				██╔╝╚██╗
				╚═╝░░╚═╝""");

		this.ASCIIAlphabet[34] = new ASCIICharacter('Y', """
				██╗░░░██╗
				╚██╗░██╔╝
				░╚████╔╝░
				░░╚██╔╝░░
				░░░██║░░░
				░░░╚═╝░░░""");

		this.ASCIIAlphabet[35] = new ASCIICharacter('Z', """
				███████╗
				╚════██║
				░░███╔═╝
				██╔══╝░░
				███████╗
				╚══════╝""");

		this.ASCIIAlphabet[36] = new ASCIICharacter('_', """
				░░░░░░
				░░░░░░
				░░░░░░
				░░░░░░
				█████╗
				╚════╝""");

		this.ASCIIAlphabet[37] = new ASCIICharacter('-', """
				░░░░░░
				░░░░░░
				█████╗
				╚════╝
				░░░░░░
				░░░░░░""");

		this.ASCIIAlphabet[38] = new ASCIICharacter('0', """
				░█████╗░
				██╔══██╗
				██║░░██║
				██║░░██║
				╚█████╔╝
				░╚════╝░""");
		
		this.numberOfRows = 6;
		this.charErr = this.ASCIIAlphabet[0];

	}// ---------- Final del constructor --------
}
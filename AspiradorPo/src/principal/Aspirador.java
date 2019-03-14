package principal;

import java.awt.font.NumericShaper.Range;
import java.util.Random;

//AMANDA OLIVEIRA DE MIRANDA -- PROJETO INTELIG�NCIA ARTIFICIAL
/**
 * 
 * @author Amanda Miranda
 *
 */
public class Aspirador {

	// M�TODO PRINCIPAL DA APLICA��O
	public static void main(String[] args) {
		acaoAgente();

	}

	public static int local[]; // CRIANDO UM ARRAY
	public static void ambienteVetor() {
		local = new int[2]; // INICIALIZANDO O ARRAY LOCAL COM 2 POSI��ES
		for (int i = 0; i < local.length; i++) {
			local[i] = (int) (Math.random() * 2); // ATRIBUINDOO VALOR ALEAT�RIO � POSI��O [i]
			// System.out.println("[ "+local[0] +" "+ local[1]+" ]");
		}
	}

	// METODO DE A��O DO AGENTE ASPIRADOR DE P�
	public static void acaoAgente() {
		ambienteVetor();
		System.out.println("##### 1- SUJO E 0-LIMPO #####\n");
		System.out.println("--> [ " + local[0] + " " + local[1] + " ]");
		if (local[0] == 1) {
			System.out.println("\n O Ambiente est� Sujo");
			System.out.println("Limpando...");
			local[0] = 0;// A POSI��O 0 � PQ � LIMPO
			// Thread.sleep(1);
			// System.out.println("--> [ "+local[0] +" "+ local[1]+" ]");
			System.out.println("Indo Para a Direita ===>\n");

		} else if (local[0] == 0) {

			System.out.println("O Ambiente est� Limpo");
			// System.out.println("--> [ "+local[0] +" "+ local[1]+" ]");
			System.out.println("Indo Para a Direita ===>\n");
		}
		if (local[1] == 1) {//A POSI��O 1 � PQ � SUJO
			System.out.println("--> [ " + local[0] + " " + local[1] + " ]");
			System.out.println("O Ambiente est� Sujo");

			System.out.println("Limpando...");
			local[1] = 0;
			// Thread.sleep(1);
			System.out.println("Indo Para a Esquerda <===\n");
			System.out.println("--> [ " + local[0] + " " + local[1] + " ]");

		} else if (local[1] == 0) {
			System.out.println("--> [ " + local[0] + " " + local[1] + " ]");
			System.out.println("O Ambiente est� Limpo");

			// System.out.println("Indo Para a Esquerda <===\n");
		}
		ambienteVetor();
	}
}

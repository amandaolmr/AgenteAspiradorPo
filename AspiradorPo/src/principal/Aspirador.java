package principal;

import java.awt.font.NumericShaper.Range;
import java.util.Random;

//AMANDA OLIVEIRA DE MIRANDA -- PROJETO INTELIGÊNCIA ARTIFICIAL
/**
 * 
 * @author Amanda Miranda
 *
 */
public class Aspirador {

	// MÉTODO PRINCIPAL DA APLICAÇÃO
	public static void main(String[] args) {
		acaoAgente();

	}

	public static int local[]; // CRIANDO UM ARRAY
	public static void ambienteVetor() {
		local = new int[2]; // INICIALIZANDO O ARRAY LOCAL COM 2 POSIÇÕES
		for (int i = 0; i < local.length; i++) {
			local[i] = (int) (Math.random() * 2); // ATRIBUINDOO VALOR ALEATÓRIO À POSIÇÃO [i]
			// System.out.println("[ "+local[0] +" "+ local[1]+" ]");
		}
	}

	// METODO DE AÇÃO DO AGENTE ASPIRADOR DE PÓ
	public static void acaoAgente() {
		ambienteVetor();
		System.out.println("##### 1- SUJO E 0-LIMPO #####\n");
		System.out.println("--> [ " + local[0] + " " + local[1] + " ]");
		if (local[0] == 1) {
			System.out.println("\n O Ambiente está Sujo");
			System.out.println("Limpando...");
			local[0] = 0;// A POSIÇÃO 0 É PQ É LIMPO
			// Thread.sleep(1);
			// System.out.println("--> [ "+local[0] +" "+ local[1]+" ]");
			System.out.println("Indo Para a Direita ===>\n");

		} else if (local[0] == 0) {

			System.out.println("O Ambiente está Limpo");
			// System.out.println("--> [ "+local[0] +" "+ local[1]+" ]");
			System.out.println("Indo Para a Direita ===>\n");
		}
		if (local[1] == 1) {//A POSIÇÃO 1 É PQ É SUJO
			System.out.println("--> [ " + local[0] + " " + local[1] + " ]");
			System.out.println("O Ambiente está Sujo");

			System.out.println("Limpando...");
			local[1] = 0;
			// Thread.sleep(1);
			System.out.println("Indo Para a Esquerda <===\n");
			System.out.println("--> [ " + local[0] + " " + local[1] + " ]");

		} else if (local[1] == 0) {
			System.out.println("--> [ " + local[0] + " " + local[1] + " ]");
			System.out.println("O Ambiente está Limpo");

			// System.out.println("Indo Para a Esquerda <===\n");
		}
		ambienteVetor();
	}
}

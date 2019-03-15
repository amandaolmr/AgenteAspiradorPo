package principal;

import java.util.Random;

//AMANDA OLIVEIRA DE MIRANDA -- PROJETO INTELIGÊNCIA ARTIFICIAL
/**
 * 
 * @author Amanda Miranda
 *
 */
public class Aspirador {

	public static int local[]; // CRIANDO UM ARRAY

	public static void ambienteVetor() {
		local = new int[2]; // INICIALIZANDO O ARRAY LOCAL COM 2 POSIÇÕES
		for (int i = 0; i < local.length; i++) {
			local[i] = (int) (Math.random() * 2); // ATRIBUINDOO VALOR ALEATÓRIO À POSIÇÃO [i]
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

			if (local[0] == 0) {
				System.out.println("O Ambiente está Limpo");
				System.out.println("Indo Para a Direita ===>\n");
			}

		} else if (local[0] == 0) {

			System.out.println("O Ambiente está Limpo");
			System.out.println("Indo Para a Direita ===>\n");
		}
		if (local[1] == 1) {// A POSIÇÃO 1 É PQ É SUJO
			System.out.println("--> [ " + local[0] + " " + local[1] + " ]");
			System.out.println("O Ambiente está Sujo");

			System.out.println("Limpando...");
			local[1] = 0;
			System.out.println("--> [ " + local[0] + " " + local[1] + " ]");

			if (local[1] == 0) {
				System.out.println("O Ambiente está Limpo");
				System.out.println("Indo Para a Esquerda ===>\n");
			}
		} else if (local[1] == 0) {
			System.out.println("--> [ " + local[0] + " " + local[1] + " ]");
			System.out.println("O Ambiente está Limpo");

		}
		ambienteVetor();
		//acaoAgente(); //OBS: Tirando o LOOP 

		atualizarMemoria();
	}

	//CRIANDO UM METODO PARA ATUALIZAR A MEMORIA DO AGENTE
	public static void atualizarMemoria() {
		
		String percepcao[][]= new String[6][3];
		percepcao[0][0] = "LOCAL";
		percepcao[0][1] = "PERCEPÇÂO";
		percepcao[0][2] = "ESTADO";
		
		System.out.println(percepcao[0][0]);
		System.out.println(percepcao[0][1]);
		System.out.println(percepcao[0][2]);

	}
	// MÉTODO PRINCIPAL DA APLICAÇÃO
	public static void main(String[] args) {
		acaoAgente();

	}

}

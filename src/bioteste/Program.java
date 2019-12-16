package bioteste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {

	public static void main(String[] args) {

		
        //Lendo sequencia de origem e definindo os parametros		
		
		double percetagemAlt = 0.01; // Percentagem de alteração aplicada na sequência
		double inicioAlt = 0.1; // Inicio da alteração

		List<Character> sequenceAlt = new ArrayList<Character>();
		List<Character> sequenceCompl = new ArrayList<Character>();

		String path = "D:\\Bioinformatica\\2019\\dez-novos testes\\GeneG.fna";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				for (int i = 0; i < line.length(); i++) {
					sequenceAlt.add(line.charAt(i));
					sequenceCompl.add(line.charAt(i));
				}

				line = br.readLine();

			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		

		String sequence2 = new String(sequenceAlt.toString());
		sequence2 = sequence2.replace("[", "");
		sequence2 = sequence2.replace(",", "");
		sequence2 = sequence2.replace("]", "");
		sequence2 = sequence2.replace(" ", "");

		System.out.println(">SeqOrigem " + "Tam[" + sequenceAlt.size() + "]");
		System.out.println(sequence2);

		// Novas sequências alteradas

		for (int z = 1; z < 11; z++) {

			System.out.println();
			// System.out.println();
			int tamanhoAreaAlteradaAnterior = (int) Math.ceil(sequenceAlt.size() * (percetagemAlt * (z - 1)));
			// System.out.println("Numero de nucletideos que serão alterados ANTEIOR: " +
			// tamanhoAreaAlteradaAnterior);
			int tamanhoAreaAlterada = (int) Math
					.ceil((sequenceAlt.size() * (percetagemAlt * z) - tamanhoAreaAlteradaAnterior));
			// System.out.println("Numero de nucletideos que serão alterados: " +
			// tamanhoAreaAlterada);
			int areaInicial = (int) ((sequenceAlt.size() * inicioAlt) + tamanhoAreaAlteradaAnterior);
			// System.out.println("Posição inicial da alteração: " + areaInicial);
			int areaInicialTotal = (int) (sequenceAlt.size() * inicioAlt);
			// System.out.println("Posição inicial da alteração Total: " +
			// areaInicialTotal);

			for (int a = 0; a < tamanhoAreaAlterada; a++) {
				Character inicial = sequenceAlt.get(areaInicial + a);
				int posicao = areaInicial + a;

				if (inicial != null && inicial == 'A') {
					String nucleotideos = "GC";
					Random random = new Random();
					Character armazenaChaves = null;

					for (int x = 0; x < 25; x++) {
						int index = random.nextInt(2);
						armazenaChaves = nucleotideos.charAt(index);

					}

					sequenceAlt.set(posicao, armazenaChaves);

				}

				else if (inicial != null && inicial == 'T') {
					String nucleotideos = "GC";
					Random random = new Random();
					Character armazenaChaves = null;

					for (int x = 0; x < 25; x++) {
						int index = random.nextInt(2);
						armazenaChaves = nucleotideos.charAt(index);

					}

					sequenceAlt.set(posicao, armazenaChaves);

				}

				else {
					String nucleotideos = "AT";
					Random random = new Random();
					Character armazenaChaves = null;

					for (int x = 0; x < 25; x++) {
						int index = random.nextInt(2);
						armazenaChaves = nucleotideos.charAt(index);

					}

					sequenceAlt.set(posicao, armazenaChaves);

				}

			}

			String sequence1 = new String(sequenceAlt.toString());
			sequence1 = sequence1.replace("[", "");
			sequence1 = sequence1.replace(",", "");
			sequence1 = sequence1.replace("]", "");
			sequence1 = sequence1.replace(" ", "");
			// System.out.println();
			int areafinal = areaInicialTotal + tamanhoAreaAlterada + tamanhoAreaAlteradaAnterior - 1;

			System.out.println(">Seq" + z + " Alt[" + areaInicialTotal + ".." + areafinal + "]");
			System.out.println(sequence1);

		}
		
		//Sequencia Complementar

		for (int y = 0; y < sequenceCompl.size(); y++) {
			int areaInicial = 0;
			Character inicial = sequenceCompl.get(areaInicial + y);
			int posicao = areaInicial + y;

			if (inicial != null && inicial == 'A') {

				Character armazenaChaves = 'T';
				sequenceCompl.set(posicao, armazenaChaves);

			}

			else if (inicial != null && inicial == 'T') {

				Character armazenaChaves = 'A';
				sequenceCompl.set(posicao, armazenaChaves);

			}

			else if (inicial != null && inicial == 'G') {

				Character armazenaChaves = 'C';
				sequenceCompl.set(posicao, armazenaChaves);

			}

			else {

				Character armazenaChaves = 'G';
				sequenceCompl.set(posicao, armazenaChaves);

			}

		}
		
		String sequence4 = new String(sequenceCompl.toString());
		sequence4 = sequence4.replace("[", "");
		sequence4 = sequence4.replace(",", "");
		sequence4 = sequence4.replace("]", "");
		sequence4 = sequence4.replace(" ", "");
	
        System.out.println();
		System.out.println(">SeqComplementar");
		System.out.println(sequence4);

		
	}

}

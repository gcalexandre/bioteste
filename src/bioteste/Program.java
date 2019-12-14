package bioteste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double percetagemAlt = 0.1;
		double inicioAlt = 0.1;
		List<Character> sequence = new ArrayList<Character>();

		String path = "D:\\Bioinformatica\\2019\\dez-novos testes\\GeneG.fna";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				for (int i = 0; i < line.length(); i++) {
					sequence.add(line.charAt(i));
				}
				
				System.out.println(line);
				line = br.readLine();

			}

			System.out.println(sequence.size());

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
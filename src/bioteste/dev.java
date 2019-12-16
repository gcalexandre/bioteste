package bioteste;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class dev {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i =1; i<10; i++) {
			System.out.println(i);
		}

		List<Character> sequence = new ArrayList<Character>();
		sequence.add('G');
		sequence.add('G');
		sequence.add('G');
		sequence.add('G');
		sequence.add('G');
		sequence.add('G');
		sequence.add('G');
		sequence.add('G');
		sequence.add('G');
		sequence.add('G');
		sequence.add('G');
		
		System.out.println(sequence);
		
		sequence.set(1, 'C');
		
		System.out.println(sequence);
		
		String nucleotideos = "GC";
		System.out.println(nucleotideos.charAt(0));
		System.out.println(nucleotideos.charAt(1));

		Random random = new Random();

		Character armazenaChaves = null;

		for (int i = 0; i < 25; i++) {
			int index = random.nextInt(2);
			System.out.println(index);

			armazenaChaves = nucleotideos.charAt(index);
		}

		System.out.println(armazenaChaves);

	}

}

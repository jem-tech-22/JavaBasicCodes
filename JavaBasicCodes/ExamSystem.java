package JavaBasicCodes;
import java.util.Scanner;
// @jem-tech-22
public class ExamSystem {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// PART I: MULTIPLE CHOICES
		String[] multipleChoicesQuestions = {
			"1. Ano ang ginagamit sa Java para mag-print?",
			"2. Anong data type ang gamit para sa whole numbers?",
			"3. Ano ang entry point ng Java program?",
			"4. Anong keyword ang gamit para gumawa ng object?",
			"5. Anong data type ang gamit para sa single character?"
		};

		String[][] choices = {
            {"A. console.log()", "B. System.out.println()", "C. print()"},
            {"A. int", "B. String", "C. double"},
            {"A. start()", "B. main()", "C. run()"},
            {"A. new", "B. class", "C. object"},
            {"A. float", "B. boolean", "C. char"}
        };

		String[] multipleChoicesAnswers = {
			"b",
			"a",
			"b",
			"a",
			"c"
		};

		int partOneScore = 0;
		
		System.out.println("UNANG PAGSUSULIT 2025");

		System.out.print("Name: ");
		String name = input.nextLine();

		System.out.print("Section: ");
		String section = input.nextLine();

		System.out.println("");
		System.out.println("Part I: Multiple Choices (5 points)");

		for(int i = 0; i < multipleChoicesQuestions.length; i++){
			System.out.println(multipleChoicesQuestions[i]);
			for (int a = 0; a < choices[i].length; a++) {
            System.out.println(choices[i][a]);
			} 

			System.out.print("Sagot: ");
			String sagot = input.nextLine();

			if(sagot.equalsIgnoreCase(multipleChoicesAnswers[i])){
				partOneScore++;
			}

		}

		System.out.println("Ang score na iyong nakuha ay " + partOneScore + "/" + multipleChoicesAnswers.length );

		// PART II: IDENTIFICATIONS
		String[] identificationQuestions = {
			"1. Anong data type ang ginagamit sa whole number?",
			"2. Ano ang tawag sa simbolong ginagamit para magtapos ng bawat statement sa Java?",
			"3. Ano ang tawag sa pagkakamali sa code na kailangang ayusin?",
			"4. Ano ang tawag sa lokasyon kung saan ini-store ang mga values (halimbawa: int, double, String)?",
			"5. Anong data type ang gamit para sa single character?"
		};

		String[] identificationAnswers = {
			"integer",
			"semicolon",
			"bug",
			"variable",
			"character"
		};

		int partTwoScore = 0;
		
		System.out.println("");
		System.out.println("Part II: Identification (5 points)");
		
		for(int two = 0; two < identificationQuestions.length; two++){
			System.out.println(identificationQuestions[two]);

			System.out.print("Sagot: ");
			String sagot = input.nextLine();

			if(sagot.equalsIgnoreCase(identificationAnswers[two])){
				partTwoScore++;
			}

		}

		System.out.println("Ang score na iyong nakuha ay " + partTwoScore + "/" + identificationQuestions.length );

		// PART III: ESSAY
		int partThreeScore;

		System.out.println("");
		System.out.println("Part III: Essay (5 points)");

		System.out.println("Bilang isang IT student, bakit mahalagang pag-aralan ang programming language, at paano ito makakatulong sa iyo?");
		System.out.print("Sagot: ");
		String essaySagot = input.nextLine();

		System.out.print("Essay score (0-5): ");
		partThreeScore = input.nextInt();
		
		System.out.println("");
		System.out.println("TOTAL NG SCORE NA IYONG NAKUHA (15 points): " + (partOneScore+partTwoScore+partThreeScore) + "/15");
		System.out.println("");

		int totalScores = partOneScore+partTwoScore+partThreeScore;

		if(totalScores <= 5){
			System.out.println("Bagsak! Kailangan mo mag summer class.");
		} else if(totalScores <= 12){
			System.out.println("Pasado! Galingan pa sa susunod upang makakuha ng mas mataas na marka.");
		} else{
			System.out.println("Pasado! Mahusay! Mataas ang iyong nakuhang marka.");
		}

		input.close();

	}
}

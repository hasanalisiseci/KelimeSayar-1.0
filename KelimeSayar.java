import java.util.Scanner;

public class KelimeSayar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cumleSayac = 0, kelimeSayac = 0;
		String cumle;

		System.out.print("Cumle giriniz : ");
		cumle = input.nextLine();

		for (int i = 0; i < cumle.length(); i++) {
			if (cumle.charAt(i) == ' ') {
				kelimeSayac++;
			}
			if (cumle.charAt(i) == '.' || cumle.charAt(i) == '?' || cumle.charAt(i) == '!' || cumle.charAt(i) == ':') {
				cumleSayac++;
			}
		}
		System.out.println((cumleSayac) + " Cumlede toplam " + (kelimeSayac + 1) + " kelime var.");
		input.close();
	}

}

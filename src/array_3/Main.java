package array_3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] cities = new String[3][3];
		cities[0][0] = "?stanbul";
		cities[0][1] = "Bursa";
		cities[0][2] = "Bilecik";
		cities[1][0] = "Ankara";
		cities[1][1] = "Konya";
		cities[1][2] = "Kayseri";
		cities[2][0] = "Diyarbak?r";
		cities[2][1] = "?anl?urfa";
		cities[2][2] = "Gaziantep";
		
		for (int i = 0; i < 3; i++) {
			System.out.println("-------------------");
			for (int j = 0; j < 3; j++) {
				System.out.println(cities[i][j]);
			}
		}
	}
}
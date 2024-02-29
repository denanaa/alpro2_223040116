package pertemuan4;

public class Latihan1 {
	
	public void run () {
		int brs = 4;
		int kol = 5;
		for (int i = 0; i < brs; i++)
		{
			System.out.printf("baris ke-%d : ", i);
			for (int j = 0; j < kol; j++)
			{
				System.out.printf("%d", j);
			}
			System.out.printf("\n");
			
		}
	}
}

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Dos_Rename {
	public static void main(String[] args) {
		FileWriter fr = null;
		BufferedWriter bw = null;
		File f = new File("lottoNum.txt");
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45 + 1);
			for(int j = 0; j < i; j++) { // j < i >> 채워진 값 비교위해
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		try {
			fr = new FileWriter(f);
			bw = new BufferedWriter(fr);
			for(int i : lotto) {
				bw.write(String.valueOf(i));
				bw.newLine();
				System.out.println(i);
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("익셉션오류");
		}finally {
			try {
				bw.close();
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

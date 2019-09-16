import java.io.File;
import java.util.ArrayList;

public class Dos_Rename {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("사용법 : java [실행파일명] [경로명] [파일명 1] [파일명 2]");
			System.out.println("예시 : java [Ex10_java] [C:\\Temp] [1.txt] [2.txt]");
			System.exit(0);
		}
		File f = new File(args[0]); // new File("C:\\Temp")
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않는 디렉토리");
			System.exit(0);
		}
		File[] files = f.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			String name = files[i].getName();
			if(args[1].equals(name)) {
				String firPath;
				String secPath;
				
				firPath = f + "\\" + args[1];
				secPath = f + "\\" + args[2];
				File firFile = new File(firPath);
				File secFile = new File(secPath);
				
				if(secFile.exists()) {
					System.out.println("이미 존재하는 파일명입니다");
				}else {
					firFile.renameTo(secFile);
					System.out.println("변경 되었습니다");
				}
			}
			
		}
	}
}
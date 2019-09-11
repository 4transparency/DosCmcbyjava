import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DosType {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("사용법 : java [실행파일명] [파일명]");
			System.out.println("ex) java DosType C:\\SmartWeb\\JAVA\\오늘\\Trello.txt(띄어쓰기 안됨+한글깨짐)");
			System.exit(0);
		}		
		File file = new File(args[0]);
		if(!file.exists()) {
			System.out.println("아... 유효하지 않은 파일입니다.");
			System.exit(0);
		}
		FileInputStream fis = null;
		BufferedInputStream bis = null;
	
		try {	
			fis = new FileInputStream(args[0]);
			bis = new BufferedInputStream(fis);
			int data = 0;
			while ((data = fis.read()) != -1) {
				System.out.print((char)data);
			}	
		}catch(Exception e) {
		}finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}
}

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DosType {
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("���� : java [�������ϸ�] [���ϸ�]");
			System.out.println("ex) java DosType C:\\SmartWeb\\JAVA\\����\\Trello.txt(���� �ȵ�+�ѱ۱���)");
			System.exit(0);
		}		
		File file = new File(args[0]);
		if(!file.exists()) {
			System.out.println("��... ��ȿ���� ���� �����Դϴ�.");
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

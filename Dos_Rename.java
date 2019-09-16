import java.io.File;
import java.util.ArrayList;

public class Dos_Rename {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("���� : java [�������ϸ�] [��θ�] [���ϸ� 1] [���ϸ� 2]");
			System.out.println("���� : java [Ex10_java] [C:\\Temp] [1.txt] [2.txt]");
			System.exit(0);
		}
		File f = new File(args[0]); // new File("C:\\Temp")
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� �ʴ� ���丮");
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
					System.out.println("�̹� �����ϴ� ���ϸ��Դϴ�");
				}else {
					firFile.renameTo(secFile);
					System.out.println("���� �Ǿ����ϴ�");
				}
			}
			
		}
	}
}
import java.io.File;
import java.util.Scanner;

public class RemoveDir {

	public static void main(String[] args) {
		//System.out.println(args[0]);
		//System.out.println(args.length);
		File f = null;
		if(args.length != 1) {
			System.exit(0);
		} else {
			f = new File(args[0]);  //�ƱԸ�Ʈ ��Ʈ���� ������ �ϳ��� �����ϴ� �� �ϳ��� �ƴҰ�� �ý����� ���� 
		}
		 // c:\IOTemp �ּҰ� �������� ������ �ִ� ���丮�� 
		File[] files = f.listFiles(); //�����ȿ� �ִ� ��� ������ ������ ��� 
	
		if(!f.exists() ||!f.isDirectory()) { 
			
			System.out.println("���丮�� �߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			System.exit(0);
		} else {
			for(int i = 0; i < files.length ; i++) {
				if(files[i].getName().equals(args[1])) {
					 files[i].delete(); //������ �� Ȯ���ϱ� 
					  System.out.println("���丮�� �����Ͽ����ϴ�.");
				} else {				
					System.out.println("������ ������ �����ϴ�");
				}
			}
		}
		
		
		
		
		/*
		Scanner scan = new Scanner(System.in);
		//String[] input = null; 
		String input = scan.nextLine(); //.split(" "); // ���ø�Ʈ�� �迭�� ����� 
		//String path =  "C:\\IOTemp\\" + input[1];
		//String path = args[0] ;
		File file = new File( args[0]);
		
		if(!file.exists() ||!file.isDirectory()) {
			System.out.println("���丮�� �߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���");
			System.exit(0);
		} else {
			file.delete();
		  System.out.println("���丮�� �����Ͽ����ϴ�.");
		}	*/
	}
}

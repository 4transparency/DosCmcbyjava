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
			f = new File(args[0]);  //아규먼트 스트링의 개수를 하나로 제한하는 것 하나가 아닐경우 시스템을 끈다 
		}
		 // c:\IOTemp 주소값 지우고싶은 폴더가 있는 디렉토리값 
		File[] files = f.listFiles(); //폴더안에 있는 모든 폴더와 파일의 명단 
	
		if(!f.exists() ||!f.isDirectory()) { 
			
			System.out.println("디렉토리를 잘못 입력하였습니다. 다시 입력해주세요");
			System.exit(0);
		} else {
			for(int i = 0; i < files.length ; i++) {
				if(files[i].getName().equals(args[1])) {
					 files[i].delete(); //삭제할 값 확인하기 
					  System.out.println("디렉토리를 삭제하였습니다.");
				} else {				
					System.out.println("삭제할 파일이 없습니다");
				}
			}
		}
		
		
		
		
		/*
		Scanner scan = new Scanner(System.in);
		//String[] input = null; 
		String input = scan.nextLine(); //.split(" "); // 스플리트로 배열을 만들어 
		//String path =  "C:\\IOTemp\\" + input[1];
		//String path = args[0] ;
		File file = new File( args[0]);
		
		if(!file.exists() ||!file.isDirectory()) {
			System.out.println("디렉토리를 잘못 입력하였습니다. 다시 입력해주세요");
			System.exit(0);
		} else {
			file.delete();
		  System.out.println("디렉토리를 삭제하였습니다.");
		}	*/
	}
}

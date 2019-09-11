

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MycmdCD {

	public static void main(String[] args) {
		FileWriter fw = null; // = new FileWriter("cd.txt");
		File f=null;
		String tempFile = "cd.txt";
		try {
			fw = new FileWriter(tempFile);
			f= new File(tempFile);
			
			String path = f.getAbsolutePath();
			int index = path.indexOf(tempFile);
			String path2 = path.substring(0, index-1);
			
			if(args.length != 1) {
				System.exit(0);
				
			}else if(args[0].equals("cd")) {
				
				System.out.println(path2);
			}
			
			File moveTo = new File(args[1]);
			
			if(moveTo.isDirectory()) {
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
				System.out.println(f.delete());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		

	}

}

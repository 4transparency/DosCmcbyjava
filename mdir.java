import java.io.File;

public class mdir {
	public static void main(String[] args) {
		String path = "C:\\IOTemp\\dir";
		File file = new File(path);

		if (!file.exists()) {
			System.out.println("The folder is created: " + file.getName());
			boolean result = false;
			try {
				file.mkdir();
				result = true;
			} catch (Exception e) {
			}
		} else {
			System.out.println("Failed to create the folder");
		}
	}
}

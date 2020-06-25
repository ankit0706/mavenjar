package sample.randomid;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.UUID;

import org.apache.commons.io.FileUtils;

public class MainApp {
	public static void main(String[] args) {
		File file = new File("id-set.txt");
		MainApp app = new MainApp();
		app.createFile(file, 100);
	}
	
	
	private void createFile(File file, int count){
		String content = "";
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < count; i++) {
			String guid = UUID.randomUUID().toString();	
			builder.append(guid + "\n");
		}
		try {
			content = builder.toString();
			FileUtils.writeStringToFile(file, content, Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void printNum() {
		System.out.println("Printing random UID: " + UUID.randomUUID().toString());
	}
}

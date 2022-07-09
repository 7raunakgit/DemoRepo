package tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file=new File("/Users/raunak/eclipse-workspace/PracticeSeleniumWithJava/src/DataFiles/TEXTFILE");
		BufferedReader bf = new BufferedReader(new FileReader(file));
		int count=0, word=0;
		String s="";
		while((s=bf.readLine()) != null) {
			count++;
			String[] str=s.split(" ");
			word=word+str.length;
		}
		System.out.println(count);
		System.out.println(word);

	}
}

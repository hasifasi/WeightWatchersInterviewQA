package ExcercieseInterviewWW;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Execute1stQA_FileExcercise {
	
	public static void main(String[] args) {

		String path =System.getProperty("user.dir")+ "/" +"src\\ExcercieseInterviewWW"+"/"+ "WWfile.txt"; 
		Execute1stQA_FileExcercise.doesFileExist(path);

	}

	public static void doesFileExist(String path) {

		try {
			File file = new File(path);
			if(file.exists()){
				System.out.println("Yes!! File exists");
			}
				BufferedReader br = new BufferedReader(new FileReader(file));
				String value;
				while ((value = br.readLine()) != null) {
					String[] Word = value.split("-");
					For1:
					for (int j=0;j<Word.length;j++){
						System.out.println(Word[j]);
						String [] Meaning = Word[j+1].split(",");
						for (int i = 0; i < Meaning.length; i++) {
							System.out.println(Meaning[i]);
						}
					break For1;
					}	
				}
		} catch (FileNotFoundException e) {
			System.out.println("Exception occured while accessing file: " + e);
			// e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}

	}

	
	
	

}

package week13.slot02.fileinputoutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataManagement {

	ArrayList<MyData> dataList;
	
	public DataManagement() {
		dataList = new ArrayList<MyData>();
	}
	
	public void saveToFile(String saveFile) throws FileNotFoundException {
		String allData = "";
		File file = new File(saveFile);
		PrintWriter printWriter = new PrintWriter(file);
		allData = allData + "<dataList>";
		for(MyData data : dataList) {
			allData = allData + "<data>";
			allData = allData + "<id>" + data.id + "</id>";
			allData = allData + "<data1>" + data.data1 + "</data1>";
			allData = allData + "<data2>" + data.data2 + "</data2>";
			allData = allData + "</data>";
		}
		allData = allData + "</dataList>";
		printWriter.println(allData);
		printWriter.close();
	}
	
	public void loadFromFile(String loadFile) throws FileNotFoundException {
		String allData = "";
		File file = new File(loadFile);
		Scanner readFile = new Scanner(file);
		while(readFile.hasNextLine()) {
			allData = allData + readFile.nextLine();
		}
		
		if(allData.matches("^<dataList>.*</dataList>$")) {
			dataList.clear();
			
			Pattern dataPattern = Pattern.compile(
					"<data>" +
					"<id>(.*?)</id>" +
					"<data1>(.*?)</data1>" +
					"<data2>(.*?)</data2>" +
					"</data>"
					);
			Matcher dataMatcher = dataPattern.matcher(allData);
			
			while(dataMatcher.find()) {
				dataList.add(new MyData(
						Integer.parseInt(dataMatcher.group(1)),
						dataMatcher.group(2),
						dataMatcher.group(3)
						));
			}
		}
	}
	
}





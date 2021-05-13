package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;

public class JSONFileRead {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		// TODO Auto-generated method stub

		  File file = new File("C:\\Users\\bsubra11\\Desktop\\BARATH\\request.json");
		  FileReader fileReader = new FileReader(file);
		  JSONParser jsonParser = new JSONParser();
		  Object obj = jsonParser.parse(fileReader);
		  JSONObject jsonObject =(JSONObject)obj;
		  //full request from requet.json 
		  System.out.println(jsonObject);
		  
		  //getting child json
		  JSONObject childJsonObject =(JSONObject) jsonObject.get("moduleKeyRequest");
		  
		  //getting child json array
		  JSONArray jsonArray = (JSONArray) childJsonObject.get("esnInfo");
		  System.out.println(jsonArray);
		  
		  
		  JSONObject objects = (JSONObject) jsonArray.get(0);
		  System.out.println(objects);
				  
		  System.out.println(" size of object--->" + objects.size());
		  System.out.println(" values from request.json for requestType --->" + objects.get("requestType"));
		 
		  //setting value to the request type
		  objects.put("requestType", "not null");
		  System.out.println(" values changed for requestType --->" + objects.get("requestType"));
		  
		  //update full json
		  System.out.println(jsonObject);

		  


	}

}

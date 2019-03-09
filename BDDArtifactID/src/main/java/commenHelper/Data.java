package commenHelper;

import java.util.List;

import org.json.JSONObject;




public class Data {

	public void compareJsonByKeys(List<String> keyList, JSONObject json1, JSONObject json2) {
		for(String key : keyList) {
			String value1=json1.getString(key);
			String value2=json2.getString(key);
		//	Assert.assertEquals(expected, actual);
		//	Assert.assertEquals(expected, actual);
			
		
		}
	}
	//concatArrays(JSONArrya... jarray)
	
	// sortJson(json)
	// extractString(String, pattern) //regEx
	
	// strToJson(string)
	//jsonToStr(jsonObject)
	
	// getJsonFromArray(JsonArray, jsonKey, jsonValue)
	
	//getArrayFromJson(Json, arrayKey, anyValueIntheArray)
	
	// hasSepecialChars()
	public boolean isAlpahNumeric(String str) {
		int i=0;
		int size=str.length();
		while(i< size) {
			char c= str.charAt(i);
			if(c < 0x30 || (c>=0x30 && c<=0x40) || (c> 0x5a && c<=0x60) || c>0x7a)
				return false;
			i++;
		}
		return false;
		}
	
}

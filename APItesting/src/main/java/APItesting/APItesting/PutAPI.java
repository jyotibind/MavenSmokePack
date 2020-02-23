package APItesting.APItesting;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class PutAPI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		CloseableHttpClient closeableConnection=HttpClients.createDefault();
		
		HttpPut putRequest= new HttpPut("https://reqres.in/api/users/2");	
		putRequest.addHeader("Content-Type", "application/json");
		String strRequestPayload = FileUtils.readFileToString(new File( "C:\\Users\\SINGH\\eclipse-workspace\\APItesting\\src\\main\\java\\APItesting\\APItesting\\strRequestPayload.txt"));
		
	    String newRequest=null;
	    if(strRequestPayload.contains("leader"))
	    	
	    {
	    	newRequest=strRequestPayload.replace("leader", "automation");
	    }
	    
	    putRequest.setEntity(new StringEntity(newRequest));
        
		CloseableHttpResponse response=closeableConnection.execute(putRequest);
		int statusCode=response.getStatusLine().getStatusCode();
		System.out.println(statusCode);

		String responseBody=EntityUtils.toString(response.getEntity(),"UTF-8");
		System.out.println(responseBody);
		JSONObject obj = new JSONObject(responseBody);
		System.out.println(obj.get("job"));
		


	}

}

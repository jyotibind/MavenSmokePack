package APItesting.APItesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class DeleteAPI {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		CloseableHttpClient closeable=HttpClients.createDefault();
		HttpDelete delete= new HttpDelete("https://reqres.in/api/users");	
		
		
		String strRequestPayload = FileUtils.readFileToString(new File( "C:\\Users\\SINGH\\eclipse-workspace\\APItesting\\src\\main\\java\\APItesting\\APItesting\\strRequestPayload.txt"));
		
		//put.setEntity(new StringEntity(strRequestPayload));
		
		CloseableHttpResponse response=closeable.execute(delete);
		
		int statusCode=response.getStatusLine().getStatusCode();
		System.out.println(statusCode);
		
	}

}

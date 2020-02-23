package APItesting.APItesting;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.http.HttpMessage;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class PostAPITest {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		CloseableHttpClient closeable=HttpClients.createDefault();
		HttpPost post= new HttpPost("https://reqres.in/api/users");	
		
		
		post.addHeader("Content-Type", "application/json");
		
		String strRequestPayload = FileUtils.readFileToString(new File( "C:\\Users\\SINGH\\eclipse-workspace\\APItesting\\src\\main\\java\\APItesting\\APItesting\\strRequestPayload.txt"));
		
		post.setEntity(new StringEntity(strRequestPayload));
		
		CloseableHttpResponse response=closeable.execute(post);
		
		int statusCode=response.getStatusLine().getStatusCode();
		System.out.println(statusCode);

	}

}

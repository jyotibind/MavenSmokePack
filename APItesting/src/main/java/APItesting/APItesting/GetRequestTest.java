package APItesting.APItesting;

	import java.io.IOException;

	import org.apache.http.Header;
	import org.apache.http.client.ClientProtocolException;
	import org.apache.http.client.methods.CloseableHttpResponse;
	import org.apache.http.client.methods.HttpGet;
	import org.apache.http.impl.client.CloseableHttpClient;
	import org.apache.http.impl.client.HttpClients;
	import org.apache.http.util.EntityUtils;
	import org.json.JSONArray;
	import org.json.JSONObject;

	public class GetRequestTest {

		public static void main(String[] args) throws ClientProtocolException, IOException {
			// TODO Auto-generated method stub
			CloseableHttpClient closeable=HttpClients.createDefault();
			
			HttpGet get= new HttpGet("https://reqres.in/api/users?page=2");
			CloseableHttpResponse response=closeable.execute(get);
			int statusCode=response.getStatusLine().getStatusCode();
			System.out.println(statusCode);
			
			Header[] headerValueList=response.getAllHeaders();
			System.out.println(headerValueList.length);
			
			for(Header val:headerValueList) {
//				String headerKey=val.getName();
//				String headerValue=val.getValue();
				
				
				//System.out.println(headerKey+" : "+headerValue);
			}
			
		String responseBody=EntityUtils.toString(response.getEntity(),"UTF-8");	
		JSONObject jsonObject= new JSONObject(responseBody);	
		JSONArray obj2=(JSONArray) jsonObject.get("data");
		for(Object val:obj2) {
			JSONObject obj=(JSONObject) val;
			System.out.println(obj.get("email"));
		}
		}

	}
	



package APItesting.APItesting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class PutJsonObj {
 
   
    public void updateEmployee() throws ClientProtocolException, IOException {
 
        String putEndpoint = "https://reqres.in/api/users/2";
 
        CloseableHttpClient httpclient = HttpClients.createDefault();
 
        HttpPut httpPut = new HttpPut(putEndpoint);
        httpPut.setHeader("Content-type", "application/json");
 
        String inputJson = "{\n" +
            "  \"name\": \"put_test_employee\",\n" +
            "  \"job\": \"\",\n" +
            "}";
 
        StringEntity stringEntity = new StringEntity(inputJson);
        httpPut.setEntity(stringEntity);
        System.out.println("Executing request " + httpPut.getRequestLine());
 
        HttpResponse response = httpclient.execute(httpPut);
 
        BufferedReader br = new BufferedReader(new InputStreamReader((response.getEntity().getContent())));
 
        //Throw runtime exception if status code isn't 200 
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
        }
 
        //Create the StringBuffer object and store the response into it. 
        StringBuffer result = new StringBuffer();
        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println("Response : \n" + result.append(line));
        }
 
        //Lets validate if a text 'employee_salary' is present in the response 
        System.out.println("Does Reponse contains 'salary'? :" + result.toString().contains("salary"));
    }
}
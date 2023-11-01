

import java.io.IOException;


import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;


import junit.framework.Assert;
public class RestApi1 {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		
		String url = "https://www.mcom-131.tbe.zeus.fds.com/xapi/homepage/v1/canvas";
		HttpUriRequest req = new HttpGet(url);
		HttpResponse response =  HttpClientBuilder.create().build().execute(req);
		int code = response.getStatusLine().getStatusCode();
		System.out.println("Status code is::"+code);
		Assert.assertEquals(code, 200);


	}

}

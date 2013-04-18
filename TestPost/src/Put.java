import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class Put {

	public static void main(String[] args) {
		try {
			URL u = new URL(
					"http://192.168.1.5:8080/Mobile_Application_RESTful_API/patients");
			HttpURLConnection c = (HttpURLConnection) u.openConnection();
			c.setRequestMethod("PUT");
			c.setDoOutput(true);
			OutputStreamWriter out = new OutputStreamWriter(c.getOutputStream());
			out.write("title=hello+world");
			out.close();
			c.disconnect();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

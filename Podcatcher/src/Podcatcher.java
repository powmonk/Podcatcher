import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Podcatcher {

	public static void main(String[] args) throws Exception{
		URL harmonTown = new URL("http://feeds.feedburner.com/HarmontownPodcast");
		
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(harmonTown.openStream()));

		        String inputLine;
		        while ((inputLine = in.readLine()) != null)
		            System.out.println(inputLine);
		        in.close();

	}

}

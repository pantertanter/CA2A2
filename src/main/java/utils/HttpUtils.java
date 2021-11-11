package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HttpUtils {
    public static String fetch(String _url) throws IOException {
        URL url = new URL(_url);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("Accept", "application/json");
        con.setRequestProperty("User-Agent", "server");

        // probably overkill with only API calls since JSON is only one line.
        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String out;
        while ((out = br.readLine()) != null) {
            sb.append(out);
        }
        br.close();
        return sb.toString();
    }

    public static List<String> runParallel(List<String> urls) {
        return null;
    }

    public static List<String> runSequential(List<String> urls) throws IOException {
        List<String> res = new ArrayList<>();
        for (String url : urls) {
            res.add(fetch(url));
        }
        return res;
    }
}

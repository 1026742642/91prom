package download;

import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/8/17.
 */
public class Download {
    public static void main(String[] args) {
        try {
            System.getProperties().setProperty("http.proxyHost", "127.0.0.1");
            System.getProperties().setProperty("http.proxyPort", "1080");
            String url = "http://91.91p17.space/view_video.php?viewkey=8a47b7f49dfe07d2c38c";
            String mp4 = findMp4(html(url));
//            System.out.println(findMp4(html("http://91.91p17.space/view_video.php?viewkey=8a47b7f49dfe07d2c38c")));
//            System.out.println(mp4);
//            downloadFile(mp4);
            downloadFile("http://192.240.120.100//mp43/231822.mp4?st=jE_VWgjY7yj0VpcJnwqahQ&e=1503416569");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        findIndex("http://91.91p17.space/index.php");
    }

    public static void downloadFile(String urlStr) throws Exception {
        URL url = new URL(urlStr);
        String filename = "e:\\" + urlStr.substring(urlStr.lastIndexOf("/") + 1, urlStr.lastIndexOf("?"));
        FileUtils.copyURLToFile(url, new File(filename));
        System.out.println("Finish " + filename);
    }

    public static Vector findIndex(String str) {
        Vector[] results;
        String html = html(str);
        return null;
    }

    public static Map title(String str) {
        Map reslut = null;
        String html = html(str);
        String pattern = "";
        return reslut;
    }

    public static String findMp4(String str) {
        String mp4 = "";
        String pattern = "http://[^/]*?//[^/]*?/\\d+\\.mp4";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        if (m.find()) {
            mp4 = m.group(0);
        }
        return mp4;
    }

    public static String html(String str) {
        String word = "";
        try {
            URL my_url = new URL(str);
            HttpURLConnection conn = (HttpURLConnection) my_url.openConnection();
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/28.0.1500.29 Safari/537.36");
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String strTemp = "";
            while (null != (strTemp = br.readLine())) {
                word += strTemp;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return word;
    }
}

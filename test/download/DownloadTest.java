import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static download.Download.downloadFile;
import static download.Download.findMp4;
import static download.Download.html;

/** 
* Download Tester. 
* 
* @author <Authors name> 
* @since <pre>08/25/2017</pre> 
* @version 1.0 
*/ 
public class DownloadTest { 

@Before
public void before() throws Exception {
//    System.getProperties().setProperty("http.proxyHost", "127.0.0.1");
//    System.getProperties().setProperty("http.proxyPort", "1080");
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: downloadFile(String urlStr) 
* 
*/ 
@Test
public void testDownloadFile() throws Exception { 
//TODO: Test goes here...
    downloadFile("http://192.240.120.75//mp43/232292.mp4?st=i1perxkn5oNUrl6KAtpQKw&e=1503580619");
//    downloadFile("http://192.240.120.100//mp43/229627.mp4");
} 

/** 
* 
* Method: findIndex(String str) 
* 
*/ 
@Test
public void testFindIndex() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: title(String str) 
* 
*/ 
@Test
public void testTitle() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: findMp4(String str) 
* 
*/ 
@Test
public void testFindMp4() throws Exception { 
//TODO: Test goes here...
    System.out.println(findMp4(html("http://91.91p17.space/view_video.php?viewkey=8a47b7f49dfe07d2c38c")));
} 

/** 
* 
* Method: html(String str) 
* 
*/ 
@Test
public void testHtml() throws Exception { 
//TODO: Test goes here...
    System.out.println(html("http://91.91p17.space/view_video.php?viewkey=8a47b7f49dfe07d2c38c"));
} 


} 

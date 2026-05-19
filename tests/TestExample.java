import com.microsoft.playwright.*;
import org.testng.annotations.Test;
public class TestExample
  {
    @Test
    public void test()
    {
      Playwright playwright=Playwright.create();
      Browser browser=playwright.chromium().launch();
      Page page=browser.newPage();
      page.navigate("http://10.77.67.16:83/Common/Login.aspx");
      System.out.println(page.title());
    }
  }

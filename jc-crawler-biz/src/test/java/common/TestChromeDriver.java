package common;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestChromeDriver {

    public static void main(String[] args) throws IOException {
        // 设置 chrome 的路径（如果你安装chrome的时候用的默认安装路径，则可省略这步）
        System.setProperty("webdriver.chrome.driver","C:/Users/sunlc/AppData/Local/Google/Chrome/Application/chrome.exe");
        // 创建一个 ChromeDriver 的接口，用于连接 Chrome（chromedriver.exe 的路径可以任意放置，只要在newFile（）的时候写入你放的路径即可）
        @SuppressWarnings("deprecation")
        ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File("D:\\chromedriver\\chromedriver_win32\\chromedriver.exe")) .usingAnyFreePort().build();
        service.start();
        // 创建一个 Chrome 的浏览器实例
        WebDriver driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
        // 让浏览器访问 Baidu
        driver.get("https://www.taobao.com/");
        // 用下面代码也可以实现
        //driver.navigate().to("http://www.baidu.com");
        // 获取 网页的 title
        System.out.println(" Page title is: " +driver.getTitle());
        // 通过 id 找到 input 的 DOM
        WebElement element =driver.findElement(By.id("q"));
        // 输入关键字
        element.sendKeys("东鹏瓷砖");
        // 提交 input 所在的 form
        element.submit();
        // 通过判断 title 内容等待搜索页面加载完毕，间隔秒
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition() {
            @Override
            public Object apply(Object input) {
                return ((WebDriver)input).getTitle().toLowerCase().startsWith("东鹏瓷砖");
            }
        });
        // 显示搜索结果页面的 title
        System.out.println(" Page title is: " +driver.getTitle());
        // 关闭浏览器
        driver.quit();
        // 关闭 ChromeDriver 接口
        service.stop();
    }

}  
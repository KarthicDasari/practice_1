import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class practice_1 {
    private WebDriver driver = null;

    @Test
    public void reverseStr() {
        String str = "reverse";
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }

        System.out.print(reverse.toString());
    }

    @Test
    public void launchBrowser()  {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("http://www.hiscox.com/");
        driver.manage().window().maximize();
        System.out.print( driver.findElement(By.xpath("//*[@id=\"nav__wrap\"]/div/nav[3]/li[1]/a[1]")).getText());
//        driver.findElement(By.cssSelector(""));
        driver.quit();
    }

@Test
    public void stringPal(){
        String str="aaaaa";
        int[] arr = {1,2,3,4,5};

        int len=str.length()-1;
        for(int i =0; i<(str.length())/2;  i++) {
            if (str.charAt(i)!=str.charAt(len-i)){
                System.out.print(str+" is not Palindrome");
                return;
            }
        }
        System.out.print(str+" is Palindrome");


}
@Test
    public void revArr() {
        // we will use two 'pointers'. One pointer will start from the beginning
        // another one from the back and we will swap their values
        int[] arrNum = {1,2,3,4,5};
        // pointer that will start from the back
        int j = arrNum.length - 1;

        // our loop will go till half of our input array
        // 'i' is a pointer that will start from the beginning
        for(int i = 0; i < arrNum.length / 2; i++) {
            // swap elements using positions of i and (j - i)
            int tmp = arrNum[i];
            arrNum[i] = arrNum[j - i];
            arrNum[j - i] = tmp;
        }
    }
}

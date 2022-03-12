import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Arrays;


public class Practice_1 {
    private WebDriver driver = null;

    @Test
    public void reverseStr() {
        String str = "reverse";
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }

        System.out.print(reverse);
    }

    @Test
    public void launchBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("http://www.hiscox.com/");
        driver.manage().window().maximize();
        System.out.print(driver.findElement(By.xpath("//*[@id=\"nav__wrap\"]/div/nav[3]/li[1]/a[1]")).getText());
//        driver.findElement(By.cssSelector(""));
        driver.quit();
    }

    @Test
    public void stringPal() {
        String str = "aaaaa";
        int[] arr = {1, 2, 3, 4, 5};

        int len = str.length() - 1;
        for (int i = 0; i < (str.length()) / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i)) {
                System.out.print(str + " is not Palindrome");
                return;
            }
        }
        System.out.print(str + " is Palindrome");


    }

    @Test
    public void revArr() {
        // we will use two 'pointers'. One pointer will start from the beginning
        // another one from the back and we will swap their values
        int[] arrNum = {10, 2, 3, 4, 5};
//        Arrays.sort(arrNum);
//         int minNum = arrNum[0];
        // pointer that will start from the back
        int j = arrNum.length - 1;

        // our loop will go till half of our input array
        // 'i' is a pointer that will start from the beginning
        for (int i = 0; i < arrNum.length / 2; i++) {
            // swap elements using positions of i and (j - i)
            int tmp = arrNum[i];
            arrNum[i] = arrNum[j - i];
            arrNum[j - i] = tmp;
        }
        System.out.print(Arrays.toString(arrNum));
    }

    @Test
    public void revWords() {
        String str = "kiwi banana apple";
        StringBuilder str_rev = new StringBuilder();
        String[] arr = str.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            str_rev.append(arr[i]).append(" ");
        }
        System.out.print(str_rev);
    }
//    @Test
    public void strPalindrome(String str){
//        String str = "aaaaa";
                int j=str.length()-1;
//                StringBuilder strrev = new StringBuilder(str);
//                strrev.reverse();
//                if(str.contentEquals(strrev))
//                System.out.print(str + "is Palindrome");
        for(int i=0;i< str.length()/2;i++ )
        {
            if(str.charAt(i) != str.charAt(j-i)){
            System.out.print("Given string "+ str +" is not Palindrome");
            return;
            }
        }
        System.out.print("Given string " + str +" is Palindrome");
    }

    @Test
    public void  numRev() {
        int num = 12323;
        int orgNum = num;
        int revNum = 0;

        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num/=10;
        }
        System.out.print(String.format("%n")+ "Reversed number of the given number "+orgNum+" is "+revNum);
    }
    public  static  void  main(String[] args)
    {
         Practice_1 practice_1 = new Practice_1() ;
         practice_1.strPalindrome("saanvi");
         practice_1.numRev();

    }

}

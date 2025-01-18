package com.example.hoge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeleniumTest {

	@Test
	void グーグル開いてみる() {
		System.setProperty("webdriver.edge.driver", "./src/test/resources/msedgedriver.exe");
        EdgeDriver driver = new EdgeDriver();
        // ウィンドウを最大化
        driver.manage().window().maximize();
        try {
            driver.navigate().to("https://google.co.jp");
            Thread.sleep(1500);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }

		assertEquals("0", "0");
	}
}

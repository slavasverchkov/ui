package ru.yandex;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yandex.Pages.MainPage;
import ru.yandex.Pages.MapPage;
import ru.yandex.Pages.TvPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class FirstTest {
    private MainPage mainPage = new MainPage();
    private TvPage tvPage = new TvPage();
    private MapPage mapPage = new MapPage();
    private String url = "https://yandex.ru";

    @BeforeClass
    public void setUp() {
        Configuration.startMaximized = true;
    }

    @Test(groups = {"runs"})
    public void openYandex() {
        open(url);
        mainPage.searchString.shouldBe(exist);
    }

    @Test
    public void tvProgram(){
        open(url);
        mainPage.bntTv.click();
        sleep(5000);
        tvPage.tvProgram.shouldBe(exist);
    }

    @Test
    public void goToMap() {
        open(url);
        mainPage.map.click();
        sleep(5000);
        mapPage.mapRostov.shouldBe(exist);
    }

    @Test
    public void yesterdayTvProgram() {
        open(url);
        mainPage.bntTvNew.click();
        sleep(5000);
        switchTo().window(1);
        tvPage.textRostov.shouldBe(visible);
        tvPage.yesterday.click();
        Assert.assertTrue(tvPage.firstTimeTv.text().contains("05:00"));
    }

}

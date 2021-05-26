package ru.yandex;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import ru.yandex.Pages.MainPage;
import ru.yandex.Pages.TvPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.sleep;

public class FirstTest {
    private MainPage mainPage = new MainPage();
    private TvPage tvPage = new TvPage();
    private String url = "https://yandex.ru";

    @Test
    public void openYandex(){
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

}

package ru.yandex.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class TvPage {

    /**
     * Главная страница Телепрограмма
     */
    public SelenideElement tvProgram = $(byXpath("//*[@id=\"mount\"]/div/main"));
}

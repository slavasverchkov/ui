package ru.yandex.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    /**
     * Поисковая строка
     */
    public SelenideElement searchString = $(byXpath("//*[@id=\"text\"]"));

    /**
     * Кнопка 'Телепрограмма'
     */
    public SelenideElement bntTv = $(byXpath("//li[contains(.,'Программа')]"));

    /**
     * Главная страница Карта
     */
    public SelenideElement map = $(byXpath("//*[@data-id=\"maps\"]"));

    public void InputInPage(){


    }

}

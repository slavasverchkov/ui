package ru.yandex.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MapPage {

    /**
     * Карта
     */
    public SelenideElement mapRostov = $x("//*[contains(text(), 'Ростов-на-Дону')]");

}

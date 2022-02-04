package ru.yandex.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TvPage {

    /**
     * Главная страница Телепрограмма
     */
    public SelenideElement tvProgram = $(byXpath("//*[@id=\"mount\"]/div/main"));


    /**
     * Главная страница Телепрограмма (Общая)
     */
    public SelenideElement tvProgramFull = $x("//*[@id=\"mount\"]/div/main/div/div");

    /**
     * Надпись Ростов-на-Дону
     */
    public SelenideElement textRostov = $x("//*[contains(text(), 'Программа передач в Ростове-на-Дону')]");

    /**
     * Кнопка телепрограммы за вчера
     */
    public SelenideElement yesterday = $x("//a[contains(text(),'Вчера')]");

    /**
     * Первая строка время на канале
     */
    public SelenideElement firstTimeTv = $x("//div[@id='mount']/div/main/div/div/section/div/div/div[2]/ul/div/li/a/time");



}

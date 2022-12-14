package autotest;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.Arrays;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class WikipediaPage {
    private final SelenideElement wikiLogo = $(".mw-wiki-logo");
    private final SelenideElement articleTitle = $(".mw-page-title-main");
    private final SelenideElement imgGosling = $("img[src*='Gosling']");
    private final ElementsCollection javaVersions = $$(".wikitable tr");
    private final ElementsCollection listParadigms = $$(".infobox.vevent tr");

    public void isOpened(){
        wikiLogo.shouldBe(visible, exist);
    }

    public boolean isWikiLogoDisplayed(){
        return wikiLogo.isDisplayed();
    }

    public String getArticleTitle(){
        return articleTitle.shouldBe(visible).getText();
    }

    public boolean getImgGosling(){
        return imgGosling.isImage() && imgGosling.isDisplayed();
    }

    public String getJavaVersionYear(String titleJavaVersion){
        String javaYear = javaVersions.shouldHave(sizeGreaterThanOrEqual(22)).stream()
                .filter(item -> item.getText().contains(titleJavaVersion))
                .map(javaVersion -> javaVersion.$("td:nth-child(2)").getText())
                .findFirst()
                .orElseThrow();
        return javaYear;
    }

    public int getListParadigm(){
        int sizeParadigms = (int) listParadigms.shouldHave(sizeGreaterThanOrEqual(4)).stream()
                .filter(item -> item.getText().contains("Paradigm"))
                .map(listParadigm -> listParadigm.$("td").getText().split(" "))
                .flatMap(Arrays::stream)
                .count();

//        SelenideElement paradigm = listParadigms.stream()
//                .filter(item -> item.getText().contains("Paradigm"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalArgumentException("Paradigm was not found"));
//        paradigm.$$("td>a").stream()
//                .map(listParadigm -> listParadigm.getText())
//                .count();
        return sizeParadigms;
    }
}

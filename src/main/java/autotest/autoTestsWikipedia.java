package autotest;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import java.time.YearMonth;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.refresh;

public class autoTestsWikipedia {
    WikipediaPage wikipediaPage = new WikipediaPage();
    int year = YearMonth.now().getYear();

    @Test
    public void test() {
        open(("https://en.wikipedia.org/wiki/Java_(programming_language)"));

        refresh();
        wikipediaPage.isOpened();

//        Перевірити що заголовок містить слово Java
//        Assertions.assertTrue(wikipediaPage.getArticleTitle().contains("Java"));

        SoftAssertions.assertSoftly(sa -> {
            // Перевірити що сторінка відображається після перезагрузки сторінки
            sa.assertThat(wikipediaPage.isWikiLogoDisplayed())
                    .as("Wiki logo isn`t displayed")
                    .isTrue();

            // Перевірити що заголовок містить слово Java
            sa.assertThat(wikipediaPage.getArticleTitle())
                    .as("Article title does`t contains expected word")
                    .contains("Java");

            // Перевірити що є картинка Гослинга
            sa.assertThat(wikipediaPage.getImgGosling())
                    .as("Gosling image not visible")
                    .isTrue();

            // Рік java 11 не дорівнює поточному року
            sa.assertThat(wikipediaPage.getJavaVersionYear("Java SE 11"))
                    .as("Current year is not Java11")
                    .doesNotContain(String.valueOf(year));

            // Список Paradigm дорівнює 4 (8)
            sa.assertThat(wikipediaPage.getListParadigm())
                    .as("The number of paradigms does not match")
                    .isEqualTo(4);
        });
    }
}
package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideSearchTest {
    @Test
    void selenideBrowserSearchTest() {
        //open chrome browser
        open("https://bing.com");

        //input "Selenide" in searchfield & press enter
        $(byName("q")).setValue("Selenide").pressEnter();

        //verify that ru.selenide.org appears in results
        $("html").shouldHave(text("ru.selenide.org"));
    }
}

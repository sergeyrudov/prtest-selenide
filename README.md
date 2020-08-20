# prtest-selenide

тест который надо добавить в PR
```
public class YandexSearchTest {
    @Test
    public void searchSelenideInYandex() {
        open("https://yandex.ru");
        $("#text").val("selenide").pressEnter();
        $$(".serp-item").shouldHave(sizeGreaterThan(1));
        $("#search-result").shouldBe(visible).shouldHave(
                text("Selenide: лаконичные и стабильные UI тесты на Java"),
                text("selenide.org"));
    }
}
```

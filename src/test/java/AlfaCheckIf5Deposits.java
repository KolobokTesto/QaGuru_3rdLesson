import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class AlfaCheckIf5Deposits {

    @Test
    public void test() {
        open("https://alfabank.ru");
        $("[href=\"/make-money/\"]").click();
        $("[data-test-id='button']").click();
        $("[data-test-id='tabs-list-tabTitle-1']").click();
        $("div[class='']")
                .findAll("div[data-widget-name=\"CatalogCard\"]")
                .shouldHaveSize(5);
    }
}

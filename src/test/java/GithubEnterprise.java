import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GithubEnterprise {
    @Test
    void openGithubEnterprise() {
        open("https://github.com");
        $$("ul li.HeaderMenu-item").filterBy(text("Solutions")).first().hover();
        $("[href='/enterprise']").click();
        $("body").shouldHave(text("Build like the best"));
    }
}

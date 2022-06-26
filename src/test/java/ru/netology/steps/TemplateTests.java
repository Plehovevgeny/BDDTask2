package ru.netology.steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Пусть;
import ru.netology.data.UserData;
import ru.netology.page.DashboardPage;
import ru.netology.page.LoginPage;
import ru.netology.page.TransferPage;
import ru.netology.page.VerificationPage;

public class TemplateTests {
    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    private static VerificationPage verificationPage;
    private static TransferPage transferPage;

    @Пусть("Открыта страница с формой авторизации {string}")
    public void openAuthPage(String url){
        loginPage = Selenide.open(url, LoginPage.class);
    }

    @Когда("пользователь успешно авторизуется с логином {string} и паролем {string}")
    public void loginWithLoginAndPassword(String login, String password) {
        UserData user = new UserData();
        verificationPage = loginPage.login(user);
    }
}

package co.com.ensayobanistmo.certificacion.tasks;

import co.com.ensayobanistmo.certificacion.userinterfaces.CreditCardsPage;
import co.com.ensayobanistmo.certificacion.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static co.com.ensayobanistmo.certificacion.userinterfaces.CreditCardsPage.BTN_CREDIT_CARD_BLACK;
import static co.com.ensayobanistmo.certificacion.userinterfaces.HomePage.BTN_CREDIT_CARDS;
import static co.com.ensayobanistmo.certificacion.userinterfaces.HomePage.BTN_PRODUCTS_AND_SERVICES;

public class SearchCreditCards implements Task {
    @Step("{0} este es un ensayo para ver si sale en el reporte")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BTN_PRODUCTS_AND_SERVICES),
                Click.on(BTN_CREDIT_CARDS),
                Click.on(BTN_CREDIT_CARD_BLACK));
    }

    public static SearchCreditCards InBanistmo() {
        return Tasks.instrumented(SearchCreditCards.class);
    }
}

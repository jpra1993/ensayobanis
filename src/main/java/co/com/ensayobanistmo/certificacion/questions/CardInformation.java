package co.com.ensayobanistmo.certificacion.questions;

import co.com.ensayobanistmo.certificacion.userinterfaces.CreditCardBlack;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;

public class CardInformation implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(CreditCardBlack.BTN_CREDIT_CARD_BLACK).viewedBy(actor).asBoolean();
    }

    public static CardInformation onCreditCardBlackPage() {
        return new CardInformation();
    }
}

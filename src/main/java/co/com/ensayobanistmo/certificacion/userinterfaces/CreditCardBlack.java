package co.com.ensayobanistmo.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CreditCardBlack {

    public static final Target BTN_CREDIT_CARD_BLACK =
            Target.the("CREDIT CARD BLACK BUTTON")
                    .locatedBy("//div[@class='fondo']");
}

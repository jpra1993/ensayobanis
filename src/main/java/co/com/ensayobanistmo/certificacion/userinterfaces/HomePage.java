package co.com.ensayobanistmo.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BTN_PRODUCTS_AND_SERVICES =
            Target.the("PRODUCTS AND SERVICES BUTTON")
                    .locatedBy("//a[@class='dropdown-toggle']");

    public static final Target BTN_CREDIT_CARDS =
            Target.the("CREDIT CARDS BUTTON")
                    .locatedBy("//a[@href='/wps/portal/banistmo/personas/productos-y-servicios/tarjetas-credito/']");
}

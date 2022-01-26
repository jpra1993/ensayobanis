package co.com.ensayobanistmo.certificacion.stepdefinitions;

import co.com.ensayobanistmo.certificacion.questions.CardInformation;
import co.com.ensayobanistmo.certificacion.tasks.SearchCreditCards;
import co.com.ensayobanistmo.certificacion.utils.Constants;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class SearchCreditCardsStepDefinitions {

    @Given("^is in the home page$")
    public void isInTheHomePage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.banistmo.com/wps/portal/banistmo/personas"));
    }

    @When("^navigating the page to the credit card section$")
    public void navigatingThePageToTheCreditCardSection() {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchCreditCards.InBanistmo());
    }

    @Then("^he will see the types of credit cards you can choose$")
    public void heWillSeeTheTypesOfCreditCardsYouCanChoose() {
        OnStage.theActorInTheSpotlight().should(seeThat(CardInformation.onCreditCardBlackPage(),
                is(equalTo(true))));
    }
}

package starter.helpers;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable thePresenseeLandingPage() {
        return Task.where("{0} opens the Presensee Landing page",
                Open.browserOn().the(PresenseePage.class));

    }
}

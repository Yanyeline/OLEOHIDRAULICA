package com.aplicacionescsge.oleohidraulica.certification.tasks.profile;

import com.aplicacionescsge.oleohidraulica.certification.pages.MenuOption;
import com.aplicacionescsge.oleohidraulica.certification.pages.ProfilePage;
import com.aplicacionescsge.oleohidraulica.certification.pages.ShedulePage;
import com.aplicacionescsge.oleohidraulica.certification.tasks.common.Wait;
import com.aplicacionescsge.oleohidraulica.certification.utils.constants.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.actions.UploadToField;
import net.thucydides.core.annotations.Step;

import java.nio.file.Paths;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChangeProfilePhoto implements Task {


    @Step("{0} Change photo profile")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuOption.OPTIONS_USER_ICON),
                Click.on(MenuOption.PROFILE_ICON),
                Click.on(ProfilePage.BTN_CHANGE_PHOTO),
                //Click.on(ProfilePage.TXT_PHOTO_PROFILE),
                //Wait.Element(ProfilePage.TXT_PHOTO_PROFILE),
                Upload.theFile(Paths.get(Constants.PATH_PHOTO).toAbsolutePath()).to(ProfilePage.TXT_PHOTO_PROFILE),
                Click.on(ProfilePage.BTN_SAVE_PHOTO)
        );
    }


    public static ChangeProfilePhoto onTheField() {
        return instrumented(ChangeProfilePhoto.class);
    }
}

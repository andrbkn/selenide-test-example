package com.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import com.demoqa.pages.components.CalendarComponent;
import com.demoqa.TestBase;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage extends TestBase {
    private final String FORM_TITLE = "Student Registration Form";
    private SelenideElement
                    formTitle = $(".practice-form-wrapper"),
                    firstNameInput = $("#firstName"),
                    lastNameInput = $("#lastName"),
                    emailInput = $("#userEmail"),
                    genderButton = $("#genterWrapper"),
                    mobileInput = $("#userNumber"),
                    subjectsInput = $("#subjectsInput"),
                    subjectsList = $("#subjectsWrapper"),
                    hobbiesList = $("#hobbiesWrapper"),
                    pictureUpload = $("#uploadPicture"),
                    addressInput = $("#currentAddress"),
                    stateSelect = $("#state"),
                    citySelect = $("#city"),
                    submitButton = $("#submit"),
                    closeSubmitFormButton = $(".closeLargeModal");
    public CalendarComponent birthDateCalendar = new CalendarComponent();

    public void openPage(){
        open("/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }

    public void typeFirstName(String firstName) {
        firstNameInput.setValue(firstName);
    }

    public void typeLastName(String lastName) {
        lastNameInput.setValue(lastName);
    }

    public void typeEmail(String email) {
        emailInput.setValue(email);
    }

    public void setGender(String gender) {
        genderButton.$(byText(gender)).click();
    }

    public void typeMobile(String phone) {
        mobileInput.setValue(phone);
    }

    public void chooseSubject(String query, String subject) {
        subjectsInput.setValue(query);
        subjectsList.$(byText(subject)).scrollIntoView(true);
        subjectsList.$(byText(subject)).click();
    }

    public void chooseHobby(String hobby) {
        hobbiesList.$(byText(hobby)).click();
    }
    public void uploadPicture(String picture) {
        pictureUpload.uploadFromClasspath(picture);
    }

    public void typeAddress(String address) {
        addressInput.setValue(address);
    }

    public void chooseState(String state) {
        stateSelect.click();
        stateSelect.$(byText(state)).click();
    }

    public void chooseCity(String city) {
        citySelect.click();
        citySelect.$(byText(city)).click();
    }

    public void submitForm() {
        submitButton.click();
    }

    public void checkSubmitSuccession() {
        $(".modal-header").shouldHave(exactText("Thanks for submitting the form"));
        closeSubmitFormButton.isDisplayed();
    }

    public void checkSubmittedForm(String fieldName, String fieldValue) {
        $x("//td[text()='" + fieldName + "']").sibling(0).shouldHave(exactText(fieldValue));
    }
}

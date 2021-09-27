package com.demoqa;

import com.demoqa.utils.RandomUtils;
import org.junit.jupiter.api.Test;
import com.demoqa.pages.RegistrationPage;

public class RegistrationFormTest extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    void fullRegistration() {
        registrationPage.openPage();
        registrationPage.typeFirstName(TestData.firstName);
        registrationPage.typeLastName(TestData.lastName);
        registrationPage.typeEmail(TestData.email);
        registrationPage.setGender(TestData.gender);
        registrationPage.typeMobile(TestData.phone);
        registrationPage.birthDateCalendar.setDate(TestData.day, TestData.month, TestData.year);
        registrationPage.chooseSubject("ma", TestData.subject);
        registrationPage.chooseHobby(TestData.hobby);
        registrationPage.uploadPicture(TestData.picture);
        registrationPage.typeAddress(TestData.address);
        registrationPage.chooseState(TestData.state);
        registrationPage.chooseCity(TestData.city);
        registrationPage.submitForm();
        registrationPage.checkSubmitSuccession();
        registrationPage.checkSubmittedForm("Student Name" , TestData.firstName + " " + TestData.lastName);
        registrationPage.checkSubmittedForm("Student Email" , TestData.email);
        registrationPage.checkSubmittedForm("Gender" , TestData.gender);
        registrationPage.checkSubmittedForm("Mobile" , TestData.phone);
        registrationPage.checkSubmittedForm("Date of Birth" , RandomUtils.RandomBirthDate.getFullBirthDate(TestData.day, TestData.month, TestData.year));
        registrationPage.checkSubmittedForm("Subjects" , TestData.subject);
        registrationPage.checkSubmittedForm("Hobbies" , TestData.hobby);
        registrationPage.checkSubmittedForm("Picture" , TestData.picture);
        registrationPage.checkSubmittedForm("Address" , TestData.address);
        registrationPage.checkSubmittedForm("State and City" , TestData.state + " " + TestData.city);
    }
}

package com.demoqa;

import com.demoqa.utils.RandomUtils;
import com.github.javafaker.Faker;

import java.util.*;

public class TestData {
    static Faker faker = new Faker(new Locale("en-US"));

    public static String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            gender = RandomUtils.getRandomGender(),
            phone = RandomUtils.getRandomPhone(),
            day = RandomUtils.RandomBirthDate.getRandomDay(),
            month = RandomUtils.RandomBirthDate.getRandomMonth(),
            year = RandomUtils.RandomBirthDate.getRandomYear(),
            subject = "Maths",
            hobby = RandomUtils.getRandomHobby(),
            picture = "blackmonday.png",
            address = faker.address().fullAddress(),
            state = RandomUtils.getRandomState(),
            city = RandomUtils.getRandomCity(state);
}

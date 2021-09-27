package com.demoqa.utils;

import org.apache.commons.lang3.StringUtils;

import java.time.Month;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    public static String getRandomPhone() {
        Long random_phone = ThreadLocalRandom.current().nextLong(1111111111L, 9999999999L);
        return random_phone.toString();
    }

    public static String getRandomGender() {
        List<String> genders = Arrays.asList("Male", "Female", "Other");
        Integer randomIndex = ThreadLocalRandom.current().nextInt(0, genders.size());;
        return genders.get(randomIndex);
    }

    public static class RandomBirthDate {
        public static String getRandomYear() {
            Integer current_year = Calendar.getInstance().get(Calendar.YEAR);
            Integer min = 1900;
            Integer randomYear = ThreadLocalRandom.current().nextInt(min, current_year + 1);;
            return randomYear.toString();
        }

        public static String getRandomMonth() {
            Integer randomMonth = ThreadLocalRandom.current().nextInt(1, 12 + 1);
            return StringUtils.capitalize(StringUtils.lowerCase(String.valueOf(Month.of(randomMonth))));
        }

        public static String getRandomDay() {
            Integer randomDay = ThreadLocalRandom.current().nextInt(1, 28 + 1);
            return randomDay.toString();
        }

        public static String getFullBirthDate(String day, String month, String year) {
            if(Integer.parseInt(day) < 10) day = "0" + day;
            return day + " " + month + "," + year;
        }
    }

    public static String getRandomHobby() {
        List<String> hobbies = Arrays.asList("Sports", "Reading", "Music");
        Integer randomIndex = ThreadLocalRandom.current().nextInt(0, hobbies.size());
        return hobbies.get(randomIndex);
    }

    public static String getRandomState() {
        List<String> states = Arrays.asList("NCR", "Uttar Pradesh", "Haryana", "Rajasthan");
        Integer randomIndex = ThreadLocalRandom.current().nextInt(0, states.size());
        return states.get(randomIndex);
    }

    public static String getRandomCity(String state) {
        String city;
        List<String> cities;
        Integer randomIndex;
        switch (state) {
            case "NCR":
                cities = Arrays.asList("Delhi", "Gurgaon", "Noida");
                randomIndex = ThreadLocalRandom.current().nextInt(0, cities.size());
                city = cities.get(randomIndex);
                break;
            case "Uttar Pradesh":
                cities = Arrays.asList("Agra", "Lucknow", "Merrut");
                randomIndex = ThreadLocalRandom.current().nextInt(0, cities.size());
                city = cities.get(randomIndex);
                break;
            case "Haryana":
                cities = Arrays.asList("Karnal", "Panipat");
                randomIndex = ThreadLocalRandom.current().nextInt(0, cities.size());
                city = cities.get(randomIndex);
                break;
            case "Rajasthan":
                cities = Arrays.asList("Jaipur", "Jaiselmer");
                randomIndex = ThreadLocalRandom.current().nextInt(0, cities.size());
                city = cities.get(randomIndex);
                break;
            default:
                throw new IllegalArgumentException("Invalid state name: " + state);
        }
        return city;
    }
}

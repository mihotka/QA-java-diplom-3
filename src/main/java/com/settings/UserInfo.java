package com.settings;

import com.github.javafaker.Faker;

public class UserInfo {

    Faker faker = new Faker();

  public String login = faker.name().fullName();
  public String password = "1234Bb";
  public String email = faker.name().firstName() + "@gmail.com";
}

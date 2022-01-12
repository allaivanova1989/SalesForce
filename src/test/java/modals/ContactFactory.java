package modals;

import com.github.javafaker.Faker;

public class ContactFactory {
    static Faker faker = new Faker();

    public static Contact get() {
        return Contact.builder()
                .salutation("Ms.")
                .firstName(faker.gameOfThrones().character())
                .lastName(faker.gameOfThrones().dragon())
                .suffix(faker.gameOfThrones().city())
                .accountName(faker.address().firstName())
                .title(faker.pokemon().name())
                .email("baby2008@mail.ru")
                .phone(faker.phoneNumber().phoneNumber())
                .mobile(faker.phoneNumber().phoneNumber())
                .reportsTo("")
                .department(faker.gameOfThrones().city())
                .fax(faker.phoneNumber().subscriberNumber())
                .mailingStreet(faker.rickAndMorty().location())
                .mailingCity(faker.gameOfThrones().city())
                .mailingStateProvince(faker.address().streetName())
                .mailingZipPostalCode(faker.address().zipCode())
                .mailingCountry(faker.rickAndMorty().location())
                .build();

    }
}

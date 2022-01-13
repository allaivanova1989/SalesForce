package modals;

import com.github.javafaker.Faker;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class AccountFactory {
    static Faker faker = new Faker();

    public static Account get() {
        log.debug("Fill in the fields to create an account");
        return Account.builder()
                .accountName(faker.gameOfThrones().dragon())
                .billingCity(faker.address().cityName())
                .billingCountry(faker.rickAndMorty().location())
                .billingStateProvince(faker.gameOfThrones().city())
                .billingStreet(faker.address().streetName())
                .billingZipPostalCode(faker.address().zipCode())
                .description(faker.rickAndMorty().character())
                .parentAccount(faker.backToTheFuture().character())
                .employees(faker.number().digit())
                .industry("Banking")
                .phone(faker.phoneNumber().phoneNumber())
                .shippingCity(faker.gameOfThrones().city())
                .shippingCountry(faker.rickAndMorty().location())
                .shippingStateProvince(faker.gameOfThrones().city())
                .shippingStreet(faker.address().streetName())
                .shippingZipPostalCode(faker.address().zipCode())
                .type("Investor")
                .webSite(faker.gameOfThrones().house())
                .build();

    }
}

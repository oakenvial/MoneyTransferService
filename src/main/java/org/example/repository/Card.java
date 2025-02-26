package org.example.repository;

import java.util.Objects;

public class Card {
    private final String number;
    private final String cvc;
    private final String validTill;

    public Card(String number, String cvc, String validTill) {
        this.number = number;
        this.cvc = cvc;
        this.validTill = validTill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(number, card.number) && Objects.equals(cvc, card.cvc) && Objects.equals(validTill, card.validTill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, cvc, validTill);
    }

    public String getCvc() {
        return cvc;
    }

    public String getValidTill() {
        return validTill;
    }

    public String getNumber() {
        return number;
    }
}

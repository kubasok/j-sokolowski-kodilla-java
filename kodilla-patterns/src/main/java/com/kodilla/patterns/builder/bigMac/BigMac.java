package com.kodilla.patterns.builder.bigMac;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class BigMac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    private BigMac(final String roll, final int burgers, final String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String ingredientsString() {
        return ingredients.stream().collect(Collectors.joining(", "));
    }
    @Override
    public String toString() {
        return "BigMac with: " + roll + " roll, "
                + burgers + " burgers, " +
                ingredientsString() + " and " + sauce + ".";
    }

    public static class BigMacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder roll(String roll) {
            this.roll = roll;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredient(String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(roll, burgers, sauce, ingredients);
        }
    }
}

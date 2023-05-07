package com.easyimmo.mailsender.domain.mail.model;

public class PlaceHolder {
    private final String placeholderName;
    private final String value;

    private PlaceHolder(Builder builder) {
        placeholderName = builder.placeholderName;
        value = builder.value;
    }

    public String getPlaceholderName() {
        return placeholderName;
    }

    public String getValue() {
        return value;
    }


    public static final class Builder {
        private String placeholderName;
        private String value;

        public Builder() {
        }

        public Builder withPlaceholderName(String val) {
            placeholderName = val;
            return this;
        }

        public Builder withValue(String val) {
            value = val;
            return this;
        }

        public PlaceHolder build() {
            return new PlaceHolder(this);
        }
    }
}

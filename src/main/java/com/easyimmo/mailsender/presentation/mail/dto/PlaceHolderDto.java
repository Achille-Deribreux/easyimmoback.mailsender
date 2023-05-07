package com.easyimmo.mailsender.presentation.mail.dto;

public class PlaceHolderDto {

    private String placeholderName;
    private String value;

    public PlaceHolderDto() {
    }

    private PlaceHolderDto(Builder builder) {
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

        public PlaceHolderDto build() {
            return new PlaceHolderDto(this);
        }
    }
}

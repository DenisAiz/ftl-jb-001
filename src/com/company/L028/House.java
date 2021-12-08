package com.company.L028;

public class House {
    private Boolean hasGarage;
    private Boolean hasSwimmingPool;
    private Boolean hasFancyStatues;
    private Boolean hasGarden;

    public static class Builder{
        private Boolean hasGarage = false;
        private Boolean hasSwimmingPool = false;
        private Boolean hasFancyStatues = false;
        private Boolean hasGarden = false;

        public Builder() {
        }

        public Builder otpHasGarage(Boolean val){
            this.hasGarage = val;
            return this;
        }

        public Builder otpHasSwimmingPool(Boolean val){
            this.hasSwimmingPool = val;
            return this;
        }

        public Builder otpHasFancyStatues(Boolean val){
            this.hasFancyStatues = val;
            return this;
        }

        public Builder otpHasGarden(Boolean val){
            this.hasGarage = val;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }

    public House(Builder builder){
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasFancyStatues = builder.hasFancyStatues;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasFancyStatues=" + hasFancyStatues +
                ", hasGarden=" + hasGarden +
                '}';
    }
}

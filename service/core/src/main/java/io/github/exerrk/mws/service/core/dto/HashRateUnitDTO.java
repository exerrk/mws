package io.github.exerrk.mws.service.core.dto;

/**
 * @author Evan Sidman
 * created in 08.2017
 */
public class HashRateUnitDTO {
    private String hashUnit;
    private String timeUnit;

    public HashRateUnitDTO() {
    }

    public HashRateUnitDTO(String hashUnit, String timeUnit) {
        this.hashUnit = hashUnit;
        this.timeUnit = timeUnit;
    }

    public String getHashUnit() {
        return hashUnit;
    }

    public void setHashUnit(String hashUnit) {
        this.hashUnit = hashUnit;
    }

    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    @Override
    public String toString() {
        return "HashRateUnitDTO{" +
                "hashUnit='" + hashUnit + '\'' +
                ", timeUnit='" + timeUnit + '\'' +
                '}';
    }
}

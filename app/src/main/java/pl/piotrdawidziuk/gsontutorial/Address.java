package pl.piotrdawidziuk.gsontutorial;

import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("city")
    private String mCity;
    @SerializedName("country")
    private String mCountry;

    public Address(String city, String country) {
        this.mCity = city;
        this.mCountry = country;
    }

    public String getmCity() {
        return mCity;
    }

    public void setmCity(String mCity) {
        this.mCity = mCity;
    }

    public String getmCountry() {
        return mCountry;
    }

    public void setmCountry(String mCountry) {
        this.mCountry = mCountry;
    }
}

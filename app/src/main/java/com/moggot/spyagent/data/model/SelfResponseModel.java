package com.moggot.spyagent.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SelfResponseModel {

    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("sex")
    @Expose
    private int sex;
    @SerializedName("bdate")
    @Expose
    private String bdate;
    @SerializedName("photo_url")
    @Expose
    private String photoUrl;
    @SerializedName("subscriptions")
    @Expose
    private int subscriptions;
    @SerializedName("friends")
    @Expose
    private int friends;
    @SerializedName("code")
    @Expose
    private int code;

    public int getSubscriptions() {
        return subscriptions;
    }

    public int getCode() {
        return code;
    }

    public String getBdate() {
        return bdate;
    }

    public int getSex() {
        return sex;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return
                "TopOfLikes{" +
                        "subscriptions = '" + subscriptions + '\'' +
                        ",code = '" + code + '\'' +
                        ",bdate = '" + bdate + '\'' +
                        ",sex = '" + sex + '\'' +
                        ",last_name = '" + lastName + '\'' +
                        ",photo_url = '" + photoUrl + '\'' +
                        ",first_name = '" + firstName + '\'' +
                        ",friends = '" + friends + '\'' +
                        "}";
    }
}

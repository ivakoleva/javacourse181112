package com.musala.javacourse181112.tasks.libraryexercise_v0_1.model;

import com.musala.javacourse181112.tasks.validationFramework.StringLength;

import java.util.Set;

public class Person extends BaseEntity {

    @StringLength(minimumSize = 1, maximumSize = 255)
    private String name;

    private String egn;
    private Set<Role> roleSet;
    private Set<ItemRent> itemRentSet;
    private Set<SubscriptionRenewal> subscriptionRenewalSet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public Set<Role> getRoleSet() {
        return roleSet;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roleSet = roleSet;
    }

    public Set<ItemRent> getItemRentSet() {
        return itemRentSet;
    }

    public void setItemRentSet(Set<ItemRent> itemRentSet) {
        this.itemRentSet = itemRentSet;
    }

    public Set<SubscriptionRenewal> getSubscriptionRenewalSet() {
        return subscriptionRenewalSet;
    }

    public void setSubscriptionRenewalSet(Set<SubscriptionRenewal> subscriptionRenewalSet) {
        this.subscriptionRenewalSet = subscriptionRenewalSet;
    }
}
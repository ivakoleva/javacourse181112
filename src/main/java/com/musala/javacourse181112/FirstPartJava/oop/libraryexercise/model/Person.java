package com.musala.javacourse181112.FirstPartJava.oop.libraryexercise.model;

import java.util.Set;

public class Person extends BaseEntity {
    private String name;
    private String egn;
    private Set<Role> roleSet;
    private Set<ItemRent> itemRentSet;
    private Set<SubscriptionRenewal> subscriptionRenewalSet;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

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

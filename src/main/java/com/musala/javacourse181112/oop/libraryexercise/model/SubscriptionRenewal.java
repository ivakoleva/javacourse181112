package com.musala.javacourse181112.oop.libraryexercise.model;

import java.time.LocalDateTime;

/**
 * Created by Iva Koleva on 14.01.2019
 */
public class SubscriptionRenewal extends BaseEntity {
    private LocalDateTime dateTimeOfPayment;

    public LocalDateTime getDateTimeOfPayment() {
        return dateTimeOfPayment;
    }

    public void setDateTimeOfPayment(LocalDateTime dateTimeOfPayment) {
        this.dateTimeOfPayment = dateTimeOfPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SubscriptionRenewal that = (SubscriptionRenewal) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        return dateTimeOfPayment != null ? dateTimeOfPayment.equals(that.dateTimeOfPayment) : that.dateTimeOfPayment == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (dateTimeOfPayment != null ? dateTimeOfPayment.hashCode() : 0);
        return result;
    }
}

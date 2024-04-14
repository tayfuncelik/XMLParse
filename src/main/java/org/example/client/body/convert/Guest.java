package org.example.client.body.convert;

import java.util.Objects;

public class Guest {
    private int childCount;
    private int adultCount;

    public Guest() {
    }

    public Guest(int childCount, int adultCount) {
        this.childCount = childCount;
        this.adultCount = adultCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Guest c = (Guest) obj;
        return c.getAdultCount()==((Guest) obj).getAdultCount()
                && c.getChildCount()==((Guest) obj).getChildCount();

    }

    @Override
    public int hashCode() {
        return Objects.hash(adultCount,childCount);
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public int getAdultCount() {
        return adultCount;
    }

    public void setAdultCount(int adultCount) {
        this.adultCount = adultCount;
    }
}

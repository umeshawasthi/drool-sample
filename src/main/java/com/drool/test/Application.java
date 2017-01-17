package com.drool.test;

import java.util.Date;

/**
 * Created by umesh on 10/20/16.
 */
public class Application {

    public Date getDateApplied() {
        return dateApplied;
    }

    public void setDateApplied(Date dateApplied) {
        this.dateApplied = dateApplied;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    private Date dateApplied;
    private boolean valid;
}

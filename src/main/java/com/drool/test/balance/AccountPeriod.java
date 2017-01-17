package com.drool.test.balance;

import java.util.Date;

/**
 * Created by umesh on 11/1/16.
 */
public class AccountPeriod {

    private Date start;

    public AccountPeriod(Date start, Date endDate) {
        this.start = start;
        this.endDate = endDate;
    }

    public Date getStart() {

        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    private Date endDate;
}

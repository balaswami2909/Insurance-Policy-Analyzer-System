package com.policyanalyzer.model;

import java.sql.Date;

public class Policy {
    private int id;
    private String holderName;
    private String policyType;
    private Date startDate;
    private Date endDate;
    private double premium;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public String getPolicyType() { return policyType; }
    public void setPolicyType(String policyType) { this.policyType = policyType; }

    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }

    public double getPremium() { return premium; }
    public void setPremium(double premium) { this.premium = premium; }
}
package com.policyanalyzer.service;

import java.sql.Date;
import java.util.*;
import com.policyanalyzer.model.Policy;

public class PolicyService {

    public List<Policy> getExpiredPolicies(List<Policy> allPolicies) {
        List<Policy> expired = new ArrayList<>();
        Date today = new Date(System.currentTimeMillis());

        for (Policy p : allPolicies) {
            if (p.getEndDate().before(today)) {
                expired.add(p);
            }
        }
        return expired;
    }
}
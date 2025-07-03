package com.policyanalyzer.dao;

import java.sql.*;
import java.util.*;
import com.policyanalyzer.model.Policy;

public class PolicyDAO {
    private Connection conn;

    public PolicyDAO(Connection conn) {
        this.conn = conn;
    }

    public void addPolicy(Policy policy) throws SQLException {
        String sql = "INSERT INTO policies (holder_name, policy_type, start_date, end_date, premium) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, policy.getHolderName());
        stmt.setString(2, policy.getPolicyType());
        stmt.setDate(3, policy.getStartDate());
        stmt.setDate(4, policy.getEndDate());
        stmt.setDouble(5, policy.getPremium());
        stmt.executeUpdate();
    }

    public List<Policy> getAllPolicies() throws SQLException {
        List<Policy> list = new ArrayList<>();
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM policies");
        while (rs.next()) {
            Policy p = new Policy();
            p.setId(rs.getInt("id"));
            p.setHolderName(rs.getString("holder_name"));
            p.setPolicyType(rs.getString("policy_type"));
            p.setStartDate(rs.getDate("start_date"));
            p.setEndDate(rs.getDate("end_date"));
            p.setPremium(rs.getDouble("premium"));
            list.add(p);
        }
        return list;
    }
}
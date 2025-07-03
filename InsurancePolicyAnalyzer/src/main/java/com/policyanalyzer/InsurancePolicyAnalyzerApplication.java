package com.policyanalyzer;

import com.policyanalyzer.dao.PolicyDAO;
import com.policyanalyzer.model.Policy;
import com.policyanalyzer.service.PolicyService;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class InsurancePolicyAnalyzerApplication {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/insurance_db", "root", "");

        PolicyDAO dao = new PolicyDAO(conn);
        PolicyService service = new PolicyService();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter admin username: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (!user.equals("admin") || !pass.equals("admin123")) {
            System.out.println("Invalid credentials. Exiting...");
            return;
        }

        System.out.println("1. Show Expired Policies");
        System.out.println("2. Show All Policies");
        int choice = sc.nextInt();

        List<Policy> allPolicies = dao.getAllPolicies();

        if (choice == 1) {
            List<Policy> expired = service.getExpiredPolicies(allPolicies);
            System.out.println("Expired Policies:");
            for (Policy p : expired) {
                System.out.println(p.getHolderName() + " - " + p.getPolicyType());
            }
        } else {
            for (Policy p : allPolicies) {
                System.out.println(p.getHolderName() + " - " + p.getPolicyType());
            }
        }

        conn.close();
    }
}
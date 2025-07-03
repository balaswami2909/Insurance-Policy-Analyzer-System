# 🛡️ Insurance Policy Analyzer System

A Java + JDBC based mini project to manage, track, and analyze insurance policies. Designed to be **run in console**, **built with Maven**, and compatible with **Spring Boot** structure and **GitHub import**.

---

## 🔧 Technologies Used
- Java 8+
- JDBC (MySQL)
- Maven
- Spring Boot (core only, not web)
- MySQL (Backend DB)
- Eclipse IDE (Recommended)
- Git & GitHub

---

## 🎯 Features
- Admin login (username: `admin`, password: `admin123`)
- Add and view insurance policies
- Analyze expired policies
- JDBC-based DAO pattern
- Console-based UI
- Maven + GitHub compatible project structure

---

## 🗂 Project Structure
InsurancePolicyAnalyzer/
├── src/
│ └── main/
│ ├── java/
│ │ └── com/policyanalyzer/
│ │ ├── controller/ (Optional UI)
│ │ ├── dao/
│ │ ├── model/
│ │ ├── service/
│ │ └── InsurancePolicyAnalyzerApplication.java
│ └── resources/
│ ├── application.properties
│ └── schema.sql
├── pom.xml
└── README.md

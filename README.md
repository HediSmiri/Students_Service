# Simple Student-Service

This repository contains the implementation of simple Student Service system. The classes are designed and modeled based on the UML class diagram shown below.

## Class Diagram

The system consists of two primary entities: `Student` and `Address`. Their relationship is modeled as "one-to-one," where each student resides at a single address.

![image](https://github.com/user-attachments/assets/fef53b38-5ea8-4860-8c4d-d5d92776014b)

## Entities Overview

### 1. Student
- **Attributes**:
  - `id`: Unique identifier for the student.
  - `firstName`: The first name of the student.
  - `lastName`: The last name of the student.
  - `email`: The email address of the student.
  - `address`: One-to-one relationship with the `Address` entity.

### 2. Address
- **Attributes**:
  - `id`: Unique identifier for the address.
  - `city`: The city where the student resides.
  - `street`: The street name of the residence.

### Relationship
- **Type**: One-to-One
- **Description**: Each `Student` has a unique `Address`.

## Package Structure

The implementation is part of the package `tn.micro.service.cloud.entities`.

### File Structure
```plaintext
tn.micro.service.cloud/
└── entities/
    ├── Student.java
    ├── Address.java
    └── README.md
```
# Swagger Implementation :

![image](https://github.com/user-attachments/assets/d66cd900-9abc-4b87-a04e-58996750377f)


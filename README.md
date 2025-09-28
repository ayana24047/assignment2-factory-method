# assignment2-factory-method
# Assignment 2 — Factory Method Pattern (Java)

## 📌 Project Description
This project demonstrates the **Factory Method design pattern** in Java.  
We implemented a simple **Car Factory** application where different factories (`BMWFactory`, `ToyotaFactory`) are responsible for creating different types of cars.  

This helps to separate the **object creation logic** from the **business logic** and follows the principles of **Clean Code**.

---

## 🛠️ Classes Overview
- **Car (interface)** → defines operations for all cars.  
- **BMW / Toyota (Concrete Products)** → specific car implementations.  
- **CarFactory (abstract class)** → declares the `createCar()` factory method.  
- **BMWFactory / ToyotaFactory (Concrete Factories)** → implement the factory method to create their respective car types.  
- **Main** → demonstrates usage of factories.  

---

## 📊 UML Diagram

<img width="1032" height="470" alt="2025-09-28_14-21-59" src="https://github.com/user-attachments/assets/d247b926-572e-445a-96b6-0e1a4b20c3dd" />


# pizzashop-manegment# 
 LovePizza Backend

A simple Java console-based Pizza Billing Application.

##  Features
- Choose between Veg, Non-Veg, Deluxe Veg, and Deluxe Non-Veg pizzas
- Add optional extra toppings, extra cheese, and takeaway service
- Final bill calculation with breakdown
- Modular structure using Models & Services

## 🛠 Tech Stack
- Java 17+
- Maven/Gradle (build tool)
- JUnit 5 (for testing)

##  Run Locally
```bash
# Clone repo
git clone https://github.com/VaishnaviDandale/lovepizza-backend.git
cd lovepizza-backend

# Compile & Run
mvn clean install
mvn exec:java -Dexec.mainClass="lovepizza.PizzaApp"

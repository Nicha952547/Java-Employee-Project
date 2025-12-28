# Employee Management System (Java OOP Project)

โปรเจ็คนี้เป็นส่วนหนึ่งของวิชา Java OOP เพื่อสาธิตการใช้งานแนวคิดพื้นฐานของ Object-Oriented Programming
โปรเจ็คนี้ประกอบด้วย 4 ไฟล์หลักที่ทำงานร่วมกัน:

1. **Employee.java (Abstract Class):** - เป็นคลาสแม่ที่กำหนดโครงสร้างพื้นฐาน
   - มีการใช้ abstract double calculateSalary() เพื่อบังคับให้คลาสลูกต้องไปเขียนวิธีการคำนวณเงินเดือนของตัวเอง

2. **FullTimeEmployee.java (Inheritance):** - สืบทอดคุณสมบัติมาจากคลาส Employee
   - คำนวณเงินเดือนโดยใช้ baseSalary และ bonus

3. **PartTimeEmployee.java (Inheritance):** - สืบทอดคุณสมบัติมาจากคลาส Employee
   - คำนวณเงินเดือนตามชั่วโมงทำงาน: hourlyRate * hoursWorked

4. **TestEmployee.java (Main Class):** - ทำหน้าที่รับค่าจากผู้ใช้ (User Input) ผ่าน Scanner
   - ใช้หลักการ Polymorphism ในการสร้าง Object ของพนักงานแต่ละประเภทตามเงื่อนไข

## วิธีการใช้งาน
1. รันไฟล์ TestEmployee.java
2. เลือกประเภทพนักงาน (FullTime หรือ PartTime)
3. กรอกข้อมูลตามที่โปรแกรมขอเพื่อดูผลลัพธ์การคำนวณเงินเดือน

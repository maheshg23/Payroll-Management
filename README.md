# Payroll-Management
A Java Application to Add, Display, Modify, Delete payroll records using Netbean software

### MySQL Commands <br >

Create a new Database in MySQL  
`Create database payroll`<br>

Use the created database  
`Use payroll`<br>

Create a table Payroll to sgtore all the employee information  
`Create table payroll1 (Empno int(5) primary key,Name varchar(20),DOB date,DOJ date,Designation varchar(20),Salary decimal(10,2),Leaves_in_month int(2) check(Leaves_in_month <30),Ratings int(2) check(Ratings <10));`<br>

Create another table for the todoLists  
`Create table todolist (Event varchar(20) not null, Date date not null, Time varchar(10));`<br>

##### Login for the Application <br>
Username - Mahesh <br>
Password - army <br>

Statup page is index.java


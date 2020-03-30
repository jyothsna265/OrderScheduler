  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.6.RELEASE)
 
/**
 *	Spring boot scheduler application which runs every 5 mins to update the orders
 *	where Order date is less than system date()-90 days and status is 2 or 3.
 *	
 *	@author - Jyothsna Goalla Dilli Naidu
 *
 */
 
*****************************************************************************************
Technologies used:
------------------
Spring Boot - v2.2.6
Java 8/ JDK 1.8
IntelliJ IDEA editor
MySql database - localhost
Based on Maven project
Dependencies: MySql driver, Spring data JPA, Spring Web using Spring Initializer.

****************************************************************************************************************

****************************************************************************************************************
SQL Details:
------------
MySql Database.
Database Name: db_example
Table: order_details
Columns: id, order_no, order_total, order_date, order_status, is_order_complete

mysql> describe order_details;
+-------------------+--------------+------+-----+---------+-------+
| Field             | Type         | Null | Key | Default | Extra |
+-------------------+--------------+------+-----+---------+-------+
| id                | int(11)      | NO   | PRI | NULL    |       |
| is_order_complete | varchar(255) | YES  |     | NULL    |       |
| order_date        | date         | YES  |     | NULL    |       |
| order_no          | varchar(255) | YES  |     | NULL    |       |
| order_total       | int(11)      | YES  |     | NULL    |       |
| status            | int(11)      | YES  |     | NULL    |       |
+-------------------+--------------+------+-----+---------+-------+

Sample records:
---------------

mysql> select *from order_details;
+----+-------------------+------------+----------+-------------+--------+
| id | is_order_complete | order_date | order_no | order_total | status |
+----+-------------------+------------+----------+-------------+--------+
| 13 | Y                 | 2019-11-30 | 12323    |      234234 |      2 |
| 14 | Y                 | 2019-11-30 | 123343   |      234234 |      2 |
| 15 | Y                 | 2019-12-20 | 1223343  |      234234 |      3 |
+----+-------------------+------------+----------+-------------+--------+

Insert records:
---------------
insert into orderDetails values(20, 'N', '2020-03-24', "124344", 10000.00, 1);

****************************************************************************************************************

****************************************************************************************************************

URL or Curl details to update or add orders.
--------------------------------------------

http://localhost:8080/orderDetails/addOrders?order_no=1223343&order_date=2019-12-20&order_total=234234&status=3

****************************************************************************************************************

****************************************************************************************************************

Steps or Process to run the application:
----------------------------------------

1. Unzip the provided files to any folder.
2. Import as Maven Project by pointing to the unzipped folder.
3. Start the SQL server.
4. Create the SQL database as "db_example".
5. Create a SQL table as order_details.
6. Insert records using the example provided.
7. Add the SQL details in application.properties under resources.
8. Run the application.
9. The service will start and scheduler will run for every 5 mins and update the order details.
10. Optionally we can add the orders using the provided url in the browser or using Postman interface.

****************************************************************************************************************








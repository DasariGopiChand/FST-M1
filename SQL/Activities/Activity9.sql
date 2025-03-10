select * from salesman;
select * from Customers;
select * from orders;

select a.customer_name, b.salesman_name 
from customers a 
inner join salesman b on a.salesman_id=b.salesman_id;

SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city FROM customers a  
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300  
ORDER BY a.customer_id;

select a.customer_name, b.salesman_name, b.commission from customers a
inner join salesman b on a.salesman_id=b.salesman_id where b.commission>12;

SELECT a.order_no, a.order_date, a.purchase_amount, b.customer_name, b.grade, c.salesman_name, c.commission FROM orders a 
INNER JOIN customers b ON a.customer_id=b.customer_id 
INNER JOIN salesman c ON a.salesman_id=c.salesman_id;


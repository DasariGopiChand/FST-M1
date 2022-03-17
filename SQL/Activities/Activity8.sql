select * from orders;

select customer_id, max(purchase_amount) from orders group by customer_id ;

select salesman_id, order_date, max(purchase_amount) FROM orders WHERE order_date=To_DATE('2012/08/17', 'YYYY/MM/DD') GROUP BY salesman_id, order_date;

/* Write an SQL statement to find the highest purchase amount with their ID and order date, for only those customers who have a higher purchase amount within the list [2030, 3450, 5760, 6000]. */

select customer_id, order_date, max(purchase_amount) from orders group by customer_id, order_date HAVING MAX(purchase_amount) IN(2030, 3450, 5760, 6000);

SELECT TOP 1 customer_number FROM orders GROUP BY customer_number ORDER BY count(customer_number) desc;
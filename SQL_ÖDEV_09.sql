-- 1)city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
-- 2)customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.
-- 3)customer tablosu ile rental tablosunda bulunan rental_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz INNER JOIN sorgusunu yazınız.

-- 1)
SELECT c.city, co.country FROM country AS co
INNER JOIN city AS c ON c.country_id= co.country_id;

-- 2)
SELECT p.payment_id, c.first_name, c.last_name FROM customer AS c
INNER JOIN payment AS p ON c.customer_id = p.customer_id;

-- 3)
SELECT r.rental_id, c.first_name, c.last_name FROM customer AS c
INNER JOIN rental AS r ON r.customer_id = c.customer_id
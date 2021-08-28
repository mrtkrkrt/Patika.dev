-- 1)city tablosu ile country tablosunda bulunan şehir (city) ve ülke (country) isimlerini birlikte görebileceğimiz LEFT JOIN sorgusunu yazınız.
-- 2)customer tablosu ile payment tablosunda bulunan payment_id ile customer tablosundaki first_name ve last_name isimlerini birlikte görebileceğimiz RIGHT JOIN sorgusunu yazınız.

-- 1)
SELECT city, country FROM city
LEFT JOIN country ON country.country_id = city.country_id;

-- 2)
SELECT c.first_name, c.last_name FROM payment AS p
RIGHT JOIN customer AS c ON p.customer_id = c.customer_id;

-- 3)
SELECT r.rental_id ,c.first_name, c.last_name FROM rental AS r
FULL JOIN customer AS c ON c.customer_id= r.customer_id;

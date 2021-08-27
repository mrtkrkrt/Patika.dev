-- 1)test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
-- 2)Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
-- 3)Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
-- 4)Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.

-- 1)
CREATE TABLE employee (
	id SERIAL PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE,
	email VARCHAR(100)
)

-- 2)
insert into employee (name, email, birthday) values ('Alden Verner', 'averner0@dyndns.org', null);
insert into employee (name, email, birthday) values ('Ransell Bartolomeoni', 'rbartolomeoni1@howstuffworks.com', '2015-07-23');
insert into employee (name, email, birthday) values ('Ardenia Cossans', 'acossans2@theatlantic.com', '1939-08-02');
insert into employee (name, email, birthday) values ('Julian Slader', 'jslader3@usnews.com', '1990-12-23');
insert into employee (name, email, birthday) values ('Kathe Seacombe', 'kseacombe4@nymag.com', '1950-07-31');
insert into employee (name, email, birthday) values ('Harvey Camelin', 'hcamelin5@adobe.com', null);
insert into employee (name, email, birthday) values ('Uriel Surgenor', 'usurgenor6@taobao.com', null);
insert into employee (name, email, birthday) values ('Obediah Kislingbury', null, '1963-04-27');
insert into employee (name, email, birthday) values ('Jed Simcock', 'jsimcock8@ebay.com', null);
insert into employee (name, email, birthday) values ('Ryun Downage', null, '1962-08-03');
insert into employee (name, email, birthday) values ('Jeni Stothart', null, null);
insert into employee (name, email, birthday) values ('Esme Ogilvy', 'eogilvyb@mapy.cz', '1914-05-21');
insert into employee (name, email, birthday) values ('Zandra Fittes', 'zfittesc@go.com', '1975-12-14');
insert into employee (name, email, birthday) values ('Jayme Pasque', 'jpasqued@jiathis.com', '1903-07-08');
insert into employee (name, email, birthday) values ('Daisey MacAne', 'dmacanee@about.com', null);
insert into employee (name, email, birthday) values ('Alisa Porcas', 'aporcasf@csmonitor.com', '1941-12-02');
insert into employee (name, email, birthday) values ('Gav Leverage', 'gleverageg@paginegialle.it', null);
insert into employee (name, email, birthday) values ('Irvin Creasey', 'icreaseyh@biglobe.ne.jp', '1928-03-27');
insert into employee (name, email, birthday) values ('Marsha De Miranda', 'mdei@livejournal.com', '1911-04-25');
insert into employee (name, email, birthday) values ('Sandy Overshott', 'sovershottj@weibo.com', null);
insert into employee (name, email, birthday) values ('Marve Healy', 'mhealyk@statcounter.com', '1909-08-05');
insert into employee (name, email, birthday) values ('Damian Merrigan', 'dmerriganl@amazon.de', null);
insert into employee (name, email, birthday) values ('Roxy Feldhuhn', 'rfeldhuhnm@toplist.cz', '2003-02-07');
insert into employee (name, email, birthday) values ('Yancey Heskey', 'yheskeyn@prlog.org', '1987-01-19');
insert into employee (name, email, birthday) values ('Joshia Turner', 'jturnero@xing.com', null);
insert into employee (name, email, birthday) values ('Noreen Botterill', 'nbotterillp@earthlink.net', '1956-05-26');
insert into employee (name, email, birthday) values ('Zack Atling', 'zatlingq@bloglovin.com', '1992-12-26');
insert into employee (name, email, birthday) values ('Madelena Pearl', null, '2016-09-15');
insert into employee (name, email, birthday) values ('Henri Elfes', 'helfess@paginegialle.it', null);
insert into employee (name, email, birthday) values ('Michaelina Kasman', 'mkasmant@gov.uk', null);
insert into employee (name, email, birthday) values ('Amalia Grossman', 'agrossmanu@loc.gov', '1912-10-31');
insert into employee (name, email, birthday) values ('Cesaro Amsberger', 'camsbergerv@salon.com', '1980-01-23');
insert into employee (name, email, birthday) values ('Flss Roaf', null, '1920-02-26');
insert into employee (name, email, birthday) values ('Aurore Falco', 'afalcox@nps.gov', '1927-04-02');
insert into employee (name, email, birthday) values ('Evered Greenhowe', 'egreenhowey@ed.gov', '2013-05-07');
insert into employee (name, email, birthday) values ('Aeriela Brettell', 'abrettellz@businessweek.com', '1937-04-22');
insert into employee (name, email, birthday) values ('Abrahan Blowes', 'ablowes10@typepad.com', null);
insert into employee (name, email, birthday) values ('Dionis Synan', 'dsynan11@loc.gov', null);
insert into employee (name, email, birthday) values ('Chick Gunson', 'cgunson12@plala.or.jp', '2002-04-18');
insert into employee (name, email, birthday) values ('Roselin Batty', 'rbatty13@bbc.co.uk', '1977-10-17');
insert into employee (name, email, birthday) values ('Ella Gowanson', 'egowanson14@angelfire.com', '1928-08-05');
insert into employee (name, email, birthday) values ('Amble Grist', 'agrist15@biglobe.ne.jp', '1916-06-25');
insert into employee (name, email, birthday) values ('Audrie Keelan', 'akeelan16@hc360.com', '1917-10-25');
insert into employee (name, email, birthday) values ('Mable Jorry', 'mjorry17@pinterest.com', '1947-12-25');
insert into employee (name, email, birthday) values ('Hayyim Hollows', 'hhollows18@wiley.com', null);
insert into employee (name, email, birthday) values ('Addia Simione', null, '1937-04-15');
insert into employee (name, email, birthday) values ('Chad McNiff', 'cmcniff1a@toplist.cz', null);
insert into employee (name, email, birthday) values ('Shandie Cogley', 'scogley1b@cloudflare.com', '1912-01-15');
insert into employee (name, email, birthday) values ('Bancroft Saffer', 'bsaffer1c@wired.com', '1990-06-20');
insert into employee (name, email, birthday) values ('Irma Newis', 'inewis1d@t.co', '1967-03-26');

-- 3)
update employee set name = 'A' where name like 'A%';
update employee set name = 'B' where name like 'B%';
update employee set name = 'D' where name like 'D%';
update employee set name = 'E' where name like 'E%';
update employee set name = 'F' where name like 'F%';

-- 4)
delete from employee where birthday = NULL;
delete from employee where email = NULL;
delete from employee where name = 'A';
delete from employee where name = 'B';
delete from employee where name = 'D';
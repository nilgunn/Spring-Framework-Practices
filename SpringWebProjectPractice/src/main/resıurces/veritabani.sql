CREATE SCHEMA firmaveritabani;

CREATE TABLE firmaveritabani.personel(
id int(11) NOT NULL AUTO_INCREMENT COMMENT '',
adi VARCHAR(45) NULL COMMENT '',
soyadi VARCHAR(45) NULL COMMENT '',
cinsiyeti VARCHAR(10) NULL COMMENT '',
eposta VARCHAR(100) NULL COMMENT '',
numarasi INT NULL COMMENT '',
parolasi VARCHAR(100) NULL COMMENT '',
PRIMARY KEY (id)
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8;

INSERT INTO firmaveritabani.personel
(adi, soyadi, cinsiyeti, eposta, numarasi, parolasi)
VALUES
('Ali', 'Yýlmaz', '2', 'aliyilmaz@gmail.com', '3452', '3S4B35');

INSERT INTO firmaveritabani.personel
(adi, soyadi, cinsiyeti, eposta, numarasi, parolasi)
VALUES
('Aslý', 'Þahin', '1', 'aslisahin@gmail.com', '7942', '5D6F23');

INSERT INTO firmaveritabani.personel
(adi, soyadi, cinsiyeti, eposta, numarasi, parolasi)
VALUES
('Ömer', 'Özdemir', '2', 'ömerözdemir@gmail.com', '4726', '214GH6');
INSERT INTO firmaveritabani.personel
(adi, soyadi, cinsiyeti, eposta, numarasi, parolasi)
VALUES
('Sena', 'Þimþek', '1', 'senasimsek@gmail.com', '7385', '35H61E');
INSERT INTO firmaveritabani.personel
(adi, soyadi, cinsiyeti, eposta, numarasi, parolasi)
VALUES
('Ahmet', 'Çelik', '1', 'ahmetcelik@gmail.com', '3794', 'F43H67');
SELECT * FROM firmaveritabani.personel;
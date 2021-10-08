use gestionvoiture;

INSERT INTO category (`id`, `description`, `value`) VALUES ('1', 'Berline', 'Berline');
INSERT INTO category (`id`, `description`, `value`) VALUES ('2', 'Citadine', 'Citadine');

INSERT INTO brand (`id`, `value`, `categoryId`) VALUES ('1', 'Peugeot', '1');
INSERT INTO brand (`id`, `value`, `categoryId`) VALUES ('2', 'Renault', '1');
INSERT INTO brand (`id`, `value`, `categoryId`) VALUES ('3', 'Citroen', '1');

INSERT INTO model (`id`, `value`, `brandId`) VALUES ('1', '203', '1');
INSERT INTO model (`id`, `value`, `brandId`) VALUES ('2', '405', '1');
INSERT INTO model (`id`, `value`, `brandId`) VALUES ('3', '306', '1');

INSERT INTO model (`id`, `value`, `brandId`) VALUES ('4', 'Fluence', '2');
INSERT INTO model (`id`, `value`, `brandId`) VALUES ('5', 'Laguna', '2');
INSERT INTO model (`id`, `value`, `brandId`) VALUES ('6', 'R21', '2');

INSERT INTO model (`id`, `value`, `brandId`) VALUES ('7', 'AC4', '3');
INSERT INTO model (`id`, `value`, `brandId`) VALUES ('8', 'Traction', '3');
INSERT INTO model (`id`, `value`, `brandId`) VALUES ('9', 'DS', '3');


-- mdp rakoto
INSERT INTO role (`id`, `name`) VALUES ('1', 'admin');
INSERT INTO role (`id`, `name`) VALUES ('2', 'user');

INSERT INTO user (`id`, `address`, `contact`, `firstName`, `lastName`, `email`, `password`, `roleId`) VALUES ('1', 'IB 2 Ankadimbahoaka', '+261342015642', 'Rakotoson', 'Abel', 'rakoto@gmail.com', '$2a$12$DdbvNVV6Gn9D5Fo94Rl/2.thH6wSPF499NmaUPUIb31PMqjiDaZm6', '1');


INSERT INTO car (`id`, `immatriculation`, `pictures`, `price`, `modelId`, `userId`) VALUES ('1', '1030 TD', 'https://lesvoitures.fr/wp-content/uploads/2019/05/Peugeot-203.jpg', '15000', '1', '1');
INSERT INTO car (`id`, `immatriculation`, `pictures`, `price`, `modelId`, `userId`) VALUES ('2', '9085 TK', 'https://www.auto-data.net/images/f55/Peugeot-405-I-15B-facelift-1992.jpg', '400', '2', '1');
INSERT INTO car (`id`, `immatriculation`, `pictures`, `price`, `modelId`, `userId`) VALUES ('3', '2273 TAB', 'https://images.caradisiac.com/logos-ref/modele/modele--peugeot-306/S0-modele--peugeot-306.jpg', '300', '3', '1');

INSERT INTO comment (`id`, `comment`, `date`, `time`, `carId`, `userId`) VALUES ('1', 'Prix', '2021-10-22', '07:00:00', '1', '1');
INSERT INTO comment (`id`, `comment`, `date`, `time`, `carId`, `userId`) VALUES ('2', 'Est-ce que c`est à vendre', '2021-10-12', '07:00:00', '1', '1');
INSERT INTO comment (`id`, `comment`, `date`, `time`, `carId`, `userId`) VALUES ('2', 'Possible echange', '2021-10-12', '07:00:00', '1', '1');

INSERT INTO comment (`id`, `comment`, `date`, `time`, `carId`, `userId`) VALUES ('1', 'Moteur essence ou diesel', '2021-09-13', '05:30:00', '2', '1');
INSERT INTO comment (`id`, `comment`, `date`, `time`, `carId`, `userId`) VALUES ('2', 'Adresse', '2021-09-15', '07:00:00', '2', '1');
INSERT INTO comment (`id`, `comment`, `date`, `time`, `carId`, `userId`) VALUES ('3', 'Consommation?', '2021-11-12', '05:30:00', '2', '1');
--
-- Data
--
INSERT into pet (id, name, age, male) VALUES (1, 'Vanille', 13, 0);
INSERT into pet (id, name, age, male) VALUES (2, 'Teddy', 11, 1);
INSERT into pet (id, name, age, male) VALUES (3, 'Jobar', 4, 0);
INSERT into pet (id, name, age, male) VALUES (4, 'Neige', 1, 0);
INSERT into pet (id, name, age, male) VALUES (5, 'Uline', 10, 0);
INSERT into pet (id, name, age, male) VALUES (6, 'Isis', 9, 0);
INSERT into pet (id, name, age, male) VALUES (7, 'Donught', 2, 0);
INSERT into pet (id, name, age, male) VALUES (8, 'Cachou', 8, 1);
INSERT into pet (id, name, age, male) VALUES (9, 'Tchicky', 5, 1);

INSERT into pet_friends VALUES (2, 3);
INSERT into pet_friends VALUES (2, 4);
INSERT into pet_friends VALUES (3, 2);
INSERT into pet_friends VALUES (3, 4);
INSERT into pet_friends VALUES (4, 2);
INSERT into pet_friends VALUES (4, 3);
INSERT into pet_friends VALUES (5, 4);
INSERT into pet_friends VALUES (5, 8);
INSERT into pet_friends VALUES (6, 9);
INSERT into pet_friends VALUES (7, 5);
INSERT into pet_friends VALUES (8, 5);
INSERT into pet_friends VALUES (9, 1);
insert into user ( user_id, user_name, password, email_id, first_name, last_name, address, phone_no) values 
( 1, 'user1', 'password@123', 'user1@abc.com', 'user1','user1','bangalore','1234567890'),
( 2, 'user2', 'password@123', 'user2@abc.com', 'user2','user2','bangalore','1234567890'),
( 3, 'user3', 'password@123', 'user3@abc.com', 'user3','user3','bangalore','1234567890'),
( 4, 'user4', 'password@123', 'user4@abc.com', 'user4','user4','bangalore','1234567890');

insert into category (category_id, category_name, description) values 
(1, 'Indian', 'The dishes from India.'),
(2, 'Italian', 'The dishes from Italy.'),
(3, 'Chinese', 'The dishes from China'),
(4, 'Mexican', 'The dishes from Mexico');

insert into food ( food_id, food_name, price, image_url, category, description, offers) values 
( 1, 'noodles', 100, '', 3,'The noodles',''),
( 2, 'dumplings', 100, '', 3,'The dumplings',''),
( 3, 'pasta', 100, '', 2,'The pastas',''),
( 4, 'pizza', 100, '', 2,'The pizzas',''),
( 5, 'biryani', 100, '', 1,'The biryani',''),
( 6, 'rotis', 100, '', 1,'The rotis',''),
( 7, 'tacos', 100, '', 4,'The tacos',''),
( 8, 'burritos', 100, '',4,'The burritos','');
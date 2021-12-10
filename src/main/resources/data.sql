delete from Taco_Order_Tacos;
delete from Taco_Ingridients;
delete from Taco;
delete from Taco_Order;
delete from Ingridient;
insert into Ingridient (id, name, type)
                values ('FLTO', 'Flour Tortilla', 'WRAP');
insert into Ingridient (id, name, type)
                values ('COTO', 'Corn Tortilla', 'WRAP');
insert into Ingridient (id, name, type)
                values ('GRBF', 'Ground Beef', 'PROTEIN');
insert into Ingridient (id, name, type)
                values ('CARN', 'Carnitas', 'PROTEIN');
insert into Ingridient (id, name, type)
                values ('CHCK', 'Chicken', 'PROTEIN');
insert into Ingridient (id, name, type)
                values ('TMTO', 'Diced Tomatoes', 'VEGGIES');
insert into Ingridient (id, name, type)
                values ('LETC', 'Lettuce', 'VEGGIES');
insert into Ingridient (id, name, type)
                values ('CHED', 'Cheddar', 'CHEESE');
insert into Ingridient (id, name, type)
                values ('JACK', 'Monterrey Jack', 'CHEESE');
insert into Ingridient (id, name, type)
                values ('SLSA', 'Salsa', 'SAUCE');
insert into Ingridient (id, name, type)
                values ('SRCR', 'Sour Cream', 'SAUCE');
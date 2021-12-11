delete from Taco_Order_Tacos;
delete from Taco_Ingridients;
delete from Taco;
delete from Taco_Order;
delete from Ingridient;
insert into Ingridient (id, name, type)
                values ('FLTO', 'Flour Tortilla', 0);
insert into Ingridient (id, name, type)
                values ('COTO', 'Corn Tortilla', 0);
insert into Ingridient (id, name, type)
                values ('GRBF', 'Ground Beef', 1);
insert into Ingridient (id, name, type)
                values ('CARN', 'Carnitas', 1);
insert into Ingridient (id, name, type)
                values ('CHCK', 'Chicken', 1);
insert into Ingridient (id, name, type)
                values ('TMTO', 'Diced Tomatoes', 2);
insert into Ingridient (id, name, type)
                values ('LETC', 'Lettuce', 2);
insert into Ingridient (id, name, type)
                values ('CHED', 'Cheddar', 3);
insert into Ingridient (id, name, type)
                values ('JACK', 'Monterrey Jack', 3);
insert into Ingridient (id, name, type)
                values ('SLSA', 'Salsa', 4);
insert into Ingridient (id, name, type)
                values ('SRCR', 'Sour Cream', 4);
insert into clients(name) values ("Edward Reid");
insert into clients(name) values ("Jo Krueger");
insert into clients(name) values ("Elaine Sharp");
insert into clients(name) values ("Susanne Ware");
insert into clients(name) values ("Clare Powell");
insert into clients(name) values ("Bradley Fisher");
insert into clients(name) values ("Marcellus Guerrero");
insert into clients(name) values ("Lewis Warner");
insert into clients(name) values ("Audrey Bailey");
insert into clients(name) values ("Sergio Pollard");

insert into planets(id, name) values("EAR","Earth");
insert into planets(id, name) values("NEP","Neptune");
insert into planets(id, name) values("JUP","Jupiter");
insert into planets(id, name) values("SAT","Saturn");
insert into planets(id, name) values("VEN","Venus");

insert into tickets(created_at, client_id, from_planet_id, to_planet_id) values ("2056-10-01",1,"EAR","NEP");
insert into tickets(created_at, client_id, from_planet_id, to_planet_id) values ("2057-01-02",2,"NEP","JUP");
insert into tickets(created_at, client_id, from_planet_id, to_planet_id) values ("2056-12-23",3,"JUP","SAT");
insert into tickets(created_at, client_id, from_planet_id, to_planet_id) values ("2057-03-11",4,"SAT","VEN");
insert into tickets(created_at, client_id, from_planet_id, to_planet_id) values ("2056-11-22",5,"VEN","EAR");
insert into tickets(created_at, client_id, from_planet_id, to_planet_id) values ("2056-09-15",6,"NET","VEN");
insert into tickets(created_at, client_id, from_planet_id, to_planet_id) values ("2056-02-30",7,"JUP","NEP");
insert into tickets(created_at, client_id, from_planet_id, to_planet_id) values ("2057-02-15",8,"SAT","EAR");
insert into tickets(created_at, client_id, from_planet_id, to_planet_id) values ("2057-04-01",9,"VEN","SAT");
insert into tickets(created_at, client_id, from_planet_id, to_planet_id) values ("2057-05-05",10,"EAR","JUP");
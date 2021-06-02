create database sbd_facturas;
drop database sbd_facturas;
use sbd_facturas;

create table sucursal(
idSucursal		int primary key identity(1,1) not null,
nomSucursal		varchar(255),
ubiSucursal		varchar(255)
);

create table pago(
idPago		int primary key identity(1,1) not null,
tipoPago	varchar(255)
);

create table ticket(
folio		int primary key identity(1,1) not null,
webId		int unique not null,
ltsGasolina	float,
pagoTotal	float,
fecha		datetime,
hora		time,
constraint fk_pago foreign key (id) references pago(idPago),
constraint fk_sucursal foreign key (id) references sucursal(idSucursal)
);


create table cliente(
idCliente int identity(1,1) NOT NULL,
appCliente varchar(255) NOT NULL,
apmCliente varchar(255) NOT NULL,
calleCliente varchar(255),
colCliente varchar(255) not null,
codPCliente int not null,
curpCliente int,
rfcCliente int,
primary key(idCliente)
);


# SucursalCRUD
sistema de direcciones

#base de datos H2 http://localhost:7070/h2-console/login.jsp?jsessionid=d373253f1222e4650b99e5f5ce0d32be

creadenciales de acceso user name = sa password = sa

Creacion de la sucursal http://localhost:7070/api/sucursal/agregarSucursal

api rest tipo post para la persistencia de la base de datos h2 en memoria

{ "direccion":"Ibague", "latitud":"oeste", "longitud":"norte" }

buscar sucursal por id http://localhost:7070/api/sucursal/buscarSucursal/1

Documentacion swagger http://localhost:7070/swagger-ui.html#/sucursal-controller

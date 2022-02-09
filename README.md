# Api-Rest
Backend Java

Se creo la imagen en docker, aun no hago el repositorio correspondiente

Agregar User 
Metodo POST, Mediante JSON 
{
  	"password": "pabss123",
        "status": "Active",
        "username": "Iampablop2",
        "idProfile": 2,
        "idEmployee": 3,
        "updateDate": "2008-02-22",
        "createDate": "2008-02-22",
        "login": "No se a que se refiera con login"
}
Editar User 
Metodo POST, Mediante JSON 
Hacer referencia al id que se desea editar
{
	"idUser": "1",
  	"password": "pabss123",
        "status": "Active",
        "username": "Iampablop2",
        "idProfile": 2,
        "idEmployee": 3,
        "updateDate": "2008-02-22",
        "createDate": "2008-02-22",
        "login": "No se a que se refiera con login"
}
Visualizar Users 
---------    /user

Visualizar User por id 
---------    /user/id

Eliminar User
Metodo DELETE 
----------- /user/id



Visualizar Profile
---------    /profile

Visualizar User por id 
---------    /profile/id

Agregar Profile 
Metodo POST, Mediante JSON 
 	{
        "profile": "nombre"
    	}

Editar Profile 
Metodo POST, Mediante JSON 
"Se debe agregar la etiqueta idProfile"
{
    "profile": "staff",
    "idProfile": 3
}

Eliminar Profile 
Metodo DELETE 
----------- /profile/id

docker logs -f api-rest

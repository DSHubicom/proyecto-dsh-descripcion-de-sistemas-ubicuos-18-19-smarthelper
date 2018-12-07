Se encuentran dos carpetas en este directorio:

1.DUMNEX_PROJECT -> Proyecto creado con el IDE IntelliJ en java y que es perfectamente exportable a cualquier otro equipo que posea el 
mismo IDE. Este proyecto es un servidor web donde se encuentran todos los microservicios (peticiones GET y POST) definidos y agrupados en 
forma de APIS, concretamente en 4 principales. La definición de los microservicios corre a parte de Swagger y permite a su vez generar el
esqueleto del servidor mediante jaxrs-jersey. Dicho servidor ha sido importado a IntelliJ, donde se ha implementado toda la lógica que 
necesitaba para poder ofrecer peticiones y respuestas a los diferentes componentes con los que se conecta.

2. MYSQL_Database_Dump -> En esta carpeta se encuentra un archivo con formato ".sql", que simplemente contiene las tablas e información 
de la base de datos con la que trabaja el servidor y donde se almacenan todos los datos necesarios para su correcto funcionamiento. Por lo
tanto, exportando este archivo se puede tener una copia de la base de datos utilizada para este proyecto. Por último, cabe mencionar que 
en esta primera versión del servidor se ha ejecutado y realizado su conexión con la base de datos relacional MYSQL, de forma local.

# syllabus-webservice
## Installation
### Maven

### Database 
You have to create a "Secret" class in the main, along the "Database" class : 
```
package com.SoftwareQuality.Projet_syllabus;

public class Secret {
    public String host = "yourHost";
    public String user = "yourUsername";
    public String  password = "yourPassword";

}
```
This is needed to connect to our MySQL database.
You can import [this file](https://github.com/smarbal/syllabus-webservice/blob/main/MySQL.sql) in MySQL Workbench to have our database structure. 
## Functionnalities
This web service allows a user to see documents related to a specific course. The user can order the documents that he wants and it is possible to export all the orders that have been made. There's also the possiblity to add new documents to a course. 

## Useful links:
* https://lucid.app/lucidchart/b340a24a-37cf-4438-8019-bbbfcdea4bd4/edit?invitationId=inv_2f86983e-661c-4173-9de0-0e0f5a16852e&page=0_0#
* https://trello.com/b/9YV8Py7a/projet-archi-quality
* https://teams.microsoft.com/l/team/19%3aX_AucsPKZOsWvLGkeYJAFcYlgdmhqqGO2Km4G0X6W5U1%40thread.tacv2/conversations?groupId=3cccb804-cdc0-4938-95c6-488bca987dcc&tenantId=e3d6f09e-9ba9-4a36-ad75-d9039be4fe29

package apiEndpoints;
/*
POST
https://petstore.swagger.io/user/createWithArray

GET
https://petstore.swagger.io/user/{username}
Get user by user name
PUT
https://petstore.swagger.io/user/{username}
Updated user
DELETE
https://petstore.swagger.io/user/{username}
Delete user
GET
https://petstore.swagger.io/user/login
Logs user into the system

GET
https://petstore.swagger.io/user/logout
Logs out current logged in user session

POST
https://petstore.swagger.io/user
Create user
 */


public class Routes {
    public static String base_url = "https://petstore.swagger.io/v2";

    // user mode

    public static String post_url = base_url + "/user";
    public static String get_url = base_url + "/user/{username}";
    public static String put_url = base_url + "/user/{username}";
    public static String delete_url = base_url + "/user/{username}";

    //Store module

    //Here you will create store module URL's
    // Pet Module


}

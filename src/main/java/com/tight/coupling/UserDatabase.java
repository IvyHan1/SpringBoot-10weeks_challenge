package com.tight.coupling;
//A - MySQL, PostgreSQL
//B - Web Services, MongoDB
public class UserDatabase {
    public String getUserDetails(){
        //Directly access databases here
        return "User Details From Database";
    }
}

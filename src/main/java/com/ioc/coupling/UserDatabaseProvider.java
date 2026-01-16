package com.ioc.coupling;

//A - MySQL, PostgreSQL
//B - Web Services, MongoDB
public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails(){
        //Directly access databases here
        return "User Details From Database";
    }
}

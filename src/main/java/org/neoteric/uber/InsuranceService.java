package org.neoteric.uber;

public class InsuranceService {


    public Insuranse getInsurance(User user){

        Insuranse insuranse=null;

        if(user.userAge>10 && user.userAge<60)
        {

         insuranse = new Insuranse();

        }

        return insuranse;
    }

}

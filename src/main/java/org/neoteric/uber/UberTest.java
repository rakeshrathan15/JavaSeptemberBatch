package org.neoteric.uber;


import org.neoteric.uber.appenum.VehicleTypeEnum;

import java.util.Date;

public class UberTest {

    public static void main(String[] args) {
        User user= new User();
        Location location= new Location();
        Task task= new Task();

        Insuranse insuranse= new Insuranse();
        Driver driver= new Driver();
        Vehicle vehicle= new Vehicle();
        JobTaskMapping jobTaskMapping= new JobTaskMapping();

        user.userId="1234";
        user.userName="rakesh";
        user.Email="rakesh@gmail.com";
        user.phoneNumber="7013776567";


        Location fromLocation= new Location();
        fromLocation.lat="18.999";
        fromLocation.lng="200.67.78";

        Location toLocation =new Location();
        toLocation.lng="999.91.2.0";



        task.fromLocation=location;
        task.toLocation=location;
        task.userId=user.userId;
        task.status="Active";

        insuranse.insuranseNumber="222222";
        insuranse.insuranceType= "vehicle Insurance";

        Insuranse driverInsurance= new Insuranse();
        driverInsurance.insuranceType="Driver Insurance";
        driverInsurance.insuranseNumber="33333";

        driver.driverId="55555";
        driver.driverName="raju";
        driver.driverPhoneNumber="9999999999";
        driver.vehicle=vehicle;
        driver.insuranse=driverInsurance;

        vehicle.vehicleType= VehicleTypeEnum.Bike;
        vehicle.driver=driver;
        vehicle.insuranse=insuranse;

        jobTaskMapping.startTime= new Date();
        jobTaskMapping.endTime= new Date(new Date().getTime()+60000);

        System.out.println(jobTaskMapping.vehicle.driver.insuranse.insuranseNumber);











    }
}

package com.kurdestan_parking.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class VehicleApplication implements ApplicationRunner {

   @Autowired

        VehicleRepasitory  repository;

       @Autowired
        IVehickeService service;


        public static void main(String[] args) {
            SpringApplication.run(VehicleApplication.class,args);

        }


    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("finish.........................................");


        List<Vehicle> all=service.getAll();
        System.out.println();

    }
}

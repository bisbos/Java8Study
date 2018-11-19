package com.java8.methodreferences.ObjOfParticularTypeMethodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Shipment {

    public void getShipments(){
        List<Shipment> shipments = new ArrayList<>();

    /*    calculateOnShipments(shipments, new Function<Shipment, Double>() {
            @Override
            public Double apply(Shipment shipment) {
                return shipment.calculateWeight();
            }
        }); */


     //       calculateOnShipments(shipments,(shipment -> shipment.calculateWeight()));

        calculateOnShipments(shipments,Shipment::calculateWeight);

    }

    public double calculateWeight(){
        double weight = 20;
        return weight;
    }

    public List<Double> calculateOnShipments(List<Shipment> list, Function<Shipment,Double> function){
        List<Double> results = new ArrayList<>();
        for (Shipment shipment:list){
            function.apply(shipment);
        }
        return results;
    }

}

package com.java8.methodreferences.InstanceMethodExistingObjectMethodReference;

import java.util.function.Consumer;

public class Mechanic {

    public void fix(Car c) {
        System.out.println("Fixing car " + c.getId());
    }

    public void execute(Car car, Consumer<Car> c) {
        c.accept(car);
    }

   public void doMechanicJob(){
        Mechanic mechanic = new Mechanic();
        Car car = new Car();

    /*    execute(car, new Consumer<Car>() {
            @Override
            public void accept(Car car) {
                mechanic.fix(car);
            }
        }); */


   // execute(car,c->mechanic.fix(c));

       execute(car,mechanic::fix);
   }
}

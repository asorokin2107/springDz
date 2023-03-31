package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car {

    private Motor motor;

    private Wheel wheel;

    private Body body;

    private Trans trans;
}

package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetFoodTestException {
    @Test
    public void shouldCheckGetFoodException() {
        Animal animal = new Animal();
        try {
            animal.getFood("НеХищник");
        } catch (Exception exception) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
        }
    }
}

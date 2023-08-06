package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CatTest {
    @Test
    public void getSoundCatMayTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodCatCorrectGoodTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}

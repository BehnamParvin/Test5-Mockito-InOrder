package com.test5.benni.inorderTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CarDrivingTest {

    @InjectMocks
    CarDriving carDriving;

    @Mock
    Car car;

    @Before
    public void setUp(){
        carDriving = new CarDriving(car);
    }

    @Test
    public void testCarDriving() {

        when(car.StartDriving(anyInt())).thenReturn(20);
        when(car.speedUp(anyInt())).thenReturn(50);

        int actualDriving = carDriving.driving(20, 50);
        InOrder inOrder = inOrder(car);

        inOrder.verify(car).StartDriving(anyInt());
        inOrder.verify(car).speedUp(anyInt());
        assertEquals(70, actualDriving);
        inOrder.verifyNoMoreInteractions();
    }

    @Test
    public void testFailCarDriving() {

        when(car.StartDriving(anyInt())).thenReturn(20);
        when(car.speedUp(anyInt())).thenReturn(50);

        int actualDriving = carDriving.driving(20, 50);
        InOrder inOrder = inOrder(car);

        inOrder.verifyNoMoreInteractions();
        inOrder.verify(car).StartDriving(anyInt());
        inOrder.verify(car).speedUp(anyInt());
        assertEquals(70, actualDriving);

    }
}

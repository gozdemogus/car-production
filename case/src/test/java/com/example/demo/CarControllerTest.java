package com.example.demo;

import com.example.demo.Controller.CarController;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarControllerTest {

    @Test
    public void testProduceCar() {

        MockHttpServletRequest request = new MockHttpServletRequest();
        request.addParameter("type", "cabrio");

        CarController controller = new CarController();

        String result = controller.produceCar("cabrio");

        assertEquals("Cabrio car has been produced.", result);
    }

    @Test
    public void testProduceCarInvalid() {

        MockHttpServletRequest request = new MockHttpServletRequest();
        request.addParameter("type", "invalid");

        CarController controller = new CarController();

        String result = controller.produceCar(String.valueOf(request));

        assertEquals("Invalid car type", result);
    }


}

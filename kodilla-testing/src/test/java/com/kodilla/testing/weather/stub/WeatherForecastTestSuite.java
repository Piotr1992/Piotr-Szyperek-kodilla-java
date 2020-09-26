
package com.kodilla.testing.weather.stub;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("beforeAll");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("afterAll");
    }

    @BeforeEach
    public void before(){
        System.out.println("before");
    }

    @AfterEach
    public void after(){
        System.out.println("after");
    }

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }



    //          testCalculateAverageTemperature

    @Test
    void testCalculateAverageTemperature() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        double sumTemperatures = 0.00;
        for(Map.Entry<String, Double> temperature : temperaturesMap.entrySet()) {
            sumTemperatures += temperature.getValue();
        }

        //Then
        double averageTemperature = sumTemperatures / quantityOfSensors;
        Assertions.assertEquals(25.56, averageTemperature);
    }



    //          testCalculateMedianTemperature

    @Test
    void testCalculateMedianTemperature() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        int index = 0;
        double[] tabTemperatures = new double[quantityOfSensors];

        for(Map.Entry<String, Double> temperature : temperaturesMap.entrySet()) {
            tabTemperatures[index] = temperature.getValue();
            index += 1;
        }

        //Then
        int half = quantityOfSensors / 2;
        double median = 0;
        if ( quantityOfSensors % 2 == 0 ) {
            median = ( ( tabTemperatures[half-1] + tabTemperatures[half] ) / 2 );
        } else {
            median = ( tabTemperatures[half] / 2 );
        }
        Assertions.assertEquals(13.05, median);
    }



}
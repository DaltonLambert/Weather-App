package com.dalton.WeatherApp.model;
import java.util.Date;

public class Weather {
        private int id;
        private String location;
        private double temperature;
        private int humidity;

        public Weather() {}

        public Weather(String location, double temperature, int humidity) {
            this.location = location;
            this.temperature = temperature;
            this.humidity = humidity;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

        public int getHumidity() {
        return humidity;
            }

        public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

        @Override
        public String toString() {
            return "Weather{" +
                    "id=" + id +
                    ", location='" + location + '\'' +
                    ", temperature=" + temperature +
                    ", humidity=" + humidity +
                    '}';
        }
    }


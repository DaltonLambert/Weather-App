package com.dalton.WeatherApp.model;
import java.util.Date;

public class Weather {
        private int id;
        private String location;
        private double temperature;
        private int humidity;

    private String description;

        public Weather() {}

        public Weather(String location, double temperature, int humidity, String description) {
            this.location = location;
            this.temperature = temperature;
            this.humidity = humidity;
            this.description = description;
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

        public String getDescription() {
        return description;
            }

        public void setDescription(String description) {
        this.description = description;
            }

        @Override
        public String toString() {
            return "Weather{" +
                    "id=" + id +
                    ", location='" + location + '\'' +
                    ", temperature=" + temperature +
                    ", humidity=" + humidity +
                    ", description=" + description +
                    '}';
        }
    }


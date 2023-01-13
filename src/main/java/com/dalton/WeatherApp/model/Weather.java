package com.dalton.WeatherApp.model;
import java.util.Date;

public class Weather {
        private int id;
        private String location;
        private double temperature;
        private Date timestamp;

        public Weather() {}

        public Weather(String location, double temperature) {
            this.location = location;
            this.temperature = temperature;
            this.timestamp = new Date();
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

        public Date getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Date timestamp) {
            this.timestamp = timestamp;
        }

        @Override
        public String toString() {
            return "Weather{" +
                    "id=" + id +
                    ", location='" + location + '\'' +
                    ", temperature=" + temperature +
                    ", timestamp=" + timestamp +
                    '}';
        }
    }


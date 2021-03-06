package com.windy.udacity.mysunshine;

import java.util.List;

/**
 * Created by windog on 2016/6/6.
 * <p/>
 * JSON returned from OPEN_WEATHER_MAP_API
 * class generated by GsonFormat
 */
public class WeatherInfo {

    /**
     * id : 1816670
     * name : Beijing
     * coord : {"lon":116.397232,"lat":39.907501}
     * country : CN
     * population : 0
     */

    private CityBean city;
    /**
     * city : {"id":1816670,"name":"Beijing","coord":{"lon":116.397232,"lat":39.907501},"country":"CN","population":0}
     * cod : 200
     * message : 0.0329
     * cnt : 7
     * list : [{"dt":1465099200,"temp":{"day":303.28,"min":291.45,"max":303.28,"night":291.45,"eve":303.28,"morn":303.28},"pressure":944.53,"humidity":32,"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"speed":2.21,"deg":115,"clouds":36},{"dt":1465185600,"temp":{"day":299.36,"min":284.9,"max":301.53,"night":291.25,"eve":300.75,"morn":284.9},"pressure":946.32,"humidity":37,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"speed":0.72,"deg":112,"clouds":0},{"dt":1465272000,"temp":{"day":291.02,"min":286.52,"max":295.77,"night":289.75,"eve":295.77,"morn":286.52},"pressure":942.97,"humidity":91,"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"speed":1.21,"deg":190,"clouds":100,"rain":5.91},{"dt":1465358400,"temp":{"day":298.55,"min":285.98,"max":298.55,"night":285.98,"eve":293.03,"morn":293.51},"pressure":970.73,"humidity":0,"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"speed":1.85,"deg":77,"clouds":0},{"dt":1465444800,"temp":{"day":299.78,"min":290.37,"max":299.78,"night":290.37,"eve":295.83,"morn":295.27},"pressure":966.78,"humidity":0,"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"speed":4.32,"deg":180,"clouds":4,"rain":0.33},{"dt":1465531200,"temp":{"day":301.66,"min":291.88,"max":301.66,"night":291.88,"eve":298.8,"morn":293.68},"pressure":962.78,"humidity":0,"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"speed":3.48,"deg":213,"clouds":6,"rain":0.44},{"dt":1465617600,"temp":{"day":306.17,"min":293.51,"max":306.17,"night":293.51,"eve":300.03,"morn":300.22},"pressure":962.28,"humidity":0,"weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],"speed":1.3,"deg":205,"clouds":23,"rain":1.51}]
     */

    private String cod;
    private double message;
    private int cnt;
    /**
     * dt : 1465099200
     * temp : {"day":303.28,"min":291.45,"max":303.28,"night":291.45,"eve":303.28,"morn":303.28}
     * pressure : 944.53
     * humidity : 32
     * weather : [{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}]
     * speed : 2.21
     * deg : 115
     * clouds : 36
     */

    private List<ListBean> list;

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {
        private int id;
        private String name;
        /**
         * lon : 116.397232
         * lat : 39.907501
         */

        private CoordBean coord;
        private String country;
        private int population;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public static class CoordBean {
            private double lon;
            private double lat;

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }
        }
    }

    public static class ListBean {
        private int dt;
        /**
         * day : 303.28
         * min : 291.45
         * max : 303.28
         * night : 291.45
         * eve : 303.28
         * morn : 303.28
         */

        private TempBean temp;
        private double pressure;
        private int humidity;
        private double speed;
        private int deg;
        private int clouds;
        /**
         * id : 802
         * main : Clouds
         * description : scattered clouds
         * icon : 03d
         */

        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public TempBean getTemp() {
            return temp;
        }

        public void setTemp(TempBean temp) {
            this.temp = temp;
        }

        public double getPressure() {
            return pressure;
        }

        public void setPressure(double pressure) {
            this.pressure = pressure;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public int getDeg() {
            return deg;
        }

        public void setDeg(int deg) {
            this.deg = deg;
        }

        public int getClouds() {
            return clouds;
        }

        public void setClouds(int clouds) {
            this.clouds = clouds;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class TempBean {
            private double day;
            private double min;
            private double max;
            private double night;
            private double eve;
            private double morn;

            public double getDay() {
                return day;
            }

            public void setDay(double day) {
                this.day = day;
            }

            public double getMin() {
                return min;
            }

            public void setMin(double min) {
                this.min = min;
            }

            public double getMax() {
                return max;
            }

            public void setMax(double max) {
                this.max = max;
            }

            public double getNight() {
                return night;
            }

            public void setNight(double night) {
                this.night = night;
            }

            public double getEve() {
                return eve;
            }

            public void setEve(double eve) {
                this.eve = eve;
            }

            public double getMorn() {
                return morn;
            }

            public void setMorn(double morn) {
                this.morn = morn;
            }
        }

        public static class WeatherBean {
            private int id;
            private String main;
            private String description;
            private String icon;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getMain() {
                return main;
            }

            public void setMain(String main) {
                this.main = main;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }
    }
}

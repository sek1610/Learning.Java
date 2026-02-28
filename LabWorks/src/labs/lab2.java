package labs;

public class lab2 {
      public static class Calculator {

        public int Plus(int a, int b) {
            System.out.println("Сложить " + a + " и "+ b);
            return a+b;
        }

        public double Plus(double a, double b) {
            System.out.println("Сложить " + a + " и "+ b);
            return a+b;
        }

        public long Plus(long a, long b) {
            System.out.println("Сложить " + a + " и "+ b);
            return a+b;
        }

        public int Minus(int a, int b) {
            System.out.println("Вычесть из " + a + b);
            return a-b;
        }

        public double Minus(double a, double b) {
            System.out.println("Вычесть из " + a + b);
            return a-b;
        }

        public long Minus(long a, long b) {
            System.out.println("Вычесть из " + a + b);
            return a-b;
        }

        public double Divide(double a, double b) {
            System.out.println("Разделить " + a + " на " + b);
            return a/b;
        }

        public int Multiple(int a, int b) {
            System.out.println("Умножить " + a + " на " + b);
            return a*b;
        }

        public double Multiple(double a, double b) {
            System.out.println("Умножить " + a + " на " + b);
            return a*b;
        }

        public long Multiple(long a, long b) {
            System.out.println("Умножить " + a + " на " + b);
            return a*b;
        }

    }

    public static class Weather {
        private String Day_of_the_week;
        private Integer temperature;
        private Integer wetness;
        private Integer pressure;
        private Boolean rainfall;

        public Weather() {
            Day_of_the_week = "Понедельник";
            temperature = 20;
            rainfall = false;
        }

        public Weather(String Day_of_the_week, Integer temperature, Boolean rainfall, Integer wetness, Integer pressure) {
            this.Day_of_the_week = Day_of_the_week;
            this.temperature = temperature;
            this.wetness = wetness;
            this.pressure = pressure;
            this.rainfall = rainfall;
        }

        public void info() {
            System.out.println(Day_of_the_week + " " + temperature + " градусов " + "Осадки " + rainfall);
        }

    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        Calculator Calculator = new Calculator();
        double result1 = Calculator.Divide(5, 3);
        System.out.println("Результат=" + result1);
        System.out.println("===================");
        System.out.println("Задание 2");
        Weather day1 = new Weather("Вторник", 10, true, 10, 10);
        day1.info();
        System.out.println("===================");
    }
  
}

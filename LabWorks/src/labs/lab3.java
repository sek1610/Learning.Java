package labs;

public class lab3 {
  public static void main(String[] args) {
        System.out.println("Задание 1");
        Class.Study Study1 = new Class.Study("Изучение Java - это просто!");
        System.out.println(Study1.printCourse());
        System.out.println("===================");
        System.out.println("Задание 2");
        Class class1 = new Class("Белый");
        Class class2 = new Class("Красный", 200);
        class1.inf();
        class2.inf();
        System.out.println("===================");
        System.out.println("Задание 3");
        Class.House house1 = new Class.House("Дом1", 5, 1990);
        Class.House house2 = new Class.House("Дом2", 8, 2000);
        house1.inf();
        System.out.println(house1.age() + " лет");
        house2.inf();
        System.out.println(house2.age() + " лет");
        System.out.println("===================");
        System.out.println("Задание 4");
        Class.Tree tree1 = new Class.Tree("Дуб", true, 20);
        Class.Tree tree2 = new Class.Tree("Берёза", 10);
        Class.Tree tree3 = new Class.Tree();
        tree1.inf();
        tree2.inf();
        tree3.inf();
        System.out.println("===================");
    }


    public static class Class {
        private String name;
        private String color;
        private Integer weight;

        public void inf() {
            System.out.println(name + " " + color + " " + weight + " кг");
        }

        public Class(String name, String color, Integer weight) {
            this.name = name;
            this.color = color;
            this.weight = weight;
        }

        public Class() {
            name = "????";
            color = "????";
            weight = 0;
        }

        public Class(String color) {
            this.color = color;
        }

        public Class(String color, Integer weight) {
            this.color = color;
            this.weight = weight;
        }

        public static class House {
            private String name;
            private Integer floor;
            private Integer year;

            public House(String name, Integer floor, Integer year) {
                this.name = name;
                this.floor = floor;
                this.year = year;
            }

            public void inf() {
                System.out.println(name + " " + floor + " этажей " + year + " год");
            }

            public Integer age() {
                System.out.println("Количество лет с момента постройки");
                return 2026 - year;
            }


        }

        public static class Study {
            private String course;

            public Study(String course) {
                this.course = course;
            }

            public String printCourse() {
                return this.course;
            }
        }

        public static class Tree {
            private String name;
            private Boolean alive;
            private Integer age;

            public void inf() {
                if (name == null) {
                    System.out.println("Пустой конструктор без параметров сработал");
                } else {
                    System.out.println(name + " Живое? " + alive + " " + age + " лет");
                }
            }

            public Tree(String name, Boolean alive, Integer age) {
                this.name = name;
                this.alive = alive;
                this.age = age;
            }

            public Tree(String name, Integer age) {
                this.name = name;
                this.age = age;
            }

            public Tree() {
                this.name = null;
            }

        }


    }
}

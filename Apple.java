package Chapter1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

    public class Apple {
        private int weight = 0; private String color = "";     
        public Apple(int weight, String color) {
            this.weight = weight;
            this.color = color;
        }
        public Integer getWeight() {
            return weight;
        }
        public void setWeight(Integer weight) {
            this.weight = weight;
        }
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        @Override
        public String toString() {
            return "color='" + color + '\''
                    + ", weight=" + weight ;
        }//toString            // un Predicate Antiguo
        public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
        }
        public static List<Apple> datos() {
         List<Apple> ll = Arrays.asList(
         new Apple(80,"green"),new Apple(200,"green"),  new Apple(50, "brown"),
         new Apple(152, "red"),new Apple( 80, "yellow"),new Apple( 30, "red"),
         new Apple(90, "red"), new Apple( 25, "red")
            );
            return ll;
        }
    }//class



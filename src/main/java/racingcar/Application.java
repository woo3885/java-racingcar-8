package racingcar;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static class Car {
        private final String name;
        public Car(String name) {
            this.name = name;
        }
        public String getName() {return this.name;};
    }


    public static void main(String[] args) {
        String input = Console.readLine();
        String[] names = input.split(",");

        List<Car> carList = new ArrayList<>();
        for (String name : names) {
            carList.add(new Car(name.trim()));
        }


    }
}

package racingcar;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static class Car {

        private final String name;
        private int condition;
        private int location = 0;


        public Car(String name) {
            this.name = name;
        }
        public String getName() {return this.name;};

        public void setConditions() {
            this.condition = Randoms.pickNumberInRange(0, 9);
        }

        public int getCondition() {return this.condition;}

        public void move() {
            if (this.condition >= 4) {
                this.location++;
            }
        }

        public int getLocation() {return this.location;}

    }


    public static void main(String[] args) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();
        String[] names = input.split(",");

        List<Car> carList = new ArrayList<>();
        for (String name : names) {
            carList.add(new Car(name.trim()));
        }

        System.out.println("시도할 횟수는 몇 회인가요?");
        int degrees = Integer.parseInt(Console.readLine());

        System.out.println("실행 결과");
        for (int i = 0; i < degrees; i++) {
            for (Car car : carList){
                car.setConditions();
                car.move();
                System.out.print(car.getName() + " : ");
                System.out.println("-".repeat(car.getLocation()));
            }
            System.out.println();
        }


    }
}

package chapter22;

interface Unit3 {
    void move();
}

class HumanCamp3 {
    private int speed = 10;

    public Unit3 getMarine() {
        class Marine3 implements Unit3 {
            public void move() {
                System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
            }
        }
        // 내부 클래스 사용
        // 딱 한 번만 사용될 때 클래스명을 생략하고
        // 부모 클래스나 인터페이스의 이름을 임시로 사용
        return new Marine3();
    }
}

public class Ex03_AnonymousInner1 {
    public static void main(String[] args) {
        HumanCamp3 hc = new HumanCamp3();
        Unit3 unit = hc.getMarine();
        unit.move();
    }
}

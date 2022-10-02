public class Main {
​
    public static void main(String[] args) {
​
        Programmer programmer = new Programmer(
                "Ron",
                "HackerU",
                new String[] {"Java","Python","Swift","C"}
        );
​
        programmer.intro();
        System.out.println(programmer.isInArray("Python"));
    }
}
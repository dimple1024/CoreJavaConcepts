package nested_classes;

/* Example of static nested class*/
public class OuterClass {
    private String name = "piyush";
    private int age = 10;

    public int getAge() {
        return age;
    }

    public static class StaticNestedClass {
        private int RANDOM = 100;
        public static void main(String[] args) {
            OuterClass obj = new OuterClass();
            System.out.println("OuterClass method call:: " + obj.getAge());
            System.out.println("Outer class private memeber access:: "+ obj.name);
        }
    }
}

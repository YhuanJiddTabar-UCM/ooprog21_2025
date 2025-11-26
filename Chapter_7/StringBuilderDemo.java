import java.lang.StringBuilder;

class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Barbara");
        StringBuilder str2 = new StringBuilder("6311 Hickory Nut Grove Road");

        System.out.println("(StringBuilder 1) nameString: " + str1);
        System.out.println("Capacity of nameString is: " + str1.capacity());
        System.out.println("(StringBuilder 2) addressString: " + str2);
        System.out.println("Capacity of addressString is: " + str2.capacity());

        str1.setLength(20);
        str2.setLength(20);

        System.out.println("(Length set to 20 for StringBuilder 1) The name is " + str1 + "end");
        System.out.println("(Length set to 20 for StringBuilder 2) The address is " + str2);
    }
}
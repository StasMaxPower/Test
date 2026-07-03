package lesson_2;

public class Main1 {

    public static void main(String[] args) {

        int x;

        String s = "123";
        String s1 = "12345";
        char[] charArray = s.toCharArray();
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());



        User user  = new User();
        User user1  = new User();
        user.name = "Vasuy";
        user1.name = "Petya";
        System.out.println(user.name);
        System.out.println(User.eyes);
        System.out.println(user1.eyes);

        User.getHairColor();

        Integer integer = 10;
        Integer integer1 = 10;

        System.out.println(Integer.MAX_VALUE);
    }
}

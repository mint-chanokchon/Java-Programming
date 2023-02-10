public class StringPractice {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str = new String("  Hello World  ");
        
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.substring(2, 7));
        System.out.println(str.repeat(3));
        System.out.println(str.replace('o', 'E'));
        System.out.println(str.trim().startsWith("Hello"));
        System.out.println(str.trim().endsWith("World"));
        System.out.println(str.trim().charAt(2));
        System.out.println(str.trim().indexOf("o"));
        System.out.println(str.trim().lastIndexOf("o"));
        System.out.println(str.trim().equals("Hello"));
        System.out.println(str.trim().compareTo("Bike"));
        System.out.println(str.trim() == str1);
        System.out.println(str.trim().contains("World"));
        System.out.println(str.trim().concat("Bike"));
    }
}

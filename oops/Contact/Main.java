package oops.Contact;

public class Main {
    public static void main(String[] args) {
        Contact p1 = new Contact();
        p1.setFirstName("pEtEr");
        p1.setLastName("pAkEr");
        p1.setPhoneNumber("(08)-0071-0622");

        Contact p2 = new Contact("Chanokchon", "Wongjampa", "(08)-0071-0622");
        System.out.println(p1.toString());
        System.out.println(p1.prettyFormatPhoneNumber());
    }
}

package Address;

public class Main {
    public static void main(String[] args) {
        Address myAddress = new Address(25000, "Ukraine", "Kropyvnytskyi", "Vokzalna", "20 к.2", 44);
            int myAddressIndex = myAddress.getIndex();
            String myAddressCountry = myAddress.getCountry();
            String myAddressCity = myAddress.getCity();
            String myAddressStreet = myAddress.getStreet();
            String myAddressHouse = myAddress.getHouse();
            int myAddressApartment = myAddress.getApartment();

        System.out.println("Мой адресс: " + myAddressIndex + " " + myAddressCountry + " " + myAddressCity + " " + myAddressStreet + " " + myAddressHouse + " " + myAddressApartment);

        myAddress.setIndex(20200);
        myAddress.setCountry("Ukraine");
        myAddress.setCity("Kyiv");
        myAddress.setStreet("Yaroslavska");
        myAddress.setHouse("58");
        myAddress.setApartment(707);

        System.out.println("Новый адресс: " + myAddress.getIndex() + " " + myAddress.getCountry() + " " + myAddress.getCity() + " " + myAddress.getStreet() + " " + myAddress.getHouse() + " " + myAddress.getApartment());

        Address myAddress2 = new Address("Ukraine");
        myAddress2.setIndex(25200);
        myAddress2.setCity("Kyiv");
        myAddress2.setStreet("Obolon");
        myAddress2.setHouse("12");
        myAddress2.setApartment(102);

        System.out.println("Второй адресс: " + myAddress2);
    }
}
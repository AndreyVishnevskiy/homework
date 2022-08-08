package Address;

public class Main {
    public static void main(String[] args) {
        Address myAddress = new Address("Ukraine");
            int myAddressIndex = myAddress.getIndex();
            String myAddressCountry = myAddress.getCountry();
            String myAddressCity = myAddress.getCity();
            String myAddressStreet = myAddress.getStreet();
            String myAddressHouse = myAddress.getHouse();
            int myAddressApartment = myAddress.getApartment();

        System.out.println("Мой адресс: " + myAddressIndex + " " + myAddressCountry + " " + myAddressCity + " " + myAddressStreet + " " + myAddressHouse + " " + myAddressApartment);

        myAddress.setIndex(25200);
        myAddress.setCity("Kyiv");
        myAddress.setStreet("Obolon");
        myAddress.setHouse("12");
        myAddress.setApartment(102);

        System.out.println("Второй адресс: " + myAddress);
    }
}
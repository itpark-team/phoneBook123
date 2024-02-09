public class Main {
    public static void main(String[] args) {
        PhonesStore phonesStore = new PhonesStore();

        phonesStore.addPhone(new Phone("iPhone XS", PhoneColors.Red, 15000, 23));
        phonesStore.addPhone(new Phone("iPhone 13", PhoneColors.SpaceGray, 55000, 41));

        System.out.println(phonesStore.getPhonesInTableView());
    }
}
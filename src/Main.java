public class Main {
    public static void main(String[] args) throws Exception {
        PhonesStore phonesStore = new PhonesStore();

        boolean isRun = true;

        while (isRun) {
            ConsoleUtil.printlnString(phonesStore.getPhonesInTableView());

            ConsoleUtil.printlnString("-------");
            ConsoleUtil.printlnString("Меню");
            ConsoleUtil.printlnString("1. Загрузить список из файла");
            ConsoleUtil.printlnString("2. Сохратить список в файл");
            ConsoleUtil.printlnString("3. Добавить телефон в список");
            ConsoleUtil.printlnString("4. Удалить телефон из списка");
            ConsoleUtil.printlnString("5. Изменить данные выбранного телефона");
            ConsoleUtil.printlnString("0. Выход");

            int action = ConsoleUtil.inputInt("Введите номер действия: ", 0, 5);

            switch (action) {
                case 0: {
                    isRun = false;
                    ConsoleUtil.printlnString("Программа будет закрыта");
                }
                break;
                case 1: {
                    phonesStore.loadPhonesFromFile();
                }
                break;
                case 2: {
                    phonesStore.savePhonesToFile();
                }
                break;
                case 3: {
                    String model = ConsoleUtil.inputString("Введите модель телефона: ", 3, 20);
                    String color = PhoneColors.getColorByNumber(ConsoleUtil.inputInt("Введите ноимер цвета (1,2,3): ", 3, 20));
                    int price = ConsoleUtil.inputInt("Введите цену телефона: ", 1, 1000000);
                    int balance = ConsoleUtil.inputInt("Введите кол-во телефонов на складе: ", 0, 100);

                    Phone phone = new Phone(model, color, price, balance);

                    phonesStore.addPhone(phone);
                }
                break;
                case 4: {
                    int numberDelete = ConsoleUtil.inputInt("Введите номер телефона для удаления: ", 1, phonesStore.getPhonesCount());

                    phonesStore.deletePhoneByNumber(numberDelete);
                }
                break;
                case 5: {
                    int numberEdit = ConsoleUtil.inputInt("Введите номер телефона для редактирования: ", 1, phonesStore.getPhonesCount());

                    Phone phone = phonesStore.getPhoneByNumber(numberEdit);

                    //todo доделать
                }
                break;
            }

        }
    }
}
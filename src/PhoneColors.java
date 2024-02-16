public class PhoneColors {
    public static final String Red = "Красный";
    public static final String Yellow = "Жёлтный";
    public static final String SpaceGray = "Космически-Серый";

    public static String getColorByNumber(int number) {
        switch (number) {
            case 1:
                return Red;
            case 2:
                return Yellow;
            case 3:
                return SpaceGray;
        }
        return "None";
    }

}

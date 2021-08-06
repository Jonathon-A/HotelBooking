package hotelbooking;

public class HotelCalculator {

    public static int days;
    public static int RoomPrice;
    public static int BoardPrice;
    public static double calc;
    public static double calcdiscount;

    public static  void setDays(int days) {
        HotelCalculator.days = days;
    }

    public static  void setRoomPrice(int RoomPrice) {
        HotelCalculator.RoomPrice = RoomPrice;
    }

    public static  void setBoardPrice(int BoardPrice) {
        HotelCalculator.BoardPrice = BoardPrice;
    }

    public static double getcalcdiscount() {
        if (days > 7) {
            HotelCalculator.calcdiscount = ((7 * (RoomPrice + BoardPrice)) + (((days - 7) * (RoomPrice + BoardPrice)) * 0.8));
        } else {
            HotelCalculator.calcdiscount = (days * (RoomPrice + BoardPrice));
        }
        return calcdiscount;
    }

    public static double getcalc() {
        HotelCalculator.calc = (days * (RoomPrice + BoardPrice));
        return calc;
    }
}

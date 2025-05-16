public class BitOperations {
    public static int getBit(int number, int position) {return (number >> position) & 1;}
    public static int setBit(int number, int position) {return number | (1 << position);}
    public static int clearBit(int number, int position) {return number & ~(1 << position);}
    public static int updateBit(int number, int position, boolean value) {return (value) ? setBit(number, position) : clearBit(number, position);}
}

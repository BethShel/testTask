public class Convertation {
    private Integer num;

    public Convertation(Integer number) {
        num = number;
    }

    public String tenToHex() {
        return Integer.toHexString(num);
    }
    public void setNum(Integer number)
    {
        num=number;
    }
    public String tenToBin() {
        return Integer.toString(num, 2);
    }

    public Integer binToTen() {
        Integer copy = num;
        while (copy > 0) {
            if (copy % 10 != 0 && copy % 10 != 1) {
                throw new NumberFormatException("Заданное число не в двузначной системе счисления!");
            } else {
                copy = copy / 10;
            }
        }
        return Integer.parseInt(num.toString(), 2);
    }
}

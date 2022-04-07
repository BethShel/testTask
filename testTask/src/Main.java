public class Main {

    public static void main(String[] args) {
        Integer a = 789;
        Convertation testNum=new Convertation(a);
        System.out.println("Перевод из десятичной в шестнадцатиричную: " + testNum.tenToHex());
        System.out.println("Перевод из десятичной в двоичную: " + testNum.tenToBin());
        a=10001010;
        testNum.setNum(a);
        System.out.println("Перевод из двоичной в десятичную: " + testNum.binToTen());
    }
}

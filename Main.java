public class Main {
    public static String calc (String input) throws MyException {
        Converter converter = new Converter();
        int num1;
        int num2;
        int res = 0;
        String[] num = input.split(" ");
        if (converter.isRoman(num[0]) == converter.isRoman(num[2])) {
            boolean isRoman = converter.isRoman(num[0]);
            if (isRoman) {
                    num1 = converter.romanToInt(num[0]);
                num2 = converter.romanToInt(num[2]);}
             else {
                num1 = Integer.parseInt(num[0]);
                num2 = Integer.parseInt(num[2]);
            }

             if (num1 > 10 || num2> 10) {
                 throw new MyException("Калькулятор не принимает на вход числа более 10");
             }
             else {
            switch (num[1]) {
                case "+":
                        res = num1 + num2;
                        break;
                case "-":
                        res = num1 - num2;
                        break;
                case "*":
                        res = num1 * num2;
                        break;
                case "/":
                        res = num1 / num2;
                        break;
            }

            if (isRoman) {

                if (res <= 0) {
                    throw new MyException("В римской системе нет нуля и отрицательных чисел");
                } else {
                    System.out.println(converter.intToRoman(res));
                }
            }
            else {
                System.out.println(res);
            } }


        }  else {
            throw new MyException("Используются одновременно разные системы исчисления");
        }

        return num[1];
    }
}

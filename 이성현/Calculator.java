import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==== 지원하는 연산 ====\n");
        System.out.println("1. + (더하기)");
        System.out.println("2. - (빼기)");
        System.out.println("3. * (곱하기)");
        System.out.println("4. / (몫)");
        System.out.println("5. % (나머지)");
        System.out.println("6. 종료\n");
        System.out.print("수행하고 싶은 연산을 선택해주세요>> ");
        int operator = sc.nextInt();

        System.out.print("첫번째 피연산자를 입력해주세요>> ");
        int operand1 = sc.nextInt();

        System.out.print("두번째 피연산자를 입력해주세요>> ");
        int operand2 = sc.nextInt();

        int result = 0;
        switch (operator) {
            case 1:
                result = operand1 + operand2;
                break;
            case 2:
                result = operand1 - operand2;
                break;
            case 3:
                result = operand1 * operand2;
                break;
            case 4:
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("피연산자 2는 0이 아닌 값을 입력해야 합니다.");
                }
                break;
            case 5:
                if (operand2 != 0) {
                    result = operand1 % operand2;
                } else {
                    System.out.println("피연산자 2는 0이 아닌 값을 입력해야 합니다.");
                }
                break;
            case 6:
                System.out.println("프로그램을 종료합니다.");
                return;
            default:
                System.out.println("유효하지 않은 연산자를 입력했습니다.");
                return;
        }


        if (operator >= 1 && operator <= 5) {
            System.out.println(operand1 + " " + getOperator(operator) + " " + operand2 + " = " + result);
        }
    }


    private static String getOperator(int operator) {
        switch (operator) {
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "*";
            case 4:
                return "/";
            case 5:
                return "%";
            default:
                return "";
        }
    }
}


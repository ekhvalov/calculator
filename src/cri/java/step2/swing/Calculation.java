package cri.java.step2.swing;

public class Calculation {

    private static String answer = "";

    public String calculate(String history, String mainView, String operator) {
        double leftSide;
        double rightSide = Double.parseDouble(mainView);
        if (answer.isEmpty()) {
            leftSide = Double.parseDouble(history.substring(0, history.length() - 1));
        } else {
            leftSide = Double.parseDouble(answer);
        }
        double result;
        switch (operator) {
            case "+":
                result = leftSide + rightSide;
                break;
            case "-":
                result = leftSide - rightSide;
                break;
            case "×":
                result = leftSide * rightSide;
                break;
            default:
                result = leftSide / rightSide;
        }
        if (result == (long) result) {
            answer = String.valueOf((long) result);
        } else {
            answer = String.valueOf(result);
        }
        return answer;
    }

    public void eraseAnswer() {
        answer = "";
    }
}

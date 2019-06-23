package cri.java.step2.swing;

public class ButtonActions {
    private static String previousOperator;
    private Calculation calculation = new Calculation();

    public String[] pushNumber(String history, String mainView, String buttonValue) {
        if (mainView.equals("0")) {
            mainView = buttonValue;
        } else {
            mainView = mainView + buttonValue;
        }
        return new String[]{history, mainView};
    }

    public String[] pushZeroes(String history, String mainView, String buttonValue) {
        if (mainView.equals("0")) {
            return new String[]{history, mainView};
        }
        mainView = mainView + buttonValue;
        return new String[]{history, mainView};
    }


    public String[] pushPoint(String history, String mainView, String buttonValue) {
        if (mainView.contains(".")) {
            return new String[]{history, mainView};
        }
        mainView = mainView + buttonValue;
        return new String[]{history, mainView};
    }

    public String[] pushClearAll() {
        return new String[]{"", "0"};
    }

    public String[] pushClear(String history) {
        return new String[]{history, "0"};
    }

    public String[] pushArrow(String history, String mainView) {
        mainView = mainView.substring(0, mainView.length() - 1);
        if (mainView.isEmpty()) {
            mainView = "0";
        }
        return new String[]{history, mainView};
    }

    public String[] pushSymbols(String history, String mainView, String buttonValue) {
        if (history.isEmpty()) {
            history = mainView + buttonValue;
            previousOperator = buttonValue;
            mainView = "0";
        } else {
            history = calculation.calculate(history, mainView, previousOperator);
            previousOperator = buttonValue;
            mainView = "0";
        }
        if (buttonValue.equals("=")) {
            calculation.eraseAnswer();
            mainView = history;
            history = "";
        }
        return new String[]{history, mainView};
    }

}

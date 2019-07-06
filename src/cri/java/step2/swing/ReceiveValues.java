package cri.java.step2.swing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReceiveValues {

	// 計算履歴
	String history;
	// 答え、入力値
	String mainView;
	ButtonActions buttonActions = new ButtonActions();
	List numbers = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");

	public ReceiveValues(String history, String mainView, String buttonValue) {
		this.history = history;
		this.mainView = mainView;

		judgeButton(buttonValue);
		// グラフィックに反映
		CalcFrame.outputPanel.resetValues(this.history, this.mainView);
	}

	public void judgeButton(String buttonValue)
    {
        String[] views;
        switch (buttonValue) {
            case "00":
                views = buttonActions.pushZeroes(history, mainView, buttonValue);
                break;
            case ".":
                views = buttonActions.pushPoint(history, mainView, buttonValue);
                break;
            case "CA":
                views = buttonActions.pushClearAll();
                break;
            case "C":
                views = buttonActions.pushClear(history);
                break;
            case "←":
                views = buttonActions.pushArrow(history, mainView);
                break;
            default:
                if (numbers.contains(buttonValue)) {
                    views = buttonActions.pushNumber(history, mainView, buttonValue);
                } else {
                    views = buttonActions.pushSymbols(history, mainView, buttonValue);
                }
        }
        this.history = views[0];
        this.mainView = views[1];
    }

}

package com.dyc.codegen;

import com.intellij.openapi.actionSystem.AnActionEvent;

public class GenActivityAction extends BaseAction {
	/**
	 * Constructor for Action1.
	 */
	public GenActivityAction() {
		super();
	}




	@Override
	public void actionPerformed(AnActionEvent anActionEvent) {
		super.actionPerformed(anActionEvent);
		if(path.endsWith("xml")) {
			EditDialog wd = new EditDialog(path, Constants.KEY_GEN_ACTVITY);
			wd.setSize(400, 335);
			wd.setVisible(true);
		}

	}
}

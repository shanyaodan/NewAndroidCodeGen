package com.dyc.codegen;

import com.intellij.openapi.actionSystem.AnActionEvent;

public class GenFragmentAction  extends BaseAction {

	/**
	 * Constructor for Action1.
	 */
	public GenFragmentAction() {
		super();
	}

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        super.actionPerformed(anActionEvent);
        if (path.endsWith("xml")) {
        EditDialog wd = new EditDialog(path, Constants.KEY_GEN_FRAGMENT);
        wd.setSize(400, 335);
        wd.setVisible(true);
        }
    }

}

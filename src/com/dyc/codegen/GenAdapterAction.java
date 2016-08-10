package com.dyc.codegen;


import com.intellij.openapi.actionSystem.AnActionEvent;

public class GenAdapterAction extends BaseAction {
	public GenAdapterAction() {
		super();
	}
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        super.actionPerformed(anActionEvent);
        if (path.endsWith("xml")) {
        EditDialog wd = new EditDialog(path,Constants.KEY_GEN_ADAPTER);
        wd.setSize(400, 335);
        wd.setVisible(true);
        }
    }
}

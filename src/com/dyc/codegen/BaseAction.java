package com.dyc.codegen;

import com.dyc.codegen.utils.CommUtitl;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataKeys;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;


/**
 * Created by Administrator on 2015/6/24.
 */
public class BaseAction extends AnAction{

    /**
     * ��ǰѡ���ļ����� ·��
     */
  public   String path = "";


    @Override
    public void update(AnActionEvent event) {

        event.getPresentation().setEnabledAndVisible(true);
    }

    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {

        CommUtitl.projPath = anActionEvent.getProject().getBasePath()+"/";
        path =anActionEvent.getData(DataKeys.VIRTUAL_FILE).getPath();
        if (!path.endsWith(".xml")) {
            Project project = anActionEvent.getData(PlatformDataKeys.PROJECT);
            Messages.showErrorDialog(project,"please select a file end with \"xml\"","tips");
        }

    }
}

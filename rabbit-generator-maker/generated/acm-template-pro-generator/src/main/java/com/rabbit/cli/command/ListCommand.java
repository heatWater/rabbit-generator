package com.rabbit.cli.command;

import cn.hutool.core.io.FileUtil;
import picocli.CommandLine;

import java.io.File;
import java.util.List;

/**
 * list ������
 * list ��һ��������������Ǳ����������Ҫ���ɵ��ļ��б�
 */

@CommandLine.Command(name = "list", description = "�鿴�ļ��б�", mixinStandardHelpOptions = true)
public class ListCommand implements Runnable{

    public void run() {
        // ����·��
        String inputPath = ".source/acm-template-pro";
        List<File> files = FileUtil.loopFiles(inputPath);
        for (File file : files) {
            System.out.println(file);
        }
    }
}
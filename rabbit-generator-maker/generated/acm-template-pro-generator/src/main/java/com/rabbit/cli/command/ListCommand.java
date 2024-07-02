package com.rabbit.cli.command;

import cn.hutool.core.io.FileUtil;
import picocli.CommandLine;

import java.io.File;
import java.util.List;

/**
 * list 子命令
 * list 是一个辅助命令，作用是遍历输出所有要生成的文件列表
 */

@CommandLine.Command(name = "list", description = "查看文件列表", mixinStandardHelpOptions = true)
public class ListCommand implements Runnable{

    public void run() {
        // 输入路径
        String inputPath = ".source/acm-template-pro";
        List<File> files = FileUtil.loopFiles(inputPath);
        for (File file : files) {
            System.out.println(file);
        }
    }
}
package com.rabbit.generator;

import cn.hutool.core.io.FileUtil;

/**
 * ��̬�ļ�����
 */
public class StaticGenerator {

    /**
     * �����ļ���Hutool ʵ�֣��Ὣ����Ŀ¼�������������Ŀ¼�£�
     *
     * @param inputPath
     * @param outputPath
     */
    public static void copyFilesByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }
}
package com.rabbit.generator;

import cn.hutool.core.io.FileUtil;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * ��̬�ļ�����
 */
public class DynamicGenerator {

    /**
     * �����ļ�
     *
     * @param inputPath ģ���ļ�����·��
     * @param outputPath ���·��
     * @param model ����ģ��
     * @throws IOException
     * @throws TemplateException
     */
    public static void doGenerate(String inputPath, String outputPath, Object model) throws IOException, TemplateException {
        // new �� Configuration ���󣬲���Ϊ FreeMarker �汾��
        Configuration configuration = new Configuration(Configuration.VERSION_2_3_32);

        // ָ��ģ���ļ����ڵ�·��
        File templateDir = new File(inputPath).getParentFile();
        configuration.setDirectoryForTemplateLoading(templateDir);

        // ����ģ���ļ�ʹ�õ��ַ���
        configuration.setDefaultEncoding("utf-8");

        // ����ģ����󣬼���ָ��ģ��
        String templateName = new File(inputPath).getName();
        Template template = configuration.getTemplate(templateName);

        // �ļ��������򴴽��ļ��͸�Ŀ¼
        if (!FileUtil.exist(outputPath)) {
            FileUtil.touch(outputPath);
        }

        // ����
        Writer out = new FileWriter(outputPath);
        template.process(model, out);

        // �����ļ�������˹ر�Ŷ
        out.close();
    }

}
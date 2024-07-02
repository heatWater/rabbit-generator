package com.rabbit.cli.command;

import cn.hutool.core.util.ReflectUtil;
import com.rabbit.model.DataModel;
import picocli.CommandLine.Command;

import java.lang.reflect.Field;

@Command(name = "config", description = "�鿴������Ϣ", mixinStandardHelpOptions = true)
public class ConfigCommand implements Runnable {

    public void run() {
        // ʵ�� config ������߼�
        System.out.println("�鿴������Ϣ");

        Field[] fields = ReflectUtil.getFields(DataModel.class);

        // ��������ӡÿ���ֶε���Ϣ
        for (Field field : fields) {
            System.out.println("�ֶ����ƣ�" + field.getName());
            System.out.println("�ֶ����ͣ�" + field.getType());
            System.out.println("---");
        }
    }
}
package com.rabbit.cli.command;

import cn.hutool.core.util.ReflectUtil;
import com.rabbit.model.MainTemplateConfig;
import picocli.CommandLine;

import java.lang.reflect.Field;


/**
 * config 子命令
 * 作用是输出允许用户传入的动态参数的信息（也就是本项目MainTemplate类的字段信息）
 */
@CommandLine.Command(name = "config", description = "查看参数信息", mixinStandardHelpOptions = true)
public class ConfigCommand implements Runnable{


    @Override
    public void run() {
        // 实现config命令的逻辑
        System.out.println("查看参数信息");
        // JDK 原生反射
//        Class<?> myClass = MainTemplateConfig.class;
        // 获取类的所有字段
//        Field[] fields = myClass.getDeclaredFields();

        // hutool 反射工具类
        Field[] fields = ReflectUtil.getFields(MainTemplateConfig.class);

        // 遍历并打印每个字段的信息
        for (Field field : fields) {
            System.out.println("字段名称：" + field.getName());
            System.out.println("字段类型：" + field.getType());
            System.out.println("---");
        }

    }
}

package com.rabbit.model;

import lombok.Data;


/**
* ����ģ��
*/
@Data
public class DataModel {

            /**
             * �Ƿ����� .gitignore �ļ�
             */
        public boolean needGit = true;

            /**
             * �Ƿ�����ѭ��
             */
        public boolean loop = false;

        /**
        * ����ģ��
        */
        public MainTemplate mainTemplate = new MainTemplate();

        /**
        * �������ɺ���ģ���ļ�
        */
        @Data
        public static class MainTemplate {
                /**
                 * ����ע��
                 */
            public String author = "sean";
                /**
                 * �����Ϣ
                 */
            public String outputText = "sum = ";
        }

}
package com.cd;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author cdviviany
 * @version 1.00
 */
//1、自定义对象封装指定数据的作用
//2、定义为Spring管理的bean
@Component
@ConfigurationProperties(prefix = "datasource")
public class MyDataSource {
    private String druiddriver;
    private String druidurl;
    private String druidusername;
    private String druidpassword;

    public String getDruiddriver() {
        return druiddriver;
    }

    public void setDruiddriver(String druiddriver) {
        this.druiddriver = druiddriver;
    }

    public String getDruidurl() {
        return druidurl;
    }

    public void setDruidurl(String druidurl) {
        this.druidurl = druidurl;
    }

    public String getDruidusername() {
        return druidusername;
    }

    public void setDruidusername(String druidusername) {
        this.druidusername = druidusername;
    }

    public String getDruidpassword() {
        return druidpassword;
    }

    public void setDruidpassword(String druidpassword) {
        this.druidpassword = druidpassword;
    }

    @Override
    public String toString() {
        return "MyDataSource{" +
                "druiddriver='" + druiddriver + '\'' +
                ", druidurl='" + druidurl + '\'' +
                ", druidusername='" + druidusername + '\'' +
                ", druidpassword='" + druidpassword + '\'' +
                '}';
    }
}

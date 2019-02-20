package com.example.BACKEND.Entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: BACKEND
 * @description: 配置文件参数
 * @author: wavesen.shen
 * @create: 2019-02-18 14:50
 */
@Component
@ConfigurationProperties("data.test")
public class DataConfig {
    private String envName;

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }
}

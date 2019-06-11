package com.example.base;

public class Builder {
    String deviceName = BaseAppium.deviceName;
    String platformVersion = BaseAppium.platformVersion;
    String path = System.getProperty("user.dir") + "/src/main/java/apps/";
    String appPath = BaseAppium.appPath;
    String appPackage = BaseAppium.appPackage;
    String appActivity = BaseAppium.appActivity;

    public Builder setAppPath(String appPath) {
        this.appPath = path + appPath;
        return this;
    }

    public Builder setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    public Builder setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    public Builder setApp(String appPath) {
        this.appPath = appPath;
        return this;
    }

    public Builder setAppPackage(String appPackage) {
        this.appPackage = appPackage;
        return this;
    }

    public Builder setAppActivity(String appActivity) {
        this.appActivity = appActivity;
        return this;
    }

    public BaseAppium build() {
        return new BaseAppium(this);
    }
}

package com.alphonse.accountmanage.entity;

import java.io.Serializable;
import java.util.Date;

public class CommonLog implements Serializable {
    private Integer logId;

    private String logName;

    private String logUsername;

    private String logClass;

    private String logMothod;

    private Date logCreatetime;

    private String logLevel;

    private String logMsg;

    private static final long serialVersionUID = 1L;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName;
    }

    public String getLogUsername() {
        return logUsername;
    }

    public void setLogUsername(String logUsername) {
        this.logUsername = logUsername;
    }

    public String getLogClass() {
        return logClass;
    }

    public void setLogClass(String logClass) {
        this.logClass = logClass;
    }

    public String getLogMothod() {
        return logMothod;
    }

    public void setLogMothod(String logMothod) {
        this.logMothod = logMothod;
    }

    public Date getLogCreatetime() {
        return logCreatetime;
    }

    public void setLogCreatetime(Date logCreatetime) {
        this.logCreatetime = logCreatetime;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public String getLogMsg() {
        return logMsg;
    }

    public void setLogMsg(String logMsg) {
        this.logMsg = logMsg;
    }
}
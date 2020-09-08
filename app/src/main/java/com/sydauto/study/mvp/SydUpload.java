/*
 * Copyright (c) 2020. syd
 */

package com.sydauto.study.mvp;

/**
 * @author liuchao
 */
public class SydUpload {
    
    private long timestamp;
    
    private String version;
    
    private String url;
    
    private int isForce;
    
    private String description;
    
    public long getTimestamp() {
        return timestamp;
    }
    
    @Override
    public String toString() {
        return "SydUpload{" +
                       "timestamp=" + timestamp +
                       ", version='" + version + '\'' +
                       ", url='" + url + '\'' +
                       ", isForce=" + isForce +
                       ", description='" + description + '\'' +
                       '}';
    }
    
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    
    public String getVersion() {
        return version;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }
    
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public int getIsForce() {
        return isForce;
    }
    
    public void setIsForce(int isForce) {
        this.isForce = isForce;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}

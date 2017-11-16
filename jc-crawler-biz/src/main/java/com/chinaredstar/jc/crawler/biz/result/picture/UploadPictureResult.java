package com.chinaredstar.jc.crawler.biz.result.picture;

import java.io.Serializable;

/**
 * Created by fangjian on 2016/11/18.
 */
public class UploadPictureResult implements Serializable {


    private static final long serialVersionUID = -2877978877210687555L;
    private String name;
    private String url;


    public UploadPictureResult() {
    }

    public UploadPictureResult(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

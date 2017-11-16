package com.chinaredstar.jc.crawler.biz.param.picture;

import java.io.InputStream;
import java.io.Serializable;

/**
 * Created by fangjian on 2016/11/18.
 */
public class UploadPictureParam implements Serializable {


    private static final long serialVersionUID = -2877978877210687555L;
    private String pictureName;
    private String pictureUrl;
    private InputStream pictureInputStream;

    public InputStream getPictureInputStream() {
        return pictureInputStream;
    }

    public void setPictureInputStream(InputStream pictureInputStream) {
        this.pictureInputStream = pictureInputStream;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}

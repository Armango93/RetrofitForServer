package com.example.retrofitforserver;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class UploadFileResponse {
    @SerializedName("fileName")
    @Expose
    private String fileName;
    @SerializedName("fileDownloadUri")
    @Expose
    private String fileDownloadUri;
    @SerializedName("fileType")
    @Expose
    private String fileType;
    @SerializedName("size")
    @Expose
    private long size;
    @SerializedName("wordsCountList")
    @Expose
    private List<String> wordsCountList = new ArrayList<>();
    @SerializedName("isBracketsOk")
    @Expose
    private boolean isBracketsOk;


    public boolean isBracketsOk() {
        return isBracketsOk;
    }

    public void setBracketsOk(boolean bracketsOk) {
        isBracketsOk = bracketsOk;
    }

    public List<String> getWordsCountList() {
        return wordsCountList;
    }

    public void setWordsCountList(List<String> wordsCountList) {
        this.wordsCountList = wordsCountList;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    public void setFileDownloadUri(String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}

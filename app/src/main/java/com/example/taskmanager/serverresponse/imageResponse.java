package com.example.taskmanager.serverresponse;

public class imageResponse {

    private String filename;

    public imageResponse(String filename) {
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}

package com.gardify.genericrecycleviewadapter;

public class PetHeader {
    private String headerName;
    private String headerpictureUrl;

    public PetHeader(String headerName, String headerpictureUrl) {
        this.headerName = headerName;
        this.headerpictureUrl = headerpictureUrl;
    }

    public String getHeaderName() {
        return headerName;
    }

    public String getHeaderpictureUrl() {
        return headerpictureUrl;
    }
}

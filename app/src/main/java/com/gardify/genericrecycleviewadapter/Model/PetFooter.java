package com.gardify.genericrecycleviewadapter.Model;

public class PetFooter {
    private String footerName;
    private String footerpictureUrl;

    public PetFooter(String footerName, String footerpictureUrl) {
        this.footerName = footerName;
        this.footerpictureUrl = footerpictureUrl;
    }

    public String getFooterName() {
        return footerName;
    }

    public String getFooterpictureUrl() {
        return footerpictureUrl;
    }
}

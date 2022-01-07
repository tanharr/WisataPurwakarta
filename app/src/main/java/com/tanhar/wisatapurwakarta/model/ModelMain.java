package com.tanhar.wisatapurwakarta.model;

/**
 * Created by Kharismawan Tanhar on 22-11-2021.
 */

public class ModelMain {

    private String txtName;
    private int imgSrc;

    public ModelMain(String txtName, int imgSrc) {
        this.txtName = txtName;
        this.imgSrc = imgSrc;
    }

    public String getTxtName() {
        return txtName;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(int imgSrc) {
        this.imgSrc = imgSrc;
    }

}

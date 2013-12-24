package cn.darlen.elec.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * This is PO Object for table Elec_text
 * User: darlen liu
 * Date: 13-12-24
 * Time: 下午10:00
 */
public class ElecText implements Serializable{

    private String textID;
    private String textName;
    private Date textDate;
    private String textRemark;

    public String getTextID() {
        return textID;
    }

    public void setTextID(String textID) {
        this.textID = textID;
    }

    public String getTextName() {
        return textName;
    }

    public void setTextName(String textName) {
        this.textName = textName;
    }

    public Date getTextDate() {
        return textDate;
    }

    public void setTextDate(Date textDate) {
        this.textDate = textDate;
    }

    public String getTextRemark() {
        return textRemark;
    }

    public void setTextRemark(String textRemark) {
        this.textRemark = textRemark;
    }

    @Override
    public String toString() {
        return "ElecText{" +
                "textID='" + textID + '\'' +
                ", textName='" + textName + '\'' +
                ", textDate=" + textDate +
                ", textRemark='" + textRemark + '\'' +
                '}';
    }
}

package com.mengxuegu.springbootweb.bean;


/*
@project:com.mengxuegu.springbootweb.bean
@Title:Provide
@Auther:lxl
@create:2018/12/16,23:12
*/
public class Provide {

    private String id;
    private String mername;
    private String userame;

    private long telphone;
    private long phone;
    private String date;

    public String getId() {
        return id;
    }

    public Provide(String id, String mername, String userame, long telphone, long phone, String date) {
        this.id = id;
        this.mername = mername;
        this.userame = userame;
        this.telphone = telphone;
        this.phone = phone;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Provide{" +
                "id='" + id + '\'' +
                ", mername='" + mername + '\'' +
                ", userame='" + userame + '\'' +
                ", telphone=" + telphone +
                ", phone=" + phone +
                ", date=" + date +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMername() {
        return mername;
    }

    public void setMername(String mername) {
        this.mername = mername;
    }

    public String getUserame() {
        return userame;
    }

    public void setUserame(String userame) {
        this.userame = userame;
    }

    public long getTelphone() {
        return telphone;
    }

    public void setTelphone(long telphone) {
        this.telphone = telphone;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

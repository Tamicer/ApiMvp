package com.tamic.api.bisiness;

/**
 * Created by LIUYONGKUI726 on 2018-01-08.
 */

public class UserBean {


    /**
     * code : 0
     * data : {"country":"美国","country_id":"US","area":"","area_id":"-1","region":"","region_id":"-1","city":"","city_id":"-1","county":"","county_id":"-1","isp":"","isp_id":"-1","ip":"21.22.11.33"}
     */

    private int code;
    /**
     * country : 美国
     * country_id : US
     * area :
     * area_id : -1
     * region :
     * region_id : -1
     * city :
     * city_id : -1
     * county :
     * county_id : -1
     * isp :
     * isp_id : -1
     * ip : 21.22.11.33
     */

    private DataBean data;


    public UserBean() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public class DataBean {

        private String country;

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public DataBean() {

        }
    }
}

package com.applications.hillaris.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ConferenceProducts {


    /**
     * status : true
     * registration_products : [{"productid":"354","type":"Academic","productname":"Combo A (Registration + 2 Nights' Accommodation)","price1":"899","price2":"999","price3":"0","price4":"740","price5":"820","price6":"0","price7":"830","price8":"920","price9":"0","early":"2019-12-30","final":"2020-09-17"},{"productid":"355","type":"Academic","productname":"Combo B (Registration + 3 Nights' Accommodation)","price1":"899","price2":"999","price3":"0","price4":"740","price5":"820","price6":"0","price7":"830","price8":"920","price9":"0","early":"2019-12-30","final":"2020-09-17"},{"productid":"356","type":"Academic","productname":"Only Registration","price1":"899","price2":"999","price3":"0","price4":"740","price5":"820","price6":"0","price7":"830","price8":"920","price9":"0","early":"2019-12-30","final":"2020-09-17"},{"productid":"357","type":"Industry/Business","productname":"Combo A (Registration + 2 Nights' Accommodation)","price1":"899","price2":"999","price3":"0","price4":"740","price5":"820","price6":"0","price7":"830","price8":"920","price9":"0","early":"2019-12-30","final":"2020-09-17"},{"productid":"358","type":"Industry/Business","productname":"Combo B (Registration + 3 Nights' Accommodation)","price1":"899","price2":"999","price3":"0","price4":"740","price5":"820","price6":"0","price7":"830","price8":"920","price9":"0","early":"2019-12-30","final":"2020-09-17"},{"productid":"359","type":"Industry/Business","productname":"Only Registration","price1":"899","price2":"999","price3":"0","price4":"740","price5":"820","price6":"0","price7":"830","price8":"920","price9":"0","early":"2019-12-30","final":"2020-09-17"},{"productid":"360","type":"Student","productname":"Combo A (Registration + 2 Nights' Accommodation)","price1":"899","price2":"999","price3":"0","price4":"740","price5":"820","price6":"0","price7":"830","price8":"920","price9":"0","early":"2019-12-30","final":"2020-09-17"},{"productid":"361","type":"Student","productname":"Combo B (Registration + 3 Nights' Accommodation)","price1":"899","price2":"999","price3":"0","price4":"740","price5":"820","price6":"0","price7":"830","price8":"920","price9":"0","early":"2019-12-30","final":"2020-09-17"},{"productid":"362","type":"Student","productname":"Only Registration","price1":"899","price2":"999","price3":"0","price4":"740","price5":"820","price6":"0","price7":"830","price8":"920","price9":"0","early":"2019-12-30","final":"2020-09-17"},{"productid":"363","type":"Addon","productname":"Video Presentation","price1":"899","price2":"999","price3":"0","price4":"740","price5":"820","price6":"0","price7":"830","price8":"920","price9":"0","early":"2019-12-30","final":"2020-09-17"},{"productid":"364","type":"Addon","productname":"Accompanying person","price1":"899","price2":"999","price3":"0","price4":"740","price5":"820","price6":"0","price7":"830","price8":"920","price9":"0","early":"2019-12-30","final":"2020-09-17"},{"productid":"365","type":"Addon","productname":"Poster Presentation","price1":"899","price2":"999","price3":"0","price4":"740","price5":"820","price6":"0","price7":"830","price8":"920","price9":"0","early":"2019-12-30","final":"2020-09-17"},{"productid":"366","type":"ePoster","productname":"E-Poster","price1":"899","price2":"999","price3":"0","price4":"740","price5":"820","price6":"0","price7":"830","price8":"920","price9":"0","early":"2019-12-30","final":"2020-09-17"}]
     */

    private boolean status;
    private List<RegistrationProductsBean> registration_products;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<RegistrationProductsBean> getRegistration_products() {
        return registration_products;
    }

    public void setRegistration_products(List<RegistrationProductsBean> registration_products) {
        this.registration_products = registration_products;
    }

    public static class RegistrationProductsBean {
        /**
         * productid : 354
         * type : Academic
         * productname : Combo A (Registration + 2 Nights' Accommodation)
         * price1 : 899
         * price2 : 999
         * price3 : 0
         * price4 : 740
         * price5 : 820
         * price6 : 0
         * price7 : 830
         * price8 : 920
         * price9 : 0
         * early : 2019-12-30
         * final : 2020-09-17
         */

        private String productid;
        private String type;
        private String productname;
        private String price1;
        private String price2;
        private String price3;
        private String price4;
        private String price5;
        private String price6;
        private String price7;
        private String price8;
        private String price9;
        private String early;
        @SerializedName("final")
        private String finalX;

        public String getProductid() {
            return productid;
        }

        public void setProductid(String productid) {
            this.productid = productid;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getProductname() {
            return productname;
        }

        public void setProductname(String productname) {
            this.productname = productname;
        }

        public String getPrice1() {
            return price1;
        }

        public void setPrice1(String price1) {
            this.price1 = price1;
        }

        public String getPrice2() {
            return price2;
        }

        public void setPrice2(String price2) {
            this.price2 = price2;
        }

        public String getPrice3() {
            return price3;
        }

        public void setPrice3(String price3) {
            this.price3 = price3;
        }

        public String getPrice4() {
            return price4;
        }

        public void setPrice4(String price4) {
            this.price4 = price4;
        }

        public String getPrice5() {
            return price5;
        }

        public void setPrice5(String price5) {
            this.price5 = price5;
        }

        public String getPrice6() {
            return price6;
        }

        public void setPrice6(String price6) {
            this.price6 = price6;
        }

        public String getPrice7() {
            return price7;
        }

        public void setPrice7(String price7) {
            this.price7 = price7;
        }

        public String getPrice8() {
            return price8;
        }

        public void setPrice8(String price8) {
            this.price8 = price8;
        }

        public String getPrice9() {
            return price9;
        }

        public void setPrice9(String price9) {
            this.price9 = price9;
        }

        public String getEarly() {
            return early;
        }

        public void setEarly(String early) {
            this.early = early;
        }

        public String getFinalX() {
            return finalX;
        }

        public void setFinalX(String finalX) {
            this.finalX = finalX;
        }
    }
}

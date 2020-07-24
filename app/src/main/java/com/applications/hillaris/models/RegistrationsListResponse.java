package com.applications.hillaris.models;

import java.util.List;

public class RegistrationsListResponse {


    /**
     * status : true
     * result : [{"short_name":"Trauma, Emergency Medicine & Critical Care 2020","country":"American Samoa","name":"Anil K","conf_id":"60","order_no":"399","amount":" 499","date_of_payment":"July 10, 2020","email":"anilwesley94@gmail.com","phone":"1222","paystatus":"approved"},{"short_name":"Trauma, Emergency Medicine & Critical Care 2020","country":"American Samoa","name":"Anil K","conf_id":"60","order_no":"400","amount":"GBP 499","date_of_payment":"July 10, 2020","email":"anilwesley94@gmail.com","phone":"1233","paystatus":"approved"}]
     */

    private boolean status;
    private List<ResultBean> result;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * short_name : Trauma, Emergency Medicine & Critical Care 2020
         * country : American Samoa
         * name : Anil K
         * conf_id : 60
         * order_no : 399
         * amount :  499
         * date_of_payment : July 10, 2020
         * email : anilwesley94@gmail.com
         * phone : 1222
         * paystatus : approved
         */

        private String short_name;
        private String country;
        private String name;
        private String conf_id;
        private String order_no;
        private String amount;
        private String date_of_payment;
        private String email;
        private String phone;
        private String paystatus;

        public String getShort_name() {
            return short_name;
        }

        public void setShort_name(String short_name) {
            this.short_name = short_name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getConf_id() {
            return conf_id;
        }

        public void setConf_id(String conf_id) {
            this.conf_id = conf_id;
        }

        public String getOrder_no() {
            return order_no;
        }

        public void setOrder_no(String order_no) {
            this.order_no = order_no;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public String getDate_of_payment() {
            return date_of_payment;
        }

        public void setDate_of_payment(String date_of_payment) {
            this.date_of_payment = date_of_payment;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPaystatus() {
            return paystatus;
        }

        public void setPaystatus(String paystatus) {
            this.paystatus = paystatus;
        }
    }
}

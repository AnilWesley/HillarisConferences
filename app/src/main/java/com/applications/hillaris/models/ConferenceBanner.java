package com.applications.hillaris.models;

import java.util.List;

public class ConferenceBanner {


    /**
     * status : true
     * conference : [{"id":"60","conf_type":"webinar","short_name":"Trauma, Emergency Medicine & Critical Care 2020","city":"Rome","country":"Italy","subject":"Medicine","start_date":"2020-09-17","end_date":"2020-09-18","url":"https://www.hilarisconferences.com/emergencymedicine","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/trauma-growth-60-60.jpg"}]
     */

    private boolean status;
    private List<ConferenceBean> conference;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<ConferenceBean> getConference() {
        return conference;
    }

    public void setConference(List<ConferenceBean> conference) {
        this.conference = conference;
    }

    public static class ConferenceBean {
        /**
         * id : 60
         * conf_type : webinar
         * short_name : Trauma, Emergency Medicine & Critical Care 2020
         * city : Rome
         * country : Italy
         * subject : Medicine
         * start_date : 2020-09-17
         * end_date : 2020-09-18
         * url : https://www.hilarisconferences.com/emergencymedicine
         * icon_url : https://s3.amazonaws.com/hilaris/conf_icons/trauma-growth-60-60.jpg
         */

        private String id;
        private String conf_type;
        private String short_name;
        private String city;
        private String country;
        private String subject;
        private String start_date;
        private String end_date;
        private String url;
        private String icon_url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getConf_type() {
            return conf_type;
        }

        public void setConf_type(String conf_type) {
            this.conf_type = conf_type;
        }

        public String getShort_name() {
            return short_name;
        }

        public void setShort_name(String short_name) {
            this.short_name = short_name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getStart_date() {
            return start_date;
        }

        public void setStart_date(String start_date) {
            this.start_date = start_date;
        }

        public String getEnd_date() {
            return end_date;
        }

        public void setEnd_date(String end_date) {
            this.end_date = end_date;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getIcon_url() {
            return icon_url;
        }

        public void setIcon_url(String icon_url) {
            this.icon_url = icon_url;
        }
    }
}

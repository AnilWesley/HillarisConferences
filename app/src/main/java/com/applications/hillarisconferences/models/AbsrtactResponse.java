package com.applications.hillarisconferences.models;

import java.util.List;

public class AbsrtactResponse {


    /**
     * status : true
     * result : [{"short_name":"Trauma, Emergency Medicine & Critical Care 2020","country":"Italy","name":"Anil K","email":"anilwesley94@gmail.com","phone":"121212121212","address":"fsfsfsfsf","category":"Poster","track_name":null,"date_of_submission":"July 09, 2020","file":"https://s3.amazonaws.com/hilaris/abstracts/emergencymedicine-60-1594310223.docx"}]
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
         * country : Italy
         * name : Anil K
         * email : anilwesley94@gmail.com
         * phone : 121212121212
         * address : fsfsfsfsf
         * category : Poster
         * track_name : null
         * date_of_submission : July 09, 2020
         * file : https://s3.amazonaws.com/hilaris/abstracts/emergencymedicine-60-1594310223.docx
         */

        private String short_name;
        private String country;
        private String name;
        private String email;
        private String phone;
        private String address;
        private String category;
        private String track_name;

        private String date_of_submission;
        private String file;

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

        public String getTrack_name() {
            return track_name;
        }

        public void setTrack_name(String track_name) {
            this.track_name = track_name;
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

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }



        public String getDate_of_submission() {
            return date_of_submission;
        }

        public void setDate_of_submission(String date_of_submission) {
            this.date_of_submission = date_of_submission;
        }

        public String getFile() {
            return file;
        }

        public void setFile(String file) {
            this.file = file;
        }
    }
}

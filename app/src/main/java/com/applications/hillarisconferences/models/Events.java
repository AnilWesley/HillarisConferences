package com.applications.hillarisconferences.models;

import java.io.Serializable;
import java.util.List;

public class Events implements Serializable {


    /**
     * status : true
     * total_pages : 1
     * conferences : [{"id":"60","conf_type":"webinar","short_name":"Trauma, Emergency Medicine & Critical Care 2020","city":"Rome","country":"Italy","subject":"Medicine","start_date":"2020-09-17","end_date":"2020-09-18","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/trauma-growth-60-60.jpg"},{"id":"66","conf_type":"webinar","short_name":"Heart Diseases and Heart Failure 2020","city":"Rome","country":"Italy","subject":"Cardiology","start_date":"2020-09-17","end_date":"2020-09-18","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/heartbeat-blackboard-595x240-66-66.jpg"},{"id":"136","conf_type":"webinar","short_name":"Diabetes & Endocrinology","city":"Rome","country":"Italy","subject":"Diabetes & Endocrinology","start_date":"2020-09-17","end_date":"2020-09-18","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/diabetes-and-endocrinology300x150-136-136.jpg"},{"id":"57","conf_type":"webinar","short_name":"World Dentistry Meet 2020","city":"New York","country":"USA","subject":"Dental","start_date":"2020-09-21","end_date":"2020-09-22","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/dentist-dentistry-57-57.jpg"},{"id":"160","conf_type":"webinar","short_name":"Nursing Summit 2020","city":"New York","country":"USA","subject":"Nursing","start_date":"2020-09-21","end_date":"2020-09-22","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/advanced-nursing-2019-160-160.jpg"},{"id":"2","conf_type":"webinar","short_name":"Diabetes World 2020","city":"New York","country":"USA","subject":"Diabetes & Endocrinology","start_date":"2020-09-23","end_date":"2020-09-24","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/diabetes-conferences-hilaris-2.jpg"},{"id":"4","conf_type":"webinar","short_name":"Obesity and Eating Disorders","city":"New York","country":"USA","subject":"Obesity","start_date":"2020-09-23","end_date":"2020-09-24","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/obesity-conferences-hilaris-4.jpg"},{"id":"99","conf_type":"webinar","short_name":"Women's Health & Breast Cancer","city":"New York","country":"USA","subject":"Oncology","start_date":"2020-09-23","end_date":"2020-09-24","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/breastfeeding-and-breast-cancer-99-99.jpg"},{"id":"163","conf_type":"webinar","short_name":"Maternal, Infant and Child Health 2020","city":"New York","country":"USA","subject":"Gynecology & Reproductive Medicine","start_date":"2020-09-23","end_date":"2020-09-24","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/maternal-163-163.png"},{"id":"9","conf_type":"webinar","short_name":"Pediatrics & Neonatology 2020","city":"New York","country":"USA","subject":"Pediatrics","start_date":"2020-10-07","end_date":"2020-10-08","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/pedianeoconicon-9.jpg"},{"id":"52","conf_type":"webinar","short_name":"Infectious Diseases and Control 2020","city":"Zurich","country":"Switzerland","subject":"Infectious Diseases","start_date":"2020-10-07","end_date":"2020-10-08","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/disease-52-52.jpg"},{"id":"142","conf_type":"webinar","short_name":"Antibiotics: Discovery & Development","city":"New York","country":"USA","subject":"Immunology","start_date":"2020-10-07","end_date":"2020-10-08","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/antibiotics-discovery-development-300x150-142-142.jpg"},{"id":"169","conf_type":"webinar","short_name":"COPD & Lungs 2020","city":"New York","country":"USA","subject":"Pulmonology","start_date":"2020-10-07","end_date":"2020-10-08","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/lungcancer-conference-169.jpg"},{"id":"50","conf_type":"webinar","short_name":"Cardiology & Cardiac Surgery 2020","city":"New York","country":"USA","subject":"Cardiology","start_date":"2020-10-09","end_date":"2020-10-10","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/doctor-with-digital-heart-blueprint-50-50.jpg"},{"id":"110","conf_type":"webinar","short_name":"World Pathology Congress","city":"New York","country":"USA","subject":"Pathology","start_date":"2020-10-09","end_date":"2020-10-10","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/pathologyconference-110-110.jpg"},{"id":"141","conf_type":"webinar","short_name":"Vaccine & Immunotherapy Summit","city":"Brussels","country":"Belgium","subject":"Immunology","start_date":"2020-10-14","end_date":"2020-10-15","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/vaccines300x150-141-141.jpg"},{"id":"76","conf_type":"webinar","short_name":"Cell & Tissue Congress 2020","city":"San Francisco","country":"USA","subject":"Medicine","start_date":"2020-10-22","end_date":"2020-10-23","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/woundcare-76-76.jpg"},{"id":"145","conf_type":"webinar","short_name":"World Brain Congress","city":"San Francisco","country":"USA","subject":"Neuroscience","start_date":"2020-10-22","end_date":"2020-10-23","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/brain-disorder-management300x150-145-145.jpg"},{"id":"189","conf_type":"webinar","short_name":"Stem Cell & Regenerative Medicine","city":"San Francisco","country":"USA","subject":"Genetics & Molecular Biology","start_date":"2020-10-22","end_date":"2020-10-23","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/stem-cells-conference-189.jpg"},{"id":"17","conf_type":"webinar","short_name":"Cancer Meet 2020","city":"San Francisco","country":"USA","subject":"Oncology","start_date":"2020-10-26","end_date":"2020-10-27","icon_url":null},{"id":"55","conf_type":"webinar","short_name":"Clinical Cardiology","city":"San Francisco","country":"USA","subject":"Cardiology","start_date":"2020-10-26","end_date":"2020-10-27","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/cccmjounralhead-55-55.jpg"},{"id":"98","conf_type":"webinar","short_name":"Aging & Disease","city":"San Francisco","country":"USA","subject":"Medical Ethics & Health Policies","start_date":"2020-10-26","end_date":"2020-10-27","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/aging-disease-geritrics-nursing-conference-98-98.jpg"},{"id":"63","conf_type":"webinar","short_name":"Clinical Pediatrics 2020","city":"San Francisco","country":"USA","subject":"Pediatrics","start_date":"2020-10-28","end_date":"2020-10-29","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/clinical-pediatric-conferences-63-63.jpg"},{"id":"83","conf_type":"webinar","short_name":"Pain Medicine and Pain Management 2020","city":"Chicago","country":"USA","subject":"Healthcare Management","start_date":"2020-10-28","end_date":"2020-10-29","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/pain-management-treat-83-83.png"},{"id":"152","conf_type":"webinar","short_name":"Endocrinology Summit 2020","city":"San Francisco","country":"USA","subject":"Diabetes & Endocrinology","start_date":"2020-10-28","end_date":"2020-10-29","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/diabetes-endocrinology-2-300x150-152-152.jpg"},{"id":"14","conf_type":"webinar","short_name":"Ophthalmology  & Optometry 2020","city":"New York","country":"USA","subject":"Ophthalmology","start_date":"2020-11-05","end_date":"2020-11-06","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/ophthalmology-conferences-2019-14.jpg"},{"id":"104","conf_type":"webinar","short_name":"Advances in Clinical Research & Clinical Trials 2020","city":"San Francisco","country":"USA","subject":"Pharmaceutical Sciences","start_date":"2020-11-05","end_date":"2020-11-06","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/clinical-trials-clinical-research-conference-104-104.jpg"},{"id":"147","conf_type":"webinar","short_name":"Advanced Nursing","city":"San Francisco","country":"USA","subject":"Nursing","start_date":"2020-11-05","end_date":"2020-11-06","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/nursing300x150-147-147.jpg"},{"id":"159","conf_type":"webinar","short_name":"Photonics: Optics, Lasers & Imaging","city":"New York","country":"USA","subject":"Physics","start_date":"2020-11-05","end_date":"2020-11-06","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/laser-optics-photonics-159-159.jpg"},{"id":"123","conf_type":"webinar","short_name":"World Biotechnology Congress 2020","city":"Barcelona","country":"Spain","subject":"Genetics & Molecular Biology","start_date":"2020-11-18","end_date":"2020-11-19","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/d6bjicd-123.jpg"},{"id":"23","conf_type":"webinar","short_name":"Cardiology Summit China","city":"Beijing","country":"China","subject":"Cardiology","start_date":"2020-11-23","end_date":"2020-11-24","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/conference-icon-23.gif"},{"id":"37","conf_type":"webinar","short_name":"Climate Change Summit","city":"Hong Kong","country":"China","subject":"Environmental Sciences & Engineering","start_date":"2020-11-23","end_date":"2020-11-24","icon_url":"https://s3.amazonaws.com/hilaris/conf_icons/maxresdefault-37.jpg"}]
     */

    private boolean status;
    private String total_pages;
    private List<ConferencesBean> conferences;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(String total_pages) {
        this.total_pages = total_pages;
    }

    public List<ConferencesBean> getConferences() {
        return conferences;
    }

    public void setConferences(List<ConferencesBean> conferences) {
        this.conferences = conferences;
    }

    public static class ConferencesBean {
        /**
         * id : 60
         * conf_type : webinar
         * short_name : Trauma, Emergency Medicine & Critical Care 2020
         * city : Rome
         * country : Italy
         * subject : Medicine
         * start_date : 2020-09-17
         * end_date : 2020-09-18
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

        public String getIcon_url() {
            return icon_url;
        }

        public void setIcon_url(String icon_url) {
            this.icon_url = icon_url;
        }
    }
}

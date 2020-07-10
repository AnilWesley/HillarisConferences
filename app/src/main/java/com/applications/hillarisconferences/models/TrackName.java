package com.applications.hillarisconferences.models;

import java.util.List;

public class TrackName {


    /**
     * status : true
     * tracks : [{"track_id":"617","track_name":"Heart Diseases"},{"track_id":"618","track_name":"Heart Failure"},{"track_id":"619","track_name":"Hypertension"},{"track_id":"620","track_name":"Molecular cardiology"},{"track_id":"621","track_name":"Pediatric Cardiology"},{"track_id":"622","track_name":"Cardio metabolic Health"},{"track_id":"623","track_name":"Interventional Cardiology"},{"track_id":"624","track_name":"cardiovascular Medicine"},{"track_id":"625","track_name":"Nuclear Cardiology"},{"track_id":"626","track_name":"Cardio-oncology"},{"track_id":"627","track_name":"Neuron-cardiology"},{"track_id":"628","track_name":"Heart diseases in Women"},{"track_id":"629","track_name":"Geriatric Cardiology"},{"track_id":"630","track_name":"Artificial Intelligence in Cardiology"},{"track_id":"631","track_name":"Cardiac Nursing"},{"track_id":"632","track_name":"Cardiac diagnostic tests"},{"track_id":"633","track_name":"Cardiac Surgery"},{"track_id":"634","track_name":"Cardiac Regeneration "},{"track_id":"635","track_name":"Heart Diagnosis & Devices"}]
     */

    private boolean status;
    private List<TracksBean> tracks;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<TracksBean> getTracks() {
        return tracks;
    }

    public void setTracks(List<TracksBean> tracks) {
        this.tracks = tracks;
    }

    public static class TracksBean {
        /**
         * track_id : 617
         * track_name : Heart Diseases
         */

        private String track_id;
        private String track_name;

        public String getTrack_id() {
            return track_id;
        }

        public void setTrack_id(String track_id) {
            this.track_id = track_id;
        }

        public String getTrack_name() {
            return track_name;
        }

        public void setTrack_name(String track_name) {
            this.track_name = track_name;
        }

        @Override
        public String toString() {
            return "TracksBean{" +
                    "track_name='" + track_name + '\'' +
                    '}';
        }
    }

}

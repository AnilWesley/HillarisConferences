package com.applications.hillaris.models;

import java.util.List;

public class Sessions {


    /**
     * status : true
     * tracks : [{"id":"134","track_name":"Rise of Artificial Intelligence","description":"","sub_tracks":[{"sub_track_name":"Rise of Artificial Intelligence"}]}]
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
         * id : 134
         * track_name : Rise of Artificial Intelligence
         * description :
         * sub_tracks : [{"sub_track_name":"Rise of Artificial Intelligence"}]
         */

        private String id;
        private String track_name;
        private String description;
        private List<SubTracksBean> sub_tracks;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTrack_name() {
            return track_name;
        }

        public void setTrack_name(String track_name) {
            this.track_name = track_name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public List<SubTracksBean> getSub_tracks() {
            return sub_tracks;
        }

        public void setSub_tracks(List<SubTracksBean> sub_tracks) {
            this.sub_tracks = sub_tracks;
        }

        public static class SubTracksBean {
            /**
             * sub_track_name : Rise of Artificial Intelligence
             */

            private String sub_track_name;

            public String getSub_track_name() {
                return sub_track_name;
            }

            public void setSub_track_name(String sub_track_name) {
                this.sub_track_name = sub_track_name;
            }
        }
    }
}

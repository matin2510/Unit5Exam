package nyc.c4q.mustafizurmatin.unit5exam.models;

/**
 * Created by c4q on 2/8/18.
 */

public class Picture {

        /**
         * large : https://randomuser.me/api/portraits/men/54.jpg
         * medium : https://randomuser.me/api/portraits/med/men/54.jpg
         * thumbnail : https://randomuser.me/api/portraits/thumb/men/54.jpg
         */

        private String large;
        private String medium;
        private String thumbnail;


        public String getLarge() {
            return large;
        }

        public void setLarge(String large) {
            this.large = large;
        }

        public String getMedium() {
            return medium;
        }

        public void setMedium(String medium) {
            this.medium = medium;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }
    }



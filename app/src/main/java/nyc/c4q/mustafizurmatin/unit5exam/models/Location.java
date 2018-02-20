package nyc.c4q.mustafizurmatin.unit5exam.models;

/**
 * Created by c4q on 2/8/18.
 */

public class Location {

        /**
         * street : 5030 homestead rd
         * city : fremont
         * state : nebraska
         * postcode : 66926
         */

        private String street;
        private String city;
        private String state;
        private int postcode;

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getPostcode() {
            return postcode;
        }

        public void setPostcode(int postcode) {
            this.postcode = postcode;
        }
    }


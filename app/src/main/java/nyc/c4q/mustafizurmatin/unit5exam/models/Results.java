package nyc.c4q.mustafizurmatin.unit5exam.models;

import java.io.Serializable;

/**
 * Created by c4q on 2/8/18.
 */

public class Results implements Serializable {


        /**
         * name : {"title":"mr","first":"freddie","last":"shelton"}
         * location : {"street":"5030 homestead rd","city":"fremont","state":"nebraska","postcode":66926}
         * email : freddie.shelton@example.com
         * dob : 1957-02-14 00:22:27
         * cell : (441)-417-7834
         * picture : {"large":"https://randomuser.me/api/portraits/men/54.jpg","medium":"https://randomuser.me/api/portraits/med/men/54.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/54.jpg"}
         */

        private NameBean name;
        private Location location;
        private String email;
        private String dob;
        private String cell;
        private Picture picture;

        public NameBean getName() {
            return name;
        }

        public void setName(NameBean name) {
            this.name = name;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getDob() {
            return dob;
        }

        public void setDob(String dob) {
            this.dob = dob;
        }

        public String getCell() {
            return cell;
        }

        public void setCell(String cell) {
            this.cell = cell;
        }

        public Picture getPicture() {
            return picture;
        }

        public void setPicture(Picture picture) {
            this.picture = picture;
        }

    }

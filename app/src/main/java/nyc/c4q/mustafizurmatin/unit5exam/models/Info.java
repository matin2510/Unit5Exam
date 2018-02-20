package nyc.c4q.mustafizurmatin.unit5exam.models;

/**
 * Created by c4q on 2/8/18.
 */


    public class Info {
        /**
         * seed : 429d9b9de047f66e
         * results : 20
         * page : 1
         * version : 1.1
         */

        private String seed;
        private int results;
        private int page;
        private String version;

        public String getSeed() {
            return seed;
        }

        public void setSeed(String seed) {
            this.seed = seed;
        }

        public int getResults() {
            return results;
        }

        public void setResults(int results) {
            this.results = results;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

}

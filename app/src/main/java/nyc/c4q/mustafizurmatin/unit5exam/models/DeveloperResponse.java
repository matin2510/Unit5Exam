package nyc.c4q.mustafizurmatin.unit5exam.models;

import java.util.List;

/**
 * Created by c4q on 2/7/18.
 */

public class DeveloperResponse {


    /**
     * results : [{"name":{"title":"mr","first":"freddie","last":"shelton"},"location":{"street":"5030 homestead rd","city":"fremont","state":"nebraska","postcode":66926},"email":"freddie.shelton@example.com","dob":"1957-02-14 00:22:27","cell":"(441)-417-7834","picture":{"large":"https://randomuser.me/api/portraits/men/54.jpg","medium":"https://randomuser.me/api/portraits/med/men/54.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/54.jpg"}},{"name":{"title":"miss","first":"sophie","last":"obrien"},"location":{"street":"3974 hogan st","city":"lewiston","state":"south dakota","postcode":35313},"email":"sophie.obrien@example.com","dob":"1988-05-15 04:25:30","cell":"(567)-227-6563","picture":{"large":"https://randomuser.me/api/portraits/women/95.jpg","medium":"https://randomuser.me/api/portraits/med/women/95.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/women/95.jpg"}},{"name":{"title":"mr","first":"gabe","last":"lopez"},"location":{"street":"4819 royal ln","city":"pembroke pines","state":"utah","postcode":41267},"email":"gabe.lopez@example.com","dob":"1972-04-11 16:51:02","cell":"(969)-360-1216","picture":{"large":"https://randomuser.me/api/portraits/men/70.jpg","medium":"https://randomuser.me/api/portraits/med/men/70.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/70.jpg"}},{"name":{"title":"mrs","first":"denise","last":"barrett"},"location":{"street":"5766 stevens creek blvd","city":"manchester","state":"louisiana","postcode":15221},"email":"denise.barrett@example.com","dob":"1993-10-07 16:42:43","cell":"(227)-892-1267","picture":{"large":"https://randomuser.me/api/portraits/women/87.jpg","medium":"https://randomuser.me/api/portraits/med/women/87.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/women/87.jpg"}},{"name":{"title":"mrs","first":"becky","last":"reid"},"location":{"street":"9385 e north st","city":"lousville","state":"california","postcode":43112},"email":"becky.reid@example.com","dob":"1945-05-02 08:26:17","cell":"(905)-227-1615","picture":{"large":"https://randomuser.me/api/portraits/women/41.jpg","medium":"https://randomuser.me/api/portraits/med/women/41.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/women/41.jpg"}},{"name":{"title":"miss","first":"jane","last":"lawson"},"location":{"street":"4206 dogwood ave","city":"iowa park","state":"montana","postcode":70844},"email":"jane.lawson@example.com","dob":"1950-03-03 21:38:38","cell":"(790)-829-9999","picture":{"large":"https://randomuser.me/api/portraits/women/33.jpg","medium":"https://randomuser.me/api/portraits/med/women/33.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/women/33.jpg"}},{"name":{"title":"mr","first":"isaiah","last":"gibson"},"location":{"street":"9087 timber wolf trail","city":"long beach","state":"minnesota","postcode":84991},"email":"isaiah.gibson@example.com","dob":"1970-09-16 06:53:10","cell":"(749)-581-9174","picture":{"large":"https://randomuser.me/api/portraits/men/86.jpg","medium":"https://randomuser.me/api/portraits/med/men/86.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/86.jpg"}},{"name":{"title":"mr","first":"andrew","last":"barnett"},"location":{"street":"5375 marsh ln","city":"san mateo","state":"arizona","postcode":61694},"email":"andrew.barnett@example.com","dob":"1959-07-21 06:44:17","cell":"(927)-770-9757","picture":{"large":"https://randomuser.me/api/portraits/men/48.jpg","medium":"https://randomuser.me/api/portraits/med/men/48.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/48.jpg"}},{"name":{"title":"miss","first":"sue","last":"jackson"},"location":{"street":"7740 fincher rd","city":"surprise","state":"california","postcode":34938},"email":"sue.jackson@example.com","dob":"1993-02-20 02:04:43","cell":"(362)-686-1334","picture":{"large":"https://randomuser.me/api/portraits/women/67.jpg","medium":"https://randomuser.me/api/portraits/med/women/67.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/women/67.jpg"}},{"name":{"title":"mrs","first":"valerie","last":"hayes"},"location":{"street":"4359 samaritan dr","city":"arvada","state":"indiana","postcode":61993},"email":"valerie.hayes@example.com","dob":"1962-01-02 10:43:50","cell":"(161)-813-0613","picture":{"large":"https://randomuser.me/api/portraits/women/43.jpg","medium":"https://randomuser.me/api/portraits/med/women/43.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/women/43.jpg"}},{"name":{"title":"mr","first":"carter","last":"willis"},"location":{"street":"7781 oak lawn ave","city":"fountain valley","state":"alaska","postcode":53796},"email":"carter.willis@example.com","dob":"1989-03-12 19:25:47","cell":"(861)-377-1592","picture":{"large":"https://randomuser.me/api/portraits/men/14.jpg","medium":"https://randomuser.me/api/portraits/med/men/14.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/14.jpg"}},{"name":{"title":"miss","first":"natalie","last":"montgomery"},"location":{"street":"8007 royal ln","city":"edgewood","state":"south dakota","postcode":32142},"email":"natalie.montgomery@example.com","dob":"1974-12-28 21:41:02","cell":"(374)-590-4569","picture":{"large":"https://randomuser.me/api/portraits/women/21.jpg","medium":"https://randomuser.me/api/portraits/med/women/21.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/women/21.jpg"}},{"name":{"title":"mr","first":"ted","last":"harrison"},"location":{"street":"4620 washington ave","city":"rialto","state":"hawaii","postcode":71742},"email":"ted.harrison@example.com","dob":"1978-08-13 22:36:48","cell":"(442)-954-7970","picture":{"large":"https://randomuser.me/api/portraits/men/96.jpg","medium":"https://randomuser.me/api/portraits/med/men/96.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/96.jpg"}},{"name":{"title":"mr","first":"willard","last":"west"},"location":{"street":"5848 mockingbird ln","city":"coppell","state":"colorado","postcode":88289},"email":"willard.west@example.com","dob":"1995-03-07 20:39:31","cell":"(224)-173-4442","picture":{"large":"https://randomuser.me/api/portraits/men/5.jpg","medium":"https://randomuser.me/api/portraits/med/men/5.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/5.jpg"}},{"name":{"title":"mr","first":"steve","last":"richards"},"location":{"street":"9025 photinia ave","city":"hampton","state":"louisiana","postcode":90289},"email":"steve.richards@example.com","dob":"1949-05-29 23:23:29","cell":"(880)-341-5739","picture":{"large":"https://randomuser.me/api/portraits/men/46.jpg","medium":"https://randomuser.me/api/portraits/med/men/46.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/46.jpg"}},{"name":{"title":"mr","first":"ethan","last":"wilson"},"location":{"street":"5359 spring st","city":"orange","state":"wisconsin","postcode":91217},"email":"ethan.wilson@example.com","dob":"1962-02-16 17:41:10","cell":"(187)-454-4225","picture":{"large":"https://randomuser.me/api/portraits/men/13.jpg","medium":"https://randomuser.me/api/portraits/med/men/13.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/13.jpg"}},{"name":{"title":"mrs","first":"loretta","last":"payne"},"location":{"street":"4926 washington ave","city":"stamford","state":"north carolina","postcode":13743},"email":"loretta.payne@example.com","dob":"1962-10-23 05:02:33","cell":"(646)-276-1587","picture":{"large":"https://randomuser.me/api/portraits/women/24.jpg","medium":"https://randomuser.me/api/portraits/med/women/24.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/women/24.jpg"}},{"name":{"title":"mr","first":"dennis","last":"smith"},"location":{"street":"1038 timber wolf trail","city":"des moines","state":"new mexico","postcode":60870},"email":"dennis.smith@example.com","dob":"1948-05-02 20:32:27","cell":"(816)-201-2536","picture":{"large":"https://randomuser.me/api/portraits/men/48.jpg","medium":"https://randomuser.me/api/portraits/med/men/48.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/48.jpg"}},{"name":{"title":"mr","first":"marshall","last":"moore"},"location":{"street":"7852 spring st","city":"honolulu","state":"california","postcode":81856},"email":"marshall.moore@example.com","dob":"1952-11-11 20:06:11","cell":"(184)-522-3384","picture":{"large":"https://randomuser.me/api/portraits/men/31.jpg","medium":"https://randomuser.me/api/portraits/med/men/31.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/men/31.jpg"}},{"name":{"title":"ms","first":"addison","last":"prescott"},"location":{"street":"7920 dane st","city":"des moines","state":"ohio","postcode":31332},"email":"addison.prescott@example.com","dob":"1972-01-29 21:16:17","cell":"(037)-142-9050","picture":{"large":"https://randomuser.me/api/portraits/women/90.jpg","medium":"https://randomuser.me/api/portraits/med/women/90.jpg","thumbnail":"https://randomuser.me/api/portraits/thumb/women/90.jpg"}}]
     * info : {"seed":"429d9b9de047f66e","results":20,"page":1,"version":"1.1"}
     */

    private Info info;
    private List<Results> results;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }




}
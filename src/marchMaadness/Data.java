package marchMaadness;

import java.util.HashMap;
/* data taken from - https://www.reddit.com/r/CollegeBasketball/comments/1bi0j24/2024_march_madness_probability_table /*/
public class Data {
    public HashMap<String, Double> getEastRound1()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("UConn (1)", .995);
        u.put("Stetson (16)", .005);
        u.put("FAU (8)", .655);
        u.put("Northwestern (9)", .345);
        u.put("SDSU (5)", .781);
        u.put("UAB (12)", .219);
        u.put("Auburn (4)", .858);
        u.put("Yale (13)", .142);
        u.put("BYU (6)", .764);
        u.put("Duquesne (11)", .236);
        u.put("Illinois (3)", .918);
        u.put("Morehead St. (14)", .082);
        u.put("Washington St. (7)", .438);
        u.put("Drake (10)", .562);
        u.put("Iowa St. (2)", .947);
        u.put("South Dakota St. (15)", .053);
        return u;
    }
    public HashMap<String, Double> getEastRound2()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("UConn (1)", .894);
        u.put("Stetson (16)", .001);
        u.put("FAU (8)", .082);
        u.put("Northwestern (9)", .023);
        u.put("SDSU (5)", .315);
        u.put("UAB (12)", .040);
        u.put("Auburn (4)", .598);
        u.put("Yale (13)", .047);
        u.put("BYU (6)", .298);
        u.put("Duquesne (11)", .044);
        u.put("Illinois (3)", .639);
        u.put("Morehead St. (14)", .019);
        u.put("Washington St. (7)", .096);
        u.put("Drake (10)", .147);
        u.put("Iowa St. (2)", .744);
        u.put("South Dakota St. (15)", .012);
        return u;
    }
    public HashMap<String, Double> getEastSweet16()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("UConn (1)", .627);
        u.put("Stetson (16)", .009);
        u.put("FAU (8)", .017);
        u.put("Northwestern (9)", .018);
        u.put("SDSU (5)", .043);
        u.put("UAB (12)", .001);
        u.put("Auburn (4)", .290);
        u.put("Yale (13)", .005);
        u.put("BYU (6)", .156);
        u.put("Duquesne (11)", .009);
        u.put("Illinois (3)", .273);
        u.put("Morehead St. (14)", .003);
        u.put("Washington St. (7)", .037);
        u.put("Drake (10)", .033);
        u.put("Iowa St. (2)", .489);
        u.put("South Dakota St. (15)", .001);
        return u;
    }
    public HashMap<String, Double> getEastElite8() {
        HashMap<String, Double> u = new HashMap<>();
        u.put("UConn (1)", .462);
        u.put("Stetson (16)", .008);
        u.put("FAU (8)", .005);
        u.put("Northwestern (9)", .006);
        u.put("SDSU (5)", .015);
        u.put("UAB (12)", .0009);
        u.put("Auburn (4)", .177);
        u.put("Yale (13)", .001);
        u.put("BYU (6)", .042);
        u.put("Duquesne (11)", .001);
        u.put("Illinois (3)", .087);
        u.put("Morehead St. (14)", .002);
        u.put("Washington St. (7)", .006);
        u.put("Drake (10)", .005);
        u.put("Iowa St. (2)", .193);
        u.put("South Dakota St. (15)", .00099);
        return u;
    }
    public HashMap<String, Double> getEastFinal4() {
        HashMap<String, Double> u = new HashMap<>();
        u.put("UConn (1)", .311);
        u.put("Stetson (16)", .007);
        u.put("FAU (8)", .001);
        u.put("Northwestern (9)", .002);
        u.put("SDSU (5)", .006);
        u.put("UAB (12)", .0008);
        u.put("Auburn (4)", .105);
        u.put("Yale (13)", .0009);
        u.put("BYU (6)", .018);
        u.put("Duquesne (11)", .0009);
        u.put("Illinois (3)", .041);
        u.put("Morehead St. (14)", .001);
        u.put("Washington St. (7)", .002);
        u.put("Drake (10)", .001);
        u.put("Iowa St. (2)", .108);
        u.put("South Dakota St. (15)", .00098);
        return u;
    }
    public HashMap<String, Double> getEastChamp() {
        HashMap<String, Double> u = new HashMap<>();
        u.put("UConn (1)", .182);
        u.put("Stetson (16)", .006);
        u.put("FAU (8)", .0099);
        u.put("Northwestern (9)", .001);
        u.put("SDSU (5)", .002);
        u.put("UAB (12)", .0008);
        u.put("Auburn (4)", .053);
        u.put("Yale (13)", .0099);
        u.put("BYU (6)", .006);
        u.put("Duquesne (11)", .0008);
        u.put("Illinois (3)", .016);
        u.put("Morehead St. (14)", .001);
        u.put("Washington St. (7)", .005);
        u.put("Drake (10)", .004);
        u.put("Iowa St. (2)", .051);
        u.put("South Dakota St. (15)", .00098);
        return u;
    }
    public HashMap<String, Double> getWestRound1()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("North Carolina (1)", .991);
        u.put("Wagner (16)", .04);
        u.put("Mississippi St. (8)", .442);
        u.put("MSU (9)", .558);
        u.put("Saint Mary's (5)", .712);
        u.put("Grand Canyon (12)", .288);
        u.put("Alabama (4)", .846);
        u.put("Charleston (13)", .154);
        u.put("Clemson (6)", .493);
        u.put("New Mexico (11)", .507);
        u.put("Baylor (3)", .90);
        u.put("Colgate (14)", .10);
        u.put("Dayton (7)", .530);
        u.put("Nevada (10)", .470);
        u.put("Arizona (2)", .970);
        u.put("Long Beach St. (15)", .030);
        return u;
    }
    public HashMap<String, Double> getWestRound2()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("North Carolina (1)", .702);
        u.put("Wagner (16)", .09);
        u.put("Mississippi St. (8)", .118);
        u.put("MSU (9)", .180);
        u.put("Saint Mary's (5)", .354);
        u.put("Grand Canyon (12)", .087);
        u.put("Alabama (4)", .522);
        u.put("Charleston (13)", .037);
        u.put("Clemson (6)", .202);
        u.put("New Mexico (11)", .216);
        u.put("Baylor (3)", .565);
        u.put("Colgate (14)", .017);
        u.put("Dayton (7)", .145);
        u.put("Nevada (10)", .113);
        u.put("Arizona (2)", .739);
        u.put("Long Beach St. (15)", .04);
        return u;
    }
    public HashMap<String, Double> getWestSweet16()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("North Carolina (1)", .402);
        u.put("Wagner (16)", .001);
        u.put("Mississippi St. (8)", .049);
        u.put("MSU (9)", .082);
        u.put("Saint Mary's (5)", .171);
        u.put("Grand Canyon (12)", .022);
        u.put("Alabama (4)", .268);
        u.put("Charleston (13)", .006);
        u.put("Clemson (6)", .063);
        u.put("New Mexico (11)", .068);
        u.put("Baylor (3)", .243);
        u.put("Colgate (14)", .001);
        u.put("Dayton (7)", .059);
        u.put("Nevada (10)", .045);
        u.put("Arizona (2)", .521);
        u.put("Long Beach St. (15)", .001);
        return u;
    }
    public HashMap<String, Double> getWestElite8()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("North Carolina (1)", .204);
        u.put("Wagner (16)", .0099);
        u.put("Mississippi St. (8)", .017);
        u.put("MSU (9)", .032);
        u.put("Saint Mary's (5)", .078);
        u.put("Grand Canyon (12)", .005);
        u.put("Alabama (4)", .127);
        u.put("Charleston (13)", .001);
        u.put("Clemson (6)", .022);
        u.put("New Mexico (11)", .026);
        u.put("Baylor (3)", .122);
        u.put("Colgate (14)", .0009);
        u.put("Dayton (7)", .020);
        u.put("Nevada (10)", .015);
        u.put("Arizona (2)", .331);
        u.put("Long Beach St. (15)", .0099);
        return u;
    }
    public HashMap<String, Double> getWestFinal4()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("North Carolina (1)", .078);
        u.put("Wagner (16)", .0098);
        u.put("Mississippi St. (8)", .004);
        u.put("MSU (9)", .010);
        u.put("Saint Mary's (5)", .025);
        u.put("Grand Canyon (12)", .001);
        u.put("Alabama (4)", .046);
        u.put("Charleston (13)", .0099);
        u.put("Clemson (6)", .001);
        u.put("New Mexico (11)", .007);
        u.put("Baylor (3)", .043);
        u.put("Colgate (14)", .00089);
        u.put("Dayton (7)", .005);
        u.put("Nevada (10)", .003);
        u.put("Arizona (2)", .181);
        u.put("Long Beach St. (15)", .0098);
        return u;
    }
    public HashMap<String, Double> getWestChamps()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("North Carolina (1)", .030);
        u.put("Wagner (16)", .0097);
        u.put("Mississippi St. (8)", .001);
        u.put("MSU (9)", .003);
        u.put("Saint Mary's (5)", .008);
        u.put("Grand Canyon (12)", .0099);
        u.put("Alabama (4)", .017);
        u.put("Charleston (13)", .0098);
        u.put("Clemson (6)", .0099);
        u.put("New Mexico (11)", .002);
        u.put("Baylor (3)", .015);
        u.put("Colgate (14)", .00088);
        u.put("Dayton (7)", .001);
        u.put("Nevada (10)", .001);
        u.put("Arizona (2)", .099);
        u.put("Long Beach St. (15)", .0097);
        return u;
    }
    public HashMap<String, Double> getMidWestRound1()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("Purdue (1)", .995);
        u.put("Grambling St. (16)", .010);
        u.put("Utah St. (8)", .395);
        u.put("TCU (9)", .605);
        u.put("Gonzaga (5)", .739);
        u.put("McNeese (12)", .261);
        u.put("Kansas (4)", .761);
        u.put("Samford (13)", .239);
        u.put("South Carolina (6)", .535);
        u.put("Oregon (11)", .465);
        u.put("Creighton (3)", .875);
        u.put("Akron (14)", .125);
        u.put("Texas (7)", .640);
        u.put("Colorado St. (10)", .205);
        u.put("Tennessee (2)", .970);
        u.put("Saint Peter's (15)", .030);
        return u;
    }
    public HashMap<String, Double> getMidWestRound2()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("Purdue (1)", .863);
        u.put("Grambling St. (16)", .009);
        u.put("Utah St. (8)", .042);
        u.put("TCU (9)", .095);
        u.put("Gonzaga (5)", .447);
        u.put("McNeese (12)", .097);
        u.put("Kansas (4)", .395);
        u.put("Samford (13)", .062);
        u.put("South Carolina (6)", .173);
        u.put("Oregon (11)", .138);
        u.put("Creighton (3)", .653);
        u.put("Akron (14)", .037);
        u.put("Texas (7)", .215);
        u.put("Colorado St. (10)", .048);
        u.put("Tennessee (2)", .700);
        u.put("Saint Peter's (15)", .003);
        return u;
    }
    public HashMap<String, Double> getMidWestSweet16()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("Purdue (1)", .663);
        u.put("Grambling St. (16)", .008);
        u.put("Utah St. (8)", .015);
        u.put("TCU (9)", .042);
        u.put("Gonzaga (5)", .145);
        u.put("McNeese (12)", .013);
        u.put("Kansas (4)", .114);
        u.put("Samford (13)", .007);
        u.put("South Carolina (6)", .051);
        u.put("Oregon (11)", .035);
        u.put("Creighton (3)", .338);
        u.put("Akron (14)", .004);
        u.put("Texas (7)", .104);
        u.put("Colorado St. (10)", .017);
        u.put("Tennessee (2)", .440);
        u.put("Saint Peter's (15)", .001);
        return u;
    }
    public HashMap<String, Double> getMidWestElite8()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("Purdue (1)", .457);
        u.put("Grambling St. (16)", .007);
        u.put("Utah St. (8)", .004);
        u.put("TCU (9)", .016);
        u.put("Gonzaga (5)", .068);
        u.put("McNeese (12)", .003);
        u.put("Kansas (4)", .048);
        u.put("Samford (13)", .001);
        u.put("South Carolina (6)", .011);
        u.put("Oregon (11)", .007);
        u.put("Creighton (3)", .144);
        u.put("Akron (14)", .001);
        u.put("Texas (7)", .032);
        u.put("Colorado St. (10)", .004);
        u.put("Tennessee (2)", .203);
        u.put("Saint Peter's (15)", .0099);
        return u;
    }
    public HashMap<String, Double> getMidWestFinal4()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("Purdue (1)", .250);
        u.put("Grambling St. (16)", .006);
        u.put("Utah St. (8)", .001);
        u.put("TCU (9)", .004);
        u.put("Gonzaga (5)", .024);
        u.put("McNeese (12)", .001);
        u.put("Kansas (4)", .015);
        u.put("Samford (13)", .0099);
        u.put("South Carolina (6)", .020);
        u.put("Oregon (11)", .001);
        u.put("Creighton (3)", .059);
        u.put("Akron (14)", .0099);
        u.put("Texas (7)", .010);
        u.put("Colorado St. (10)", .001);
        u.put("Tennessee (2)", .090);
        u.put("Saint Peter's (15)", .0098);
        return u;
    }
    public HashMap<String, Double> getMidWestChamps()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("Purdue (1)", .136);
        u.put("Grambling St. (16)", .005);
        u.put("Utah St. (8)", .0099);
        u.put("TCU (9)", .001);
        u.put("Gonzaga (5)", .008);
        u.put("McNeese (12)", .0099);
        u.put("Kansas (4)", .005);
        u.put("Samford (13)", .0098);
        u.put("South Carolina (6)", .0099);
        u.put("Oregon (11)", .0099);
        u.put("Creighton (3)", .024);
        u.put("Akron (14)", .0098);
        u.put("Texas (7)", .003);
        u.put("Colorado St. (10)", .0099);
        u.put("Tennessee (2)", .041);
        u.put("Saint Peter's (15)", .0097);
        return u;
    }
    public HashMap<String, Double> getSouthRound1() {
        HashMap<String, Double> u = new HashMap<>();
        u.put("Houston (1)", .984);
        u.put("Longwood (16)", .016);
        u.put("Nebraska (8)", .553);
        u.put("Texas A&M (9)", .447);
        u.put("Wisconsin (5)", .70);
        u.put("James Madison (12)", .30);
        u.put("Duke (4)", .864);
        u.put("Vermont (13)", .136);
        u.put("Texas Tech (6)", .648);
        u.put("NC State (11)", .352);
        u.put("Kentucky (3)", .866);
        u.put("Oakland (14)", .134);
        u.put("Florida (7)", .568);
        u.put("Colorado (10)", .249);
        u.put("Marquette (2)", .914);
        u.put("Western Ky. (15)", .086);
        return u;
    }
    public HashMap<String, Double> getSouthRound2()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("Houston (1)", .842);
        u.put("Longwood (16)", .002);
        u.put("Nebraska (8)", .095);
        u.put("Texas A&M (9)", .061);
        u.put("Wisconsin (5)", .312);
        u.put("James Madison (12)", .081);
        u.put("Duke (4)", .572);
        u.put("Vermont (13)", .035);
        u.put("Texas Tech (6)", .333);
        u.put("NC State (11)", .132);
        u.put("Kentucky (3)", .510);
        u.put("Oakland (14)", .025);
        u.put("Florida (7)", .235);
        u.put("Colorado (10)", .092);
        u.put("Marquette (2)", .598);
        u.put("Western Ky. (15)", .014);
        return u;
    }
    public HashMap<String, Double> getSouthSweet16()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("Houston (1)", .667);
        u.put("Longwood (16)", .001);
        u.put("Nebraska (8)", .039);
        u.put("Texas A&M (9)", .023);
        u.put("Wisconsin (5)", .075);
        u.put("James Madison (12)", .009);
        u.put("Duke (4)", .184);
        u.put("Vermont (13)", .002);
        u.put("Texas Tech (6)", .159);
        u.put("NC State (11)", .040);
        u.put("Kentucky (3)", .242);
        u.put("Oakland (14)", .003);
        u.put("Florida (7)", .119);
        u.put("Colorado (10)", .041);
        u.put("Marquette (2)", .368);
        u.put("Western Ky. (15)", .002);
        return u;
    }
    public HashMap<String, Double> getSouthElite8()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("Houston (1)", .545);
        u.put("Longwood (16)", .0099);
        u.put("Nebraska (8)", .017);
        u.put("Texas A&M (9)", .010);
        u.put("Wisconsin (5)", .039);
        u.put("James Madison (12)", .002);
        u.put("Duke (4)", .112);
        u.put("Vermont (13)", .001);
        u.put("Texas Tech (6)", .043);
        u.put("NC State (11)", .006);
        u.put("Kentucky (3)", .064);
        u.put("Oakland (14)", .001);
        u.put("Florida (7)", .027);
        u.put("Colorado (10)", .009);
        u.put("Marquette (2)", .121);
        u.put("Western Ky. (15)", .001);
        return u;
    }
    public HashMap<String, Double> getSouthFinal4()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("Houston (1)", .365);
        u.put("Longwood (16)", .0098);
        u.put("Nebraska (8)", .005);
        u.put("Texas A&M (9)", .003);
        u.put("Wisconsin (5)", .014);
        u.put("James Madison (12)", .001);
        u.put("Duke (4)", .052);
        u.put("Vermont (13)", .0099);
        u.put("Texas Tech (6)", .014);
        u.put("NC State (11)", .005);
        u.put("Kentucky (3)", .022);
        u.put("Oakland (14)", .0099);
        u.put("Florida (7)", .009);
        u.put("Colorado (10)", .002);
        u.put("Marquette (2)", .053);
        u.put("Western Ky. (15)", .0099);
        return u;
    }
    public HashMap<String, Double> getSouthChamps()
    {
        HashMap<String, Double> u = new HashMap<>();
        u.put("Houston (1)", .231);
        u.put("Longwood (16)", .0098);
        u.put("Nebraska (8)", .002);
        u.put("Texas A&M (9)", .001);
        u.put("Wisconsin (5)", .004);
        u.put("James Madison (12)", .001);
        u.put("Duke (4)", .022);
        u.put("Vermont (13)", .0099);
        u.put("Texas Tech (6)", .004);
        u.put("NC State (11)", .0099);
        u.put("Kentucky (3)", .007);
        u.put("Oakland (14)", .0099);
        u.put("Florida (7)", .003);
        u.put("Colorado (10)", .001);
        u.put("Marquette (2)", .019);
        u.put("Western Ky. (15)", .0099);
        return u;
    }
}

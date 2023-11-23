package test_sp;

import java.util.List;

public class batalion {
    private Integer nr_Creaturi;
    private List<specie> membri;

    public batalion(Integer nr, List<specie> membri) {
        this.membri = membri;
        this.nr_Creaturi = nr;
    }
}

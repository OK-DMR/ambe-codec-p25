package cz.okdmr.mmdvm.model;

import java.io.Serializable;

public class StoredContact implements Serializable {

    public int _id;
    public int dmr_id;
    public boolean is_private = true;
    public String display_name;

}

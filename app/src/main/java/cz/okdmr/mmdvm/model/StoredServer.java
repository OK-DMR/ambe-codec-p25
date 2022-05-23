package cz.okdmr.mmdvm.model;

import java.io.Serializable;

public class StoredServer implements Serializable {

    public int _id;
    public String ip;
    public int port;
    public String password;
    public String callsign;
    public int dmr_id;
    public String display_name;

}

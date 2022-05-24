package cz.okdmr.mmdvm.model;

public class StoredGPSSettings {

    public boolean send_automatically = false;
    public String target_url = "http://portal.ok-dmr.cz/php/gps-api.php";
    public long period_seconds = 60 * 10;
    public int dmr_id = 0;


}

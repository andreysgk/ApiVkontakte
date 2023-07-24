package Pojo;

public class Friends {
    private Integer id;
    private String bdate;
    private String track_code;
    private String first_name;
    private String last_name;
    private Boolean can_access_closed;
    private Boolean is_closed;
    private String deactivated;
    public Friends() {
    }

    public Friends(Integer id, String bdate, String track_code, String first_name, String last_name, Boolean can_access_closed, Boolean is_closed, String deactivated) {
        this.id = id;
        this.bdate = bdate;
        this.track_code = track_code;
        this.first_name = first_name;
        this.last_name = last_name;
        this.can_access_closed = can_access_closed;
        this.is_closed = is_closed;
        this.deactivated = deactivated;
    }

    public Integer getId() {
        return id;
    }

    public String getBdate() {
        return bdate;
    }

    public String getTrack_code() {
        return track_code;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public Boolean getCan_access_closed() {
        return can_access_closed;
    }

    public Boolean getIs_closed() {
        return is_closed;
    }

    public String getDeactivated() {
        return deactivated;
    }
}